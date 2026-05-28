package com.example.table.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.table.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}