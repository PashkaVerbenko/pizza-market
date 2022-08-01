package com.example.pizzamarket.controller;

import com.example.pizzamarket.entity.User;
import com.example.pizzamarket.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/find-all-users")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
}
