package org.example.storage;

import org.example.processing.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private final List<Product> orders = new ArrayList<>();

    public void addOrder(Product product) {
        orders.add(product);
        System.out.println("Added order: " + product.getName());
    }

    public List<Product> getOrders() {
        return new ArrayList<>(orders);
    }
}
