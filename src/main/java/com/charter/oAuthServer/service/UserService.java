package com.charter.oAuthServer.service;

import com.charter.oAuthServer.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(Long id);
}