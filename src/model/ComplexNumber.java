package model;

public class ComplexNumber {
    protected double real;
    protected double img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    @Override
    public String toString() {
        if(img > 0){
            return String.format(real + "+" + img + "i");
        }
        if(img == 0) {
            return String.format(real+ "");
        }
        return String.format(real+ "" + img + "i");
    }
}
