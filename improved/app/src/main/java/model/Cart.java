package com.example.hamburgueriaz.model;

import java.util.ArrayList;
import java.util.List;

import com.example.hamburgueriaz.service.PriceCalculator;

public class Cart {

    private List<Order> orders = new ArrayList<>();

    // Adiciona pedido ao carrinho
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Retorna lista de pedidos
    public List<Order> getOrders() {
        return orders;
    }

    // Calcula total geral do carrinho
    public int getTotalPrice() {
        int total = 0;

        for (Order order : orders) {
            total += PriceCalculator.calculate(order);
        }

        return total;
    }

    // Gera descrição detalhada do pedido
    public String generateOrderDescription() {

        StringBuilder builder = new StringBuilder();
        int contador = 1;

        for (Order order : orders) {

            builder.append(contador)
                    .append(") ")
                    .append(order.getQuantity())
                    .append("x Burger");

            if (order.hasBacon()) {
                builder.append(" + Bacon");
            }

            if (order.hasCheese()) {
                builder.append(" + Queijo");
            }

            if (order.hasOnionRings()) {
                builder.append(" + Onion Rings");
            }

            builder.append("\n");

            contador++;
        }

        return builder.toString();
    }

    // Limpa carrinho
    public void clearCart() {
        orders.clear();
    }
}