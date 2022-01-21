package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - not needed since extends repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JPA already implements it
}
