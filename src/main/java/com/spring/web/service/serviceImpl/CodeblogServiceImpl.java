package com.spring.web.service.serviceImpl;

import com.spring.web.model.Post;
import com.spring.web.repository.CodeblogRepository;
import com.spring.web.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }



//    private Sort sortByIdAsc() {
//        return new Sort(Sort.Direction.DESC, "id");
//    }
}