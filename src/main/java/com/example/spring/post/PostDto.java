package com.example.spring.post;

public class PostDto {
    private int id;             // 게시글 ID (Primary Key)
    private String title;       // 게시글 제목
    private String content;     // 게시글 내용
    private String username;    // 게시글 작성자
    private String password;    // 게시글 비밀번호 (수정/삭제 시 필요)
    private String createdAt;   // 게시글 작성일시
    private String updatedAt;   // 게시글 수정일시

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
