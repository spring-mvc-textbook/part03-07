package com.example.spring.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    // 게시글 등록 (화면, GET)
    @RequestMapping(value = "/posts/create", method = RequestMethod.GET)
    public String create() {
        return "post/create";
    }

    // 게시글 등록 (처리, POST)
    @RequestMapping(value = "/posts/create", method = RequestMethod.POST)
    public String createPost(PostDto postDto, RedirectAttributes redirectAttributes) {
        boolean created = postService.create(postDto);

        if (created) {
            redirectAttributes.addFlashAttribute("successMessage", "게시글이 등록되었습니다.");
            return "redirect:/posts";
        }

        redirectAttributes.addFlashAttribute("errorMessage", "게시글 등록에 실패했습니다.");
        return "redirect:/post/create";
    }

    // 게시글 목록 (화면, GET)
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String listGet(Model model) {
        List<PostDto> posts = postService.list();
        model.addAttribute("posts", posts);
        return "post/list";
    }
}
