package pro.sky.skyprospringHWcalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    public void shouldCorrectlyCalculateSum(){
        //given
        int num1 = 5;
        int num2 = 5;
        int expectedSum = num1 + num2;
        //when
        Integer actualSum = Integer.valueOf(calculatorService.plus(num1, num2));
        //then
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void shouldCorrectlyCalculateMinus(){
        //given
        int num1 = 5;
        int num2 = 5;
        int expectedMinus = num1 - num2;
        //when
        Integer actualMinus = Integer.valueOf(calculatorService.minus(num1, num2));
        //then
        Assertions.assertEquals(expectedMinus, actualMinus);
    }
    @Test
    public void shouldCorrectlyCalculateMultiply(){
        //given
        int num1 = 5;
        int num2 = 5;
        int expectedMultiply = num1 * num2;
        //when
        Integer actualMultiply = Integer.valueOf(calculatorService.multiply(num1, num2));
        //then
        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }
    @Test
    public void shouldCorrectlyCalculateDivide(){
        //given
        int num1 = 5;
        int num2 = 5;
        int expectedDivide = num1 / num2;
        //when
        Integer actualDivide = Integer.valueOf(calculatorService.divide(num1, num2));
        //then
        Assertions.assertEquals(expectedDivide, actualDivide);
    }
    @Test
    public void shouldThrowExceptionWhenSecondNumberIsZero(){
        //given
        int num1 = 5;
        int num2 = 0;
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(calculatorService.divide(num1, num2)); });
    }
}
