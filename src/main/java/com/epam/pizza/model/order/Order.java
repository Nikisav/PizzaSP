package com.epam.pizza.model.order;

import com.epam.pizza.model.products.Pizza;
import com.epam.pizza.model.products.Product;
import com.epam.pizza.model.products.Drink;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> basket;
    private String name;
    private String phone_number;
    private String address;
    private int amountOfPizza;
    private int amountOfDrink;
    private PayType payMethod;

    public Order(String name, String phone_number, String address, PayType payMethod) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.payMethod = payMethod;
        basket = new ArrayList<>();

        amountOfDrink = 0;
        amountOfPizza = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayMethod(PayType payMethod) {
        this.payMethod = payMethod;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public PayType getPay_method() {
        return payMethod;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public float forPayment()
    {
        float priceOrder = 0.0f;
        for (Product product: basket)
            priceOrder = priceOrder + product.getPrice();
        return priceOrder;
    }
}