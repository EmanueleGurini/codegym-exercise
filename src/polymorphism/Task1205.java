package polymorphism;

/**
 *
 * Write a method that will determine the class of an object passed to it,
 * and returns one of the following values: "Cow", "Whale", "Dog", or "Unknown Animal".
 *
 */

public class Task1205 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //write your code here
        if (o instanceof Cow) return "Cow";
        if (o instanceof Whale) return "Whale";
        if (o instanceof Dog) return "Dog";

        return "Unknown Animal";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
