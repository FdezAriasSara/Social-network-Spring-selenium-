package com.uniovi.sdipractica134.services;

import com.uniovi.sdipractica134.entities.Post;
import com.uniovi.sdipractica134.entities.User;
import com.uniovi.sdipractica134.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
@Service
public class PostsService {
    @Autowired
    PostsRepository postsRepository;
    public Page<Post> getPostsByUser(Pageable pageable, User user){
        Page<Post> posts =new PageImpl<Post>(new LinkedList<Post>());
        posts = postsRepository.findAllByUser(pageable,user);
        return posts;
    }

}
