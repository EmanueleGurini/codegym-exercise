package polymorphism;

/**
 * Override the getChild method in the Cat and Dog classes
 * so that cats give birth to cats and dogs to dogs.
 */

public class Task1203 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
