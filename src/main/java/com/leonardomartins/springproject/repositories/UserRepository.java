package com.leonardomartins.springproject.repositories;

import com.leonardomartins.springproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
