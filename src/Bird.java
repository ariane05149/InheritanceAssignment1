public class Bird extends Animal {

    public Bird() {
        super("Bird");
    }

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " does: Flying!");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

}
