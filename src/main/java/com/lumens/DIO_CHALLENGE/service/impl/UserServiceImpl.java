package com.lumens.DIO_CHALLENGE.service.impl;

import com.lumens.DIO_CHALLENGE.domain.model.User;
import com.lumens.DIO_CHALLENGE.repository.UserRepository;
import com.lumens.DIO_CHALLENGE.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User userCreate) throws IllegalAccessException {
        if(userRepository.existsByAccount_Number(userCreate.getAccount().getNumber())){
            throw new IllegalAccessException("This Account Number already exists.");
        }
        return userRepository.save(userCreate);
    }
}
