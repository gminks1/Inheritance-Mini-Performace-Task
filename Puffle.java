public class Puffle{
    private String color;

    public Puffle(){

    }
    public Puffle(String color){
        this.color = color;
    }

    public void getColor(){
        System.out.println("The puffle's color is: " + color);
    }

    public void pet(){
        System.out.println("The puffle snuggles up next to you");
    }

    public void play(){
        System.out.println("you play fetch with your puffle");
    }
    public String setColor(String color){
        return color;
    }
}