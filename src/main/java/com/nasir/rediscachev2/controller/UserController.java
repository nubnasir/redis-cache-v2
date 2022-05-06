package com.nasir.rediscachev2.controller;

import com.nasir.rediscachev2.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    @Cacheable(value = "userCache")
    @GetMapping("/users")
    public List<User> getAll(){
        return List.of(new User("1", "User One"), new User("2", "User Two"));
    }
}
