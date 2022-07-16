package com.chuwa.iccblog.dao;

import com.chuwa.iccblog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // no need to write any code


}
