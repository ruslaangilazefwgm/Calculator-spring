package com.skypro.calculatorspring.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public  int gettingSum(int num1, int num2) {
        return num1 + num2;
    }

    public int gettingDifferent(int num1, int num2) {
        return num1 - num2;
    }

    public int gettingMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int gettingDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
