public class Pig extends Animal implements Pettable{
    @Override
    public void sound(){
        System.out.println("ood oink");
    }
    @Override
    public void pet(){
        sound();
    }
}
