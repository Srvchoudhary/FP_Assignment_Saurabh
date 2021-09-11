package com.knoldus.OCP;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(10,15);
        Subtraction sub = new Subtraction(80,30);
        Multiplication mul = new Multiplication(40,50);

        calci.calculate(add);
        double addResult=add.perform();
        System.out.println("Sum of both the number is:  "+addResult);

        calci.calculate(sub);
        double subResult=sub.perform();
        System.out.println("difference of both the number is:  "+subResult);

        calci.calculate(mul);
        double mulResult=mul.perform();
        System.out.println("Product of both the number is:  "+mulResult);
    }
}
