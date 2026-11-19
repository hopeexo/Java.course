package week8;

// This program demonstrates Polymorphism ("Many Forms").
// It shows how a superclass reference can point to a subclass object.

// Superclass
class Animal {
    public void makeSound() {
        // Default sound for a generic animal.
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    // Overriding the makeSound method.
    @Override
    public void makeSound() {
        // Specific sound for a Dog.
        System.out.println("Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    // Overriding the makeSound method.
    @Override
    public void makeSound() {
        // Specific sound for a Cat.
        System.out.println("Meow!");
    }
}

// Subclass 3
class Cow extends Animal {
    // Overriding the makeSound method.
    @Override
    public void makeSound() {
        // Specific sound for a Cow.
        System.out.println("Moo!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // This array can hold Dogs, Cats, and Cows because they are all Animals.
        Animal[] myAnimals = new Animal[3];

        // Upcasting: assigning subclass objects to a superclass reference.
        myAnimals[0] = new Dog(); // A Dog IS-AN Animal.
        myAnimals[1] = new Cat(); // A Cat IS-AN Animal.
        myAnimals[2] = new Cow(); // A Cow IS-AN Animal.

        System.out.println("=== ANIMAL SOUNDS ===");

        // The actual object type determines which overridden method is called.
        for (Animal animal : myAnimals) {
            animal.makeSound();
        }
    }
}
