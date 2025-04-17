package com.lumens.DIO_CHALLENGE.domain.repository;

import com.lumens.DIO_CHALLENGE.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserREpository extends JpaRepository<User, Long> {
}
