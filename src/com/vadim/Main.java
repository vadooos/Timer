package com.vadim;

public class Main {

    public static void main(String[] args) {
        new Timer(1);
        new Waiter(5, "message1!");
        new Waiter(7, "message2!");
    }
}
