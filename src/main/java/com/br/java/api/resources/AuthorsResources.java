package com.br.java.api.resources;

import com.br.java.api.models.Authors;
import com.br.java.api.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;
import java.util.List;

public class AuthorsResources {

    @Autowired
    AuthorsRepository authorsRepository;

    @GetMapping("/authors")
    public List<Authors> getAllAuthors() {
        return authorsRepository.findAll();
    }

    @GetMapping("/author/{id}")
    public Authors getAuthorById(@PathParam(value = "id") Integer id) {
        return authorsRepository.findById(id);
    }

    @PostMapping("/author")
    public Authors insertAuthor(@RequestBody Authors author) {
        return authorsRepository.save(author);
    }

    @PutMapping("/author")
    public Authors updateAuthor(@RequestBody Authors author) {
        return authorsRepository.save(author);
    }
}
