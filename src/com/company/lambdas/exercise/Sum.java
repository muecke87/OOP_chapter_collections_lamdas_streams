package com.company.lambdas.exercise;

public class Sum implements Operation{
    @Override
    public double operation(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
