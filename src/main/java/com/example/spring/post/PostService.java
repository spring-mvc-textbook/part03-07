package com.example.spring.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostDao postDao;

    // 게시글 등록
    public boolean create(PostDto post) {
        int result = postDao.create(post);
        return result > 0;
    }

    // 게시글 목록
    public List<PostDto> list() {
        return postDao.list();
    }
}
