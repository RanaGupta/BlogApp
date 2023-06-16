package com.MyBlog.BlogApp.repository;

import com.MyBlog.BlogApp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
