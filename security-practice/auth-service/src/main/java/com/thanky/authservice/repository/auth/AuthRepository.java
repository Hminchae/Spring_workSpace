package com.thanky.authservice.repository.auth;

import com.thanky.authservice.domain.User;
import com.thanky.authservice.entity.otp.OtpEntity;
import com.thanky.authservice.entity.user.UserEntity;
import com.thanky.authservice.exception.InvalidAuthException;
import com.thanky.authservice.repository.otp.OtpJpaRepository;
import com.thanky.authservice.repository.user.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionOperations;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthRepository { //서비스 레벨에서는 이 레포지토리만 보도록
    private final OtpJpaRepository otpJpaRepository;
    private final UserJpaRepository userJpaRepository;

    private final TransactionOperations readTransactionOperations;
    private final TransactionOperations writeTransactionOperations;

    public User createNewUser(User user) { // 사용자 등록
        return writeTransactionOperations.execute(status -> {
            Optional<UserEntity> userOptional = userJpaRepository.findUserEntityByUserId(user.getUserId());

            if (userOptional.isPresent()) {
                throw new RuntimeException(String.format("User [%s] already exists.", user.getUserId()));
            }

            UserEntity saved = userJpaRepository.save(user.toEntity());

            return saved.toDomain();
        });
    }

    public User getUserByUserId(String userId) {
        return readTransactionOperations.execute(status ->
                userJpaRepository.findUserEntityByUserId(userId)
                    .orElseThrow(InvalidAuthException::new)
                    .toDomain());
    }

    public String getOtp(String userId) {
        return readTransactionOperations.execute(status ->
                otpJpaRepository.findOtpEntityByUserId(userId)
                        .orElseThrow(() -> new RuntimeException(String.format("User [%s] does not exist", userId)))
                        .getOtpCode());
    }

    public void upsertOtp(String userId, String newOtp) {
        writeTransactionOperations.executeWithoutResult(status -> {
            Optional<OtpEntity> otpOptional = otpJpaRepository.findOtpEntityByUserId(userId);

            if (otpOptional.isPresent()) {
                otpOptional.get().renewOtp(newOtp);
            } else {
                otpJpaRepository.save(new OtpEntity(userId, newOtp));
            }
        });
    }
}
