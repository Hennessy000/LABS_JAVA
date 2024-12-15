package org.example;

import org.example.processing.Clothing;
import org.example.processing.Electronics;
import org.example.processing.OrderProcessor;
import org.example.storage.OrderStorage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        OrderStorage storage = new OrderStorage();

        String electronicsName = "Electronics Item " + (random.nextInt(100) + 1);
        Electronics electronics = new Electronics(electronicsName);
        OrderProcessor<Electronics> electronicsProcessor = new OrderProcessor<>(electronics);
        electronicsProcessor.process();
        electronicsProcessor.startProcessing();
        storage.addOrder(electronics);

        String clothingName = "Clothing Material " + (random.nextInt(100) + 1);
        Clothing clothing = new Clothing(clothingName);
        OrderProcessor<Clothing> clothingProcessor = new OrderProcessor<>(clothing);
        clothingProcessor.process();
        clothingProcessor.startProcessing();
        storage.addOrder(clothing);

        System.out.println("All stored orders:");
        storage.getOrders().forEach(order -> System.out.println(order.getName()));
    }
}


