package com.example.Thread;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        Thread thread1 = new Thread(mainGroup,new MyThread(),"номер 1");
        Thread thread2 = new Thread(mainGroup, new MyThread(),"тот самый второй");
        Thread thread3 = new Thread(mainGroup, new MyThread(),"под номером 3");
        Thread thread4 = new Thread(mainGroup, new MyThread(),"под номером 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(30_000);
        mainGroup.interrupt();


    }
}
