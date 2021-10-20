package com.company;

public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    boolean isHealthy;

    public Dog(String dogBreed, boolean dogOwned, int dogYears, boolean healthStatus) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        isHealthy = healthStatus;
    }

    public static void main(String[] args) {
        System.out.println("Main method started!");
        Dog fido = new Dog("poodle", false, 4, false);
        Dog nunzio = new Dog("shiba inu", true, 12, true);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = fido.age + nunzio.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that Fido is an older dog is " + isFidoOlder);
        System.out.println("The total age of the dogs is " + totalDogYears);
        System.out.println("Fido is healthy: " + fido.isHealthy);
        System.out.println("Nunzio is healthy " + nunzio.isHealthy);
        System.out.println("Main method finished.");


    }

}
