package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
class Message {

    volatile static int count = 0;

    synchronized static void sendMessage(String s){
        System.out.println(s);
    }
}