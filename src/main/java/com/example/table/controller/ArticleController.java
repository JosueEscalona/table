package com.example.table.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.table.model.Article;
import com.example.table.service.ArticleService;

@RestController
@RequestMapping("articles")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping
    public List<Article> getAll() {
        return service.getAll();
    }
}