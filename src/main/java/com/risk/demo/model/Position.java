package com.risk.demo.model;

public class Position {
    private String symbol;
    private double quantity;
    private double price;
    
    public Position(String symbol, double quantity, double price) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }
    
    public double getPnL(double newPrice) {
        return (newPrice - price) * quantity;
    }
}
