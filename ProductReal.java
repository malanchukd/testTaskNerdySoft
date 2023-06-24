package org.example;

public class ProductReal extends Product{
    private double size;
    private double weight;

    public ProductReal(String name, double price, double size, double weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
