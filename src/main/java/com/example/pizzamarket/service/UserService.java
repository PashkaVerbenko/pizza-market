package com.example.pizzamarket.service;

import com.example.pizzamarket.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User getUser(int id);

    void removeUser(int id);

}
