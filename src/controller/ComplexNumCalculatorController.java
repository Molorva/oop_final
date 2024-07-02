package controller;

import model.ComplexNumber;
import service.CalculatorComplexNumService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ComplexNumCalculatorController {

    final ArrayList<String> options = new ArrayList<>(Arrays.asList("+", "-", "/", "*"));
    CalculatorComplexNumService service = new CalculatorComplexNumService();
    ComplexNumController controller = new ComplexNumController();

    public void calculator(){
        System.out.println("СОЗДАЕМ ПЕРВОЕ ЧИСЛО:");
        ComplexNumber a = controller.createComplexNumber();
        System.out.println("Ваше первое число: " +  a + "\n");
        System.out.println("Введите математическую операцию (+ - * /): ");
        Scanner in = new Scanner(System.in);
        String op = in.next();
        while (!options.contains(op)){
            System.out.println("Вы указали несуществующую операцию! Введите другой символ без пробелов (+ - * /): ");
            op = in.next();
        }
        System.out.println("СОЗДАЕМ ВТОРОЕ ЧИСЛО:");
        ComplexNumber b = controller.createComplexNumber();
        System.out.println("Ваше второе число: " +  b + "\n");

        switch (op){
            case "+" :
                System.out.println(a + " + " + b + " = " + sum(a,b));
                break;
            case "-" :
                System.out.println(a + " - " + b + " = " + subtraction(a,b));
                break;
            case "/":
                System.out.println(a + " / " + b + " = " + divide(a,b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + multiply(a,b));
        }
    }


    private ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        return service.sum(a,b);
    }
    private ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return service.multiply(a,b);
    }

    private ComplexNumber divide(ComplexNumber a, ComplexNumber b){
        return service.divide(a,b);
    }

    private ComplexNumber subtraction(ComplexNumber a, ComplexNumber b){
        return service.subtraction(a,b);
    }
}
