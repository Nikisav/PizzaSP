package com.epam.pizza.model.products;

public class Product {
    public float price;
    public String name;

    public Product(String productName, int productValue) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
