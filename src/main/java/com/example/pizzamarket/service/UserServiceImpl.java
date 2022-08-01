package com.example.pizzamarket.service;

import com.example.pizzamarket.entity.User;
import com.example.pizzamarket.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        Optional<User> oneByIdUser = userRepository.findOneByIdUser(id);
        return oneByIdUser.orElse(null);
    }

    @Override
    public void removeUser(int id) {
        Optional<User> oneByIdUser = userRepository.findOneByIdUser(id);
        oneByIdUser.ifPresent(userRepository::delete);
    }
}
