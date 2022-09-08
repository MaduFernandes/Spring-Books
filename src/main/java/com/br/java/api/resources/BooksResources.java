package com.br.java.api.resources;

import com.br.java.api.models.Books;
import com.br.java.api.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class BooksResources {

    @Autowired
    BooksRepository booksRepository;

    @PostMapping("/book")
    public Books insertCategories(@RequestBody Books book) {
        return booksRepository.save(book);
    }

}
