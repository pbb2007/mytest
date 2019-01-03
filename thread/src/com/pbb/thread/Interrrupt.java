package com.pbb.thread;

import java.util.concurrent.TimeUnit;

public class Interrrupt {
    public static void main(String[] args) {
        System.out.println("Main thread is interrrupt ?"+Thread.interrupted());

        try {
            TimeUnit.MINUTES.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is interrrupt ?"+Thread.currentThread().isInterrupted());

        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("I will be interrupt still");
        }
    }
}
