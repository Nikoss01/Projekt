package paka;

public class Owner {
    public static void main(String[] args) {
        Animal papuga = new Animal();
        papuga.speak();
        papuga.feed("ziarna");
        papuga.feed("ziaren", 10);
    }
}
