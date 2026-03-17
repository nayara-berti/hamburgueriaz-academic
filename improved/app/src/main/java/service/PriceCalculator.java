package com.example.hamburgueriaz.service;

import com.example.hamburgueriaz.model.Order;

public class PriceCalculator {

    private static final int BASE_PRICE = 20;
    private static final int BACON_PRICE = 2;
    private static final int CHEESE_PRICE = 2;
    private static final int ONION_PRICE = 3;

    public static int calculate(Order order) {

        int price = BASE_PRICE;

        if (order.hasBacon()) price += BACON_PRICE;
        if (order.hasCheese()) price += CHEESE_PRICE;
        if (order.hasOnionRings()) price += ONION_PRICE;

        return price * order.getQuantity();
    }
}