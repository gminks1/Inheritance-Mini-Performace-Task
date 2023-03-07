public class NormalPuffle extends Puffle{
    private String nature;

    public void getNature(){
        System.out.println("the normal puffle's nature is "+ nature);
    }

    public String setNature(String nature){
        return nature;
    }

    public void minigama(){
        System.out.println("you and your puffle go and play a minigame!");
    }

    public void drip(){
        System.out.println("You and your puffle get matching sunglasses");
    }
}
