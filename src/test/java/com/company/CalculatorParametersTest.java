package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParametersTest {

//    private Calculator calculator;
    private static Calculator calculator;

    @Parameters
    public static Collection<Integer[]> data() {
        Integer[][] arr = {{1, 2, 3, -1, 0, 2}, {10, 20, 30, -10, 0, 200}};
        return Arrays.asList(arr);
    }

    @Parameter(0)
    public  int x;

    @Parameter(1)
    public  int y;

    @Parameter(2)
    public  int add;

    @Parameter(3)
    public  int subtract;

    @Parameter(4)
    public  int divide;

    @Parameter(5)
    public  int multiply;

/*
    @Before
    public void setUp(){
        calculator = new Calculator();
    }
*/
    @BeforeClass
    public static void setUp(){
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
