package com.company;

public class Main {

    public static String getName() {
        return "1";
    }

    public static void main(String[] args) {
        var s = new Second("skjhskjdh");
        var s2 = new Second("2");
        System.out.println("Hello " + s.getName());
        System.out.println("Hello " + s2.getName());
    }
}
