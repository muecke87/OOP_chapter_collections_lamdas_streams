package com.company.lambdas;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        var myList = Arrays.asList(4, 9, 2);

        // variante mit "normaler" klasse in eigenem file
        var customConsumer = new CustomConsumer();
        myList.forEach(customConsumer);

        // variante mit innerer klasse:
        var innerClassConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*4);
            }
        };
        myList.forEach(innerClassConsumer);

        // variante mit anonymer innerer klasse:
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*4);
            }
        });

        // variante mit lambda
        // implementiert auch Consumer's accept(): return type void und ein parameter vom typ int
        myList.forEach(i -> System.out.println(i*4));
    }
}
