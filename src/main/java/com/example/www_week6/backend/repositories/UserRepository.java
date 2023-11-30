package com.example.www_week6.backend.repositories;

import com.example.www_week6.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
