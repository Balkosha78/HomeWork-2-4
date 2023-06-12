package pro.sky.skyprospringHWcalculator.service;

public interface CalculatorService {
    String Welcome();
    String Calculator();
    String plus(Integer num1, Integer num2);
    String minus(Integer num1, Integer num2);
    String multiply(Integer num1, Integer num2);
    String divide(Integer num1, Integer num2);
}
