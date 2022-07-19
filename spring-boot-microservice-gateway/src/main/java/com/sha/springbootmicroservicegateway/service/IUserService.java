package com.sha.springbootmicroservicegateway.service;

import com.sha.springbootmicroservicegateway.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    List<User> findAllUser();
}
