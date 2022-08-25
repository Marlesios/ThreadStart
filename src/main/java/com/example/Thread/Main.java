package com.example.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<MyCallable> myCallables = new ArrayList<>();

        MyCallable myCallable1 = new MyCallable("first");
        MyCallable myCallable2 = new MyCallable("second");
        MyCallable myCallable3 = new MyCallable("third");
        MyCallable myCallable4 = new MyCallable("fourth");

        myCallables.add(myCallable1);
        myCallables.add(myCallable2);
        myCallables.add(myCallable3);
        myCallables.add(myCallable4);

        Integer result = executorService.invokeAny(myCallables);
        System.out.println("the result of call is equal to " + result);
        executorService.shutdown();


    }
}
