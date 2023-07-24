package com.example.categoryservice.service;

import com.example.categoryservice.entity.Category;
import com.example.categoryservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category) {
       return categoryRepository.save(category);

    }

    public Category getCategoryById(Long id) {
        Optional<Category> obj=categoryRepository.findById(id);
       return obj.get();
    }

    public List<Category> fetchCategories() {

        return categoryRepository.findAll();
    }
}
