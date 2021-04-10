package polymorphism;

/**
 * Override the getName method in the Whale class so that the program
 * doesn't display anything on the screen.
 */

public class Task1202 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() { return ""; }
    }
}
