public class Fly extends Animal implements Flyable , Pettable{
    @Override
    public void sound(){
        System.out.println("fuzzzz");
    }
    @Override
    public void fly(){
        System.out.println("I belive I can fly");
    }
    @Override
    public void glide(){
        System.out.println("I can also ron");
    }
    @Override
    public void land(){
        System.out.println("I can land on your food!");
    }
    @Override
    public void pet(){
        sound();
    }
}
