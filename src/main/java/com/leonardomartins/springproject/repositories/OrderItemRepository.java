package com.leonardomartins.springproject.repositories;

import com.leonardomartins.springproject.entities.Order;
import com.leonardomartins.springproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
