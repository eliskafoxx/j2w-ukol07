package cz.czechitas.java2webapps.ukol7.controller;
import ch.qos.logback.core.model.Model;
import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
    private final PostService postService;
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;}
    @GetMapping("/")
    public ModelAndView list(Pageable pageable) {
        Page<Post> posts = postService.list(pageable);
        return new ModelAndView("seznam")
                .addObject("posts", posts);}
    @GetMapping("/post/{slug}")
    public ModelAndView getSinglePost(@PathVariable String slug) {
        ModelAndView modelAndView = new ModelAndView("detail");
        postService.singlePost(slug).ifPresent(post -> modelAndView.addObject("post", post));
        return modelAndView;
    }
}
