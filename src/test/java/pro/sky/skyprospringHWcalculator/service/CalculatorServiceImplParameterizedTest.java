package pro.sky.skyprospringHWcalculator.service;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    private static Stream<Arguments> argumentProviderForCalculator(){
        return Stream.of(
                Arguments.of(10, 10),
                Arguments.of(-10, -10),
                Arguments.of(0, 0),
                Arguments.of(0, 5),
                Arguments.of(-5, 0));
    }
    private static Stream<Arguments> argumentProviderForCalculatorDivide(){
        return Stream.of(
                Arguments.of(10, 10),
                Arguments.of(-10, -10),
                Arguments.of(0, 5));
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateSum(int num1, int num2){
        //given
        int expectedSum = num1 + num2;
        //when
        Integer actualSum = Integer.valueOf(calculatorService.plus(num1, num2));
        //then
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateMinus(int num1, int num2){
        //given
        int expectedMinus = num1 - num2;
        //when
        Integer actualMinus = Integer.valueOf(calculatorService.minus(num1, num2));
        //then
        Assertions.assertEquals(expectedMinus, actualMinus);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateMultiply(int num1, int num2){
        //given
        int expectedMultiply = num1 * num2;
        //when
        Integer actualMultiply = Integer.valueOf(calculatorService.multiply(num1, num2));
        //then
        Assertions.assertEquals(expectedMultiply, actualMultiply);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculatorDivide")
    public void shouldCorrectlyCalculateDivide(int num1, int num2){
        //given
        int expectedDivide = num1 / num2;
        //when
        Integer actualDivide = Integer.valueOf(calculatorService.divide(num1, num2));
        //then
        Assertions.assertEquals(expectedDivide, actualDivide);
    }
}
