package com.example.spring.post;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PostDao {
    private static final Logger logger = LoggerFactory.getLogger(PostDao.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    // 게시글 등록
    public int create(PostDto post) {
        String query = "INSERT INTO POSTS (TITLE, CONTENT, USERNAME, PASSWORD) VALUES (?, ?, ?, ?)";
        int result = -1;

        try {
            result = jdbcTemplate.update(query, post.getTitle(), post.getContent(), post.getUsername(), post.getPassword());
        } catch (DataAccessException e) {
            logger.error("게시글 등록 오류 : {}", e.getMessage(), e);
        }

        return result;
    }

    // 게시글 목록
    public List<PostDto> list() {
        String query = "SELECT ID, TITLE, CONTENT, USERNAME, PASSWORD, CREATED_AT, UPDATED_AT FROM POSTS ORDER BY ID DESC";
        List<PostDto> posts = null;

        try {
            posts = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(PostDto.class));
        } catch (DataAccessException e) {
            logger.error("게시글 목록 오류 : {}", e.getMessage(), e);
        }

        return posts;
    }
}
