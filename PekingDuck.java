public class PekingDuck extends Duck {
    void beCrispy(){ System.out.println("grob");}

    @Override
    void clean(Animal cleanee){
        System.out.println("I died already, sorry.");
    }

    @Override
    public void pet(){
        System.out.println("I'm already dead");
    }
    
}
