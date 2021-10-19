package com.company;

public class Store {
        // declare instance fields here
        String productType;
        int inventoryCount;
        double inventoryPrice;
        // new method: constructor!
        public Store(String product, int count, double price) {
            System.out.println("I am inside the constructor method.");
            productType = product;
            inventoryCount = count;
            inventoryPrice = price;
        }
        // main method is where we create instances
        public static void main(String[] args) {
            System.out.println("Start of the main method.");
            // create the instance below
            //Store lemonadeStand = new Store("lemonade");
            // print the instance below
            //System.out.println(lemonadeStand);
            //System.out.println(lemonadeStand.productType);
            Store cookieShop = new Store("cookies", 12, 3.75);
        }
}
