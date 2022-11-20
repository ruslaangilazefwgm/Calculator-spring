package com.skypro.calculatorspring;

import com.skypro.calculatorspring.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("sumTestSuites")
    public void gettingSumTest(int num1, int num2, int sum) {
        Assertions.assertEquals(sum, calculatorService.gettingSum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("difTestSuites")
    public void gettingDifTest(int num1, int num2, int dif) {
        Assertions.assertEquals(dif, calculatorService.gettingDifferent(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyTestSuites")
    public void gettingMultTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.gettingMultiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideTestSuites")
    public void gettingDivTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.gettingDivide(num1, num2));
    }

    @Test
    public void divideByZeroThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.gettingDivide(1, 0);
        });
    }


    public static List<Arguments> sumTestSuites() {
        return List.of(
                Arguments.of(10, 5, 15),
                Arguments.of(-5, 3, -2),
                Arguments.of(0, 0, 0)
        );
    }

    public static List<Arguments> difTestSuites() {
        return List.of(
                Arguments.of(10, 5, 5),
                Arguments.of(-5, 3, -2),
                Arguments.of(0, 0, 0)
        );
    }

    public static List<Arguments> multiplyTestSuites() {
        return List.of(
                Arguments.of(10, 5, 50),
                Arguments.of(-5, 3, -15),
                Arguments.of(0, 0, 0)
        );
    }

    public static List<Arguments> divideTestSuites() {
        return List.of(
                Arguments.of(10, 5, 2),
                Arguments.of(-5, -1, 5),
                Arguments.of(12, 3, 4)
        );
    }
}
