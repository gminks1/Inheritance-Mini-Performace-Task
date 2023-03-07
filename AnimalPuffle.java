public class AnimalPuffle extends Puffle{
    private int energy = 0;

    public void eat(){
        energy += 5;
        System.out.println("puffle Eat!");
    }

    public void bite(){
        energy -= 5;
        System.out.println("your puffle bit you!");
    }

    public int setEnergy(int energy){
        return energy;
    }

    public void getEnegry(){
        System.out.println("energy:" + energy);
    }
}
