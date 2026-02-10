public class Main {

    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");
        Bird myBird = new Bird("Tweety");

        System.out.println("Generic Animal says:");
        genericAnimal.makeSound();

        System.out.println("\nDog says:");
        myDog.makeSound();

        System.out.println("\nCat says:");
        myCat.makeSound();

        System.out.println("\nBird says:");
        myBird.makeSound();

        System.out.println("\nBird does:");
        myBird.fly();

        System.out.println("\n--- Polymorphism Demo ---");

        Animal animal1 = new Dog("pissyDog");
        Animal animal2 = new Cat("lunaCat");
        Animal animal3 = new Bird("skyBird");

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
