package com.example.pizzamarket.repository;

import com.example.pizzamarket.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
