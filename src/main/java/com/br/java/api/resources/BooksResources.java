package com.br.java.api.resources;

import com.br.java.api.models.Books;
import com.br.java.api.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class BooksResources {

    @Autowired
    BooksRepository booksRepository;

    @PostMapping("/book")
    public Books insertBooks(@RequestBody Books book) {
        return booksRepository.save(book);
    }

    @PutMapping("/book")
    public Books updateBooks(@RequestBody Books book) { return booksRepository.save(book); }

    @GetMapping("/book/{id}")
    public Books getBookById(@PathVariable(value = "id") Integer id) throws Exception {
        return booksRepository.findById(id);
    }

    @GetMapping("/book")
    public List<Books> getAllBooks() { return booksRepository.findAll(); }

}
