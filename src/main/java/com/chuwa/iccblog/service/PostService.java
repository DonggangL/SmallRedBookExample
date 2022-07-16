package com.chuwa.iccblog.service;

import com.chuwa.iccblog.payload.PostDto;
import com.chuwa.iccblog.payload.PostResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    public PostDto  getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    public void deletePostById(long id);
}
