package com.example.pizzamarket.repository;

import com.example.pizzamarket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByIdUser(int id);
}
