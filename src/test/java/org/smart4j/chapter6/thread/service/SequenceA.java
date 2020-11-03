package org.smart4j.chapter6.thread.service;

public class SequenceA implements Sequence {

    private static int number = 0;

    @Override
    public int getNumber() {
        number = number+1;
        return number;
    }

}
