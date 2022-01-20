package com.example.demo.repositories;

import com.example.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - not needed since extends repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // JPA already implements it
}
