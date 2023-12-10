package cz.czechitas.java2webapps.ukol7.service;
import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class PostService {
    private final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public Page<Post> list(Pageable pageable) {
        LocalDate currentDate = LocalDate.now();
        return postRepository.findAllByPublishedBeforeAndPublishedIsNotNullOrderByPublishedDesc(currentDate, pageable);
    }
    public Optional<Post> singlePost(String slug) {
        return postRepository.findBySlug(slug);
    }
}

