public class Duck extends Animal implements Flyable , Pettable{

    void clean(Animal cleanee){
        System.out.println(this + "is cleaning" + cleanee);
    }

    @Override
    public void sound(){
        System.out.println("gaab quack");
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
        System.out.println("I can land on water!");
    }
    @Override
    public void pet(){
        sound();
    }
}

