package com.github.junit.junit;

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String WORLD = "world";

    public static String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public static String helloWorld(String name) {
        return HELLO + " " + name;
    }
}
