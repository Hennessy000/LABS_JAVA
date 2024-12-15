package org.example.processing;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderProcessor <T extends Product> {
    private T product;

    public OrderProcessor (T product) {
        this.product = product;
    }

    public void process() {
        System.out.println("Processing order for: " + product.getName());
    }

    public void startProcessing() {
        Runnable task = () -> System.out.println("Processing order in thread " + Thread.currentThread().getName());
        new Thread(task).start();
    }
}
