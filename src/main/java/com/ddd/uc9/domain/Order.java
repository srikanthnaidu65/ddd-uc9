package com.ddd.uc9.domain;

import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}
