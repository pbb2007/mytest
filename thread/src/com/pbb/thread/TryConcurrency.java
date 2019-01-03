package com.pbb.thread;

import java.util.concurrent.TimeUnit;

public class TryConcurrency {
    public static void main(String[] args) throws InterruptedException {
      /* new Thread(){
           @Override
           public void run() {
               enjoyMusic();
           }
       }.start();*/

       //使用lambda表达式
        /*new Thread(TryConcurrency::enjoyMusic).start();*/

        //验证线程结束生命周期，不能再次启动
        Thread tread = new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        tread.start();
        TimeUnit.SECONDS.sleep(2);
        tread.start();

    }

    /***
     * 浏览最新的新闻
     */
    private static void browseNews(){
        for (;;){
            System.out.println("Uh-huh,the good news.");
            sleep(1);
        }
    }

    /***
     * 欣赏音乐
     */
    private static void enjoyMusic(){
        for(;;){
            System.out.println("Uh-huh,the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
