package com.epam.pizza.model.products;

import java.util.List;
import java.util.Objects;

public class Pizza extends Product {
    public int ccal;
    public String nutritionalValue;
    public String pizzaType;
    public List <Ingredients> composition;

    public Pizza(String Name, int Value, String pizzaType, String nutritionalValue, int ccal, List<Ingredients> ingredients) {
        super(Name, Value);
        this.pizzaType = pizzaType;
        this.nutritionalValue = nutritionalValue;
        this.ccal = ccal;
        this.composition = ingredients;
    }

    public int getCcal() {
        return ccal;
    }

    public List<Ingredients> getComposition() {
        return composition;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    @Override
    public boolean equals(Object o) {
        Pizza pizza = (Pizza) o;
        return ccal == pizza.ccal &&
                pizzaType.equals(pizza.pizzaType) &&
                nutritionalValue.equals(pizza.nutritionalValue) &&
                composition.equals(pizza.composition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pizzaType, nutritionalValue, ccal, composition);
    }
}
