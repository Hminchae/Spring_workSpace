package com.thanky.authservice.repository.otp;

import com.thanky.authservice.entity.otp.OtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpJpaRepository extends JpaRepository<OtpEntity, Integer> {
    Optional<OtpEntity> findOtpEntityByUserId(String userId);
}