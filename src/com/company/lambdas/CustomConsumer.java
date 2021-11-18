package com.company.lambdas;

import java.util.function.Consumer;

public class CustomConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer*4);
    }
}
