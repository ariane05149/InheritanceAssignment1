public class Animal {

    protected String name;

    public Animal() {
        this.name = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
