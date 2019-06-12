package com.example.ItSol.controller;

import com.example.ItSol.dao.CategoriesDAO;
import com.example.ItSol.dao.ProductsDAO;
import com.example.ItSol.entity.Categories;
import com.example.ItSol.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    private ProductsDAO productsDAO;
    @Autowired
    private CategoriesDAO categoriesDAO;

    @GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Products> getProduct() {
        List<Products> list = productsDAO.findAll();
        return list;
    }

    @GetMapping(value = "/categories",  produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Categories> getCategory() {
        List<Categories> list = categoriesDAO.findAll();
        return list;
    }
}
