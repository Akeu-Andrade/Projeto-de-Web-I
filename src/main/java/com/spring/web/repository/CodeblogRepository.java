package com.spring.web.repository;

import com.spring.web.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository <Post, Long>{

}
