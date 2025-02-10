package com.example.hello.repository;

import com.example.hello.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Null 을 그대로 반환 하는 방법보다 optional 을 선호
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
