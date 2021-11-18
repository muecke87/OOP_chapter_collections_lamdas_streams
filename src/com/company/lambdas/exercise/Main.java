package com.company.lambdas.exercise;

public class Main {
    public static void main(String[] args) {

        // variante mit externer klasse
        var sumExternalClass = new Sum();
        var sumResult = sumExternalClass.operation(4, 2);
        System.out.println("sumResult " + sumResult);

        // variante mit innerer klasse
        var sumInnerClass = new Operation() {
            @Override
            public double operation(int operand1, int operand2) {
                return operand1 + operand2;
            }

        };
        sumResult = sumInnerClass.operation(4, 2);
        System.out.println("sumResult " + sumResult);

        // variante mit anonymer innerer klass
        sumResult = (new Operation() {
            @Override
            public double operation(int operand1, int operand2) {
                return operand1 + operand2;
            }

        }).operation(4, 2);
        System.out.println("sumResult " + sumResult);

        // variante mit lambda
        Operation sum = (a, b) -> a + b;
        sumResult = sum.operation(4, 2);
        System.out.println("sumResult " + sumResult);
    }
}
