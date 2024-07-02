package model.impl;

import controller.ComplexNumController;
import model.Calculator;
import model.ComplexNumber;

public class  CalculatorComplexNum implements Calculator {
    ComplexNumController controller = new ComplexNumController();

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        double real = controller.getReal(a) + controller.getReal(b);
        double img = controller.getImg(a) + controller.getImg(b);
        ComplexNumber result = new ComplexNumber(real,img);
        return result;
    }



    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = controller.getReal(a) * controller.getReal(b) - controller.getImg(a) * controller.getImg(b);
        double img = controller.getReal(a)* controller.getImg(b) + controller.getImg(a)* controller.getReal(b);
        ComplexNumber result = new ComplexNumber(real,img);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber resalt = multiply(a, reciprocal(b));
        return resalt;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber a, ComplexNumber b) {
        double real = controller.getReal(a) - controller.getReal(b);
        double img = controller.getImg(a) - controller.getImg(b);
        ComplexNumber result = new ComplexNumber(real,img);
        return  result;
    }



    private ComplexNumber reciprocal(ComplexNumber num){
        double real = controller.getReal(num);
        double img = controller.getImg(num);
        double scale = real*real + img*img;
        return new ComplexNumber(real/scale, -img/scale);
    }
}
