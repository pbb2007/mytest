package com.pbb.thread;

public class TicketWindow extends Thread {
    //柜台名称
    private final String name;

    //票号总数
    private static final int Max = 500;

    private static int index = 1;


    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index<=Max){
            System.out.println("柜台名字："+name+"当前号码是："+(index++));
        }
    }

    public static void main(String[] args) {
        TicketWindow window1 = new TicketWindow("一号专机");
        window1.start();
        TicketWindow window2 = new TicketWindow("二号专机");
        window2.start();
        TicketWindow window3 = new TicketWindow("三号专机");
        window3.start();
        TicketWindow window4 = new TicketWindow("四号专机");
        window4.start();
    }
}
