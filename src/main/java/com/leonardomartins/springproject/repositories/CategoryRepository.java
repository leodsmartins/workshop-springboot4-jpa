package com.leonardomartins.springproject.repositories;

import com.leonardomartins.springproject.entities.Category;
import com.leonardomartins.springproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
