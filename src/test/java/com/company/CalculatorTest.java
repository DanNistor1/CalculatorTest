package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        Assert.assertEquals(25,calculator.add(20,5));
    }

    @Test
    public void subTest(){
        Assert.assertEquals(15,calculator.sub(20,5));
    }

    @Test
    public void divideTest(){
        Assert.assertEquals(4,calculator.divide(20,5));
    }

    @Test
    public void multiplyTest(){
        Assert.assertEquals(100,calculator.multiply(20,5));
    }
}
