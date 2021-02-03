package com.spring.web.controller;

import com.spring.web.model.Post;
import com.spring.web.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CodeblogController {

    @Autowired
    CodeblogService codeblogService;
    private List<Post> post;

    @GetMapping
    public List<Post> findAll(){
        return codeblogService.findAll();
    }

    @RequestMapping(value="{id}", method= RequestMethod.GET)
    public Post findById( @PathVariable("id") Long Id ) {
        return codeblogService.findById(Id);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Post insert( @RequestBody Post post) {
        return codeblogService.save(post);
    }


//    public String index(){
//        return "index";
//    }
//
//    @RequestMapping(value="/posts", method= RequestMethod.GET)
//    public ModelAndView getPosts(){
//        ModelAndView mv = new ModelAndView("posts");
//        List<Post> posts = codeblogService.findAll();
//        mv.addObject("posts", posts);
//        return mv;
//    }
//
//    @RequestMapping(value="/posts/{id}", method=RequestMethod.GET)
//    public ModelAndView getPostDetails(@PathVariable("id") long id){
//        ModelAndView mv = new ModelAndView("postDetails");
//        Post post = codeblogService.findById(id);
//        mv.addObject("post", post);
//        return mv;
//    }
//
//    @RequestMapping(value="/newpost", method=RequestMethod.GET)
//    public String getPostForm(){
//        return "postForm";
//    }
//
//    @RequestMapping(value="/newpost", method=RequestMethod.POST)
//    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes){
//        if(result.hasErrors()){
//            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
//            return "redirect:/newpost";
//        }
//        post.setData(LocalDate.now());
//        codeblogService.save(post);
//        return "redirect:/posts";
//    }
//
}
