public class Main {
    public static void main(String[] args) {
        Duck psyduck = new Duck();
        psyduck.sound();
        psyduck.fly();
        psyduck.glide();
        psyduck.pet();
        Owl butterowl = new Owl();
        Cow ben = new Cow();
        psyduck.clean(butterowl);

        Duck mk = new PekingDuck();
        mk.clean(butterowl);
        mk.pet();
    }
}
