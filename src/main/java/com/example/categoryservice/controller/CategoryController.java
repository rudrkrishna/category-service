package com.example.categoryservice.controller;

import com.example.categoryservice.entity.Category;
import com.example.categoryservice.service.CategoryService;
import jakarta.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add-category")
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
       return new ResponseEntity<>(categoryService.addCategory(category), HttpStatus.CREATED);
    }
    @GetMapping("/get-category")
    public ResponseEntity<Category> getCategory(@QueryParam("id") Long id){
        return new ResponseEntity<>(categoryService.getCategoryById(id), HttpStatus.OK);
    }
}
