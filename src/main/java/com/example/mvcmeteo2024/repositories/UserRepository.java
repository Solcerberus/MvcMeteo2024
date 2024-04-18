package com.example.mvcmeteo2024.repositories;


import com.example.mvcmeteo2024.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}