package com.example.www_week6.backend.repositories;

import com.example.www_week6.backend.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
