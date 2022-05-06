package com.nasir.rediscachev2.controller;

import com.nasir.rediscachev2.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class ProductController {

    @Cacheable(value = "productCache")
    @GetMapping("/products")
    public List<Product> getAll(){
        return List.of(new Product("1", "Product One"), new Product("2", "Product Two"));
    }
}
