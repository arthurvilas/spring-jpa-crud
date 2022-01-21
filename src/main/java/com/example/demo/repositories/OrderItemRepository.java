package com.example.demo.repositories;

import com.example.demo.entities.OrderItem;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - not needed since extends repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // JPA already implements it
}
