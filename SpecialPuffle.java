public class SpecialPuffle extends Puffle{
    public boolean cool;

    public void magic(){
        System.out.println("Your special puffle uses its magical powers! KAZZAM");
    }

    public void quest(){
        System.out.println("your puffle leads you on a secret quest");
    }

    public void getCool(){
        System.out.println("your special puffle is" + cool);
    }

    public Boolean setCool(Boolean cool){
        return cool;
    }
}
