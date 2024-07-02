package model;

public interface Calculator {
    ComplexNumber sum(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
    ComplexNumber subtraction(ComplexNumber a, ComplexNumber b);
}

