package com.MyBlog.BlogApp.repository;

import com.MyBlog.BlogApp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByPostId(long postId);
//    List<Comment>findByEmail(String email);
//    List<Comment> findByName(String name) ;

    }
