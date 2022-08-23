package com.example.demo1;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        Thread thread1 = new Thread(mainGroup,new MyThread(),"hi i am the first");
        Thread thread2 = new Thread(mainGroup, new MyThread(),"hi i am the second");
        Thread thread3 = new Thread(mainGroup, new MyThread(),"hello i'm third");
        Thread thread4 = new Thread(mainGroup, new MyThread(),"whats up i am number 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(30_000);
        mainGroup.interrupt();


    }
}
