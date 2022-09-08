package com.br.java.api.resources;

import com.br.java.api.models.Categories;
import com.br.java.api.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class CategoriesResources {

    @Autowired
    CategoriesRepository categoriesRepository;

    @GetMapping("/category")
    public List<Categories> listCategories() {
        return categoriesRepository.findAll();
    }


    @PostMapping("/category")
    public Categories insertCategories(@RequestBody Categories category) {
        return categoriesRepository.save(category);
    }

}
