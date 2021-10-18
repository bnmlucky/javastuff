package com.company;

public class Store {
        // declare instance fields here
        String productType;
        // new method: constructor!
        public Store() {
            System.out.println("I am inside the constructor method.");
        }
        // main method is where we create instances
        public static void main(String[] args) {
            System.out.println("Start of the main method.");
            // create the instance below
            Store lemonadeStand = new Store();
            // print the instance below
            System.out.println(lemonadeStand);
        }
}
