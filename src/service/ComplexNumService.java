package service;
import model.ComplexNumber;
import java.util.Scanner;

public class ComplexNumService {
    public ComplexNumber createComplexNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вещественную часть числа: ");
        double real = in.nextDouble();
        System.out.print("Введите мнимую часть числа: ");
        double img = in.nextDouble();
        ComplexNumber n = new ComplexNumber(real, img);
        return n;
    }
    public double getReal(ComplexNumber number) {
        return number.getReal();
    }

    public double getImg(ComplexNumber number) {
        return number.getImg();
    }
}
