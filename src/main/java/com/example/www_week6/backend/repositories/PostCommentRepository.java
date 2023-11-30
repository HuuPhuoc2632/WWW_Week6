package com.example.www_week6.backend.repositories;

import com.example.www_week6.backend.models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
