package polymorphism;

/**
 * Write a method which determines the class type of the object you pass into it,
 * and then displays on the screen the corresponding message: Cat, Dog, Bird, and Lamp.
 */

public class Task1204 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //write your code here
        if (o instanceof Cat) System.out.println("Cat");
        if (o instanceof Dog) System.out.println("Dog");
        if (o instanceof Bird) System.out.println("Bird");
        if (o instanceof Lamp) System.out.println("Lamp");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
