package controller;

import model.ComplexNumber;
import service.ComplexNumService;

public class ComplexNumController {
    ComplexNumService service = new ComplexNumService();

    public ComplexNumber createComplexNumber(){
        return service.createComplexNum();
    }

    public double getReal(ComplexNumber number){
        return service.getReal(number);
    }

    public double getImg(ComplexNumber number){
        return  service.getImg(number);
    }
}
