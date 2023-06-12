package pro.sky.skyprospringHWcalculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;



@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String Welcome() {
        return "<h1> Добро пожаловать </h1>";
    }

    public String Calculator() {
        return "<h1> Добро пожаловать в калькулятор</h1>";
    }

    @Override
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return  String.valueOf(num1 + num2);
    }

    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return String.valueOf(num1 - num2);
    }

    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return String.valueOf(num1 * num2);
    }

    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        } else {
            return String.valueOf(num1 / num2);
        }
    }

}

