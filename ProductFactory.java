package org.example;

import java.time.LocalDate;

public class ProductFactory {
    public static Product createRealProduct(String name, double price, double size, double weight) {
        return new ProductReal(name, price, size, weight);
    }

    public static Product createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        return new ProductVirtual(name, price, code, expirationDate);
    }
}
