package com.github;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("...BeforeEach");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println("......" + greeting.helloWorld());
        assertTrue(true);
    }

    @Test
    void helloWorld1() {
        System.out.println("......" + greeting.helloWorld("John"));
    }

    @Test
    void helloWorld2() {
        System.out.println("......" + greeting.helloWorld("George"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("...AfterEach");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("AfterAll");
    }
}