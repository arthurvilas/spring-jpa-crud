package com.example.demo.repositories;

import com.example.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - not needed since extends repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // JPA already implements it
}
