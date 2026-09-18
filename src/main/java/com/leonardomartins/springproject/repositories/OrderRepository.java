package com.leonardomartins.springproject.repositories;

import com.leonardomartins.springproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
