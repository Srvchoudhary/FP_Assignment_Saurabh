package com.knoldus.SRP;

public class Main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Saurabh Kumar Choudhary ");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        String toPrint1=text_manipulator.appendText("Single Responsibility Principle");
        System.out.println(toPrint1);
        String toPrint2=textPrinter.printOutEachWordOfText();
        System.out.println(toPrint2);
    }
}
