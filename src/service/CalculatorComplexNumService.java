package service;


import model.ComplexNumber;
import model.impl.CalculatorComplexNum;


public class CalculatorComplexNumService {
    CalculatorComplexNum calculator = new CalculatorComplexNum();

    public ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        return calculator.sum(a,b);
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return calculator.multiply(a,b);
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b){
        return calculator.divide(a,b);
    }

    public ComplexNumber subtraction(ComplexNumber a, ComplexNumber b){
        return calculator.subtraction(a,b);
    }


}
