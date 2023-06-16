package com.MyBlog.BlogApp.service;

import com.MyBlog.BlogApp.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId,CommentDto  commentDto);

    List<CommentDto> getCommentByPostId(long postId);

    CommentDto updatedComment(long postId, long id, CommentDto commentDto);

    void deleteComment(long postId, long commentId);
}
