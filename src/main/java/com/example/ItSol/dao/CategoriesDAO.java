package com.example.ItSol.dao;

import com.example.ItSol.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDAO extends JpaRepository<Categories, Integer> {
}
