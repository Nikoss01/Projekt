package paka;

public class Animal {
    String specie;
    int age;
    boolean isalive;
    long hairCunt;
    char gender;

    public void speak() {
        specie = "papuga";
        System.out.println("Hello, my name is " + specie);
    }

    public void feed(String food) {
        System.out.println("Jem sobie " + food);
    }

    public void feed(String food, int amount) {
        System.out.println("Jem " + amount + " " + food);
    }
}