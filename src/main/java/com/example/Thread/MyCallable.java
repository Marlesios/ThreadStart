package com.example.Thread;

import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
    String name;

    public MyCallable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public Integer call() throws Exception {
        int limit = 5;
        int count = 0;
       for(int i = 0; i < limit; i++){
           Thread.sleep(2500);
           System.out.printf("я  %s, в пуле %s  Всем привет! \n", getName(), Thread.currentThread().getName() );
           count += 1;
       }
        return count;
    }
}