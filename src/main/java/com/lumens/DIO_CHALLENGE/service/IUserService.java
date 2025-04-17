package com.lumens.DIO_CHALLENGE.service;

import com.lumens.DIO_CHALLENGE.domain.model.User;

import java.util.List;

public interface IUserService {
    User findById(Long id);
    List<User> findAll();

    User create(User userCreate) throws IllegalAccessException;
}
