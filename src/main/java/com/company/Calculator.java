package com.company;

public class Calculator {

    public int add(int x, int y) {
        return Math.addExact(x, y);
    }

    public int sub(int x, int y) {
        return Math.subtractExact(x, y);
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int multiply(int x, int y) {
        return Math.multiplyExact(x, y);
    }
}
