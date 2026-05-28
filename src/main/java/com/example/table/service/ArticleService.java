package com.example.table.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.example.table.model.Article;
import com.example.table.repository.ArticleRepository;

@Service
@Transactional
public class ArticleService {

    @Autowired
    private ArticleRepository repo;

    public List<Article> getAll() {
        return repo.findAll();
    }
}