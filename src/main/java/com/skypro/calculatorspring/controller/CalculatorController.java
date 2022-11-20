package com.skypro.calculatorspring.controller;

import com.skypro.calculatorspring.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String hello() {
        return "Добро пожаловать";
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int i = this.calculatorService.gettingSum(num1, num2);
        return String.format("%s + %s = %s", num1, num2, i);
    }

    @GetMapping("/minus")
    public String getDif(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int i = this.calculatorService.gettingDifferent(num1, num2);
        return String.format("%s - %s = %s", num1, num2, i);
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int i = this.calculatorService.gettingMultiply(num1, num2);
        return String.format("%s * %s = %s", num1, num2, i);
    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int i = this.calculatorService.gettingDivide(num1, num2);
        return String.format("%s / %s = %s", num1, num2, i);
    }
}
