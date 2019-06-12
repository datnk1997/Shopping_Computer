package com.example.ItSol.dao;

import com.example.ItSol.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsDAO extends JpaRepository<Products, Integer> {

}
