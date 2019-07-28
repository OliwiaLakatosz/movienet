package com.pasquda.services;

import com.pasquda.models.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> getAllUsers();

    User getUserById(Integer id);

    User saveUser(User user);
}
