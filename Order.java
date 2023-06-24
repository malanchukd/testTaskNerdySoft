package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private User user;
    private List<Product> productList;

    private Product product;

    private Order() {
        productList = new ArrayList<>();
    }

    public static Order createOrder(User user, List<Product> products) {
        Order order = new Order();
        order.user = user;
        order.productList.addAll(products);
        return order;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : productList) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                mostExpensiveProduct = product;
            }
        }

        return mostExpensiveProduct;
    }
}
