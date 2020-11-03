package org.smart4j.chapter6.thread.service;

import org.smart4j.chapter6.thread.local.MyThreadLocal;

public class SequenceC implements  Sequence {

    private static MyThreadLocal<Integer> numberContainer = new MyThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get()+1);
        return numberContainer.get();
    }
}
