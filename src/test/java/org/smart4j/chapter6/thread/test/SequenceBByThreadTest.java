package org.smart4j.chapter6.thread.test;

import org.smart4j.chapter6.thread.example.ClientThread;
import org.smart4j.chapter6.thread.service.Sequence;
import org.smart4j.chapter6.thread.service.SequenceB;

public class SequenceBByThreadTest {

   public static void main(String[] args){
       Sequence sequence = new SequenceB();

       ClientThread thread1 = new ClientThread(sequence);
       ClientThread thread2 = new ClientThread(sequence);
       ClientThread thread3 = new ClientThread(sequence);

       thread1.start();
       thread2.start();
       thread3.start();

   }

}
