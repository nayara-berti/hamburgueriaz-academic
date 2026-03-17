package com.example.hamburgueriaz.model;

public class Order {

    private String customerName;
    private boolean hasBacon;
    private boolean hasCheese;
    private boolean hasOnionRings;
    private int quantity;

    public Order(String customerName,
                 boolean hasBacon,
                 boolean hasCheese,
                 boolean hasOnionRings,
                 int quantity) {

        this.customerName = customerName;
        this.hasBacon = hasBacon;
        this.hasCheese = hasCheese;
        this.hasOnionRings = hasOnionRings;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean hasBacon() {
        return hasBacon;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    public boolean hasOnionRings() {
        return hasOnionRings;
    }

    public int getQuantity() {
        return quantity;
    }
}