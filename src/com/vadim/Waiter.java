package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Waiter implements Runnable{
    private final int period;
    private String mes;
    private Thread t = new Thread(this);

    Waiter(int period, String mes){
        this.period = period;
        this.mes = mes;
        t.start();
    }

    @Override
    public void run() {
         try {
             while (true)
                 synchronized (Message.class) {
                     Message.class.wait();
                     if (Message.count % period == 0)
                         Message.sendMessage(mes);
                 }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}