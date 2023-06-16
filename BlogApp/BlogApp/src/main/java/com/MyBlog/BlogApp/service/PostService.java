package com.MyBlog.BlogApp.service;

import com.MyBlog.BlogApp.payload.PostDto;
import com.MyBlog.BlogApp.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPostDto(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy,String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);
}

