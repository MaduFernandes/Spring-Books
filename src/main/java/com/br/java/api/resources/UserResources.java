package com.br.java.api.resources;

import com.br.java.api.models.User;
import com.br.java.api.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
@Api(value = "Product API REST")
public class UserResources {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User insertUser(@RequestBody User user) { return userRepository.save(user); }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer id) throws Exception {
        return userRepository.findById(id);
    }
}
