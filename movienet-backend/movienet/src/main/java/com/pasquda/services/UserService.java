package com.pasquda.services;

import com.pasquda.models.User;

public interface UserService {
    Iterable<User> getAllUsers();

    User getUserById(Integer id);

    User saveUser(User user);
}
