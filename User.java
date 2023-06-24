package org.example;

import java.util.List;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public static User createUser(String name, int age) {
        return new User(name, age);
    }

}
