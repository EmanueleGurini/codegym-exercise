package Overloading;

/**
 * Write the following public static methods: int min(int, int), long min(long, long),
 * double min(double, double).
 * Each method must return the minimum of the two numbers passed to it.
 */

public class Task1209 {
    public static void main(String[] args) {

    }

    //write your code here
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public long min(long a, long b) {
        return Math.min(a, b);
    }

    public double min(double a, double b) {
        return a < b ? a : b;

    }
}
