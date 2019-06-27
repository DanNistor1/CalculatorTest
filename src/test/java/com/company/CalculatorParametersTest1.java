package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParametersTest1 {

    private Calculator calculator;
    private int x;
    private int y;
    private int add;
    private int subtract;
    private int divide;
    private int multiply;

    public  CalculatorParametersTest1(int x, int y, int add, int subtract, int divide, int multiply) {
        this.x = x;
        this.y = y;
        this.add = add;
        this.subtract = subtract;
        this.divide = divide;
        this.multiply = multiply;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Integer[][]{{1, 2, 3, -1, 0, 2}, {10, 20, 30, -10, 0, 200}});
    }

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        Assert.assertEquals(add, calculator.add(x,y));
    }

    @Test
    public void subTest(){
        Assert.assertEquals(subtract, calculator.sub(x,y));
    }

    @Test
    public void divideTest(){
        Assert.assertEquals(divide, calculator.divide(x,y));
    }

    @Test
    public void multiplyTest(){
        Assert.assertEquals(multiply, calculator.multiply(x,y));
    }
}
