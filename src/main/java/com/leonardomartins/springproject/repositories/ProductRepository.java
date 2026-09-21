package com.leonardomartins.springproject.repositories;

import com.leonardomartins.springproject.entities.Category;
import com.leonardomartins.springproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
