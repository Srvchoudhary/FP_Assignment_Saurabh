package com.knoldus.OCP;

public class Calculator {
    public void calculate(Operation operation) throws Exception{
        if(operation == null){
            throw new Exception("operation cannot be performed check input");
        }
        operation.perform();
    }
}
