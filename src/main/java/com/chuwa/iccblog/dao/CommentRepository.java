package com.chuwa.iccblog.dao;

import com.chuwa.iccblog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
   //不用实现，但要学习语法
    List<Comment> findByPostId(long id);
}
