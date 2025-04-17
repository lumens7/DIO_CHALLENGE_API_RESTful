package com.lumens.DIO_CHALLENGE.repository;

import com.lumens.DIO_CHALLENGE.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccount_Number(String accountNumber);
}
