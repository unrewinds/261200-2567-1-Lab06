public class Cow extends Animal implements Pettable {
    @Override
    public void sound(){
        System.out.println("mor moo");
    }
    @Override
    public void pet(){
        sound();
    }
}
