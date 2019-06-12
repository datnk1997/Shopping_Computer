package com.example.ItSol.entity;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue
    private int id_product;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Categories id_category;

    @Column
    private String name_product;

    @Column
    private int price;

    @Column
    private int quantity;

    @Column
    private boolean status_product;

    @Column
    private String describe_product;

    @Column
    private String picture;

    public Products() {

    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public Categories getId_category() {
        return id_category;
    }

    public void setId_category(Categories id_category) {
        this.id_category = id_category;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus_product() {
        return status_product;
    }

    public void setStatus_product(boolean status_product) {
        this.status_product = status_product;
    }

    public String getDescribe_product() {
        return describe_product;
    }

    public void setDescribe_product(String describe_product) {
        this.describe_product = describe_product;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
