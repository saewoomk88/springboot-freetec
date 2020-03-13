package com.iu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //처음 가입인지 아닌지 판단하기 위함
    Optional<User> findByEmail(String email);
}
