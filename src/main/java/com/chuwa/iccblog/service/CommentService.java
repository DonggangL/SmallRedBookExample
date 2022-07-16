package com.chuwa.iccblog.service;

import com.chuwa.iccblog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    //需要帖子的id
    CommentDto createComment(long postId, CommentDto commentDto);
    //根据帖子的id拿到所有的评论
    List<CommentDto> getCommentsByPostId(long postId);
    //只拿一条评论
    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDtoRequest);

    void deleteComment(Long postId, Long commentId);
}
