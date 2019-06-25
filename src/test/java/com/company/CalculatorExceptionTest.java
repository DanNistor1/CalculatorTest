package com.company;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorExceptionTest {

    private Calculator calculator;
    private ExpectedException expectedException;

    @Rule
    public ExpectedException setExpectedException(){
        return expectedException = ExpectedException.none();
    }

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("integer overflow");
        calculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE);
    }

    @Test
    public void subTest(){
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("integer overflow");
        calculator.sub(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    @Test
    public void divideTest(){
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        calculator.divide(20,0);
    }

    @Test(expected = ArithmeticException.class)
    public void multiplyTest(){
        calculator.multiply(Integer.MAX_VALUE,Integer.MAX_VALUE);
    }
}
