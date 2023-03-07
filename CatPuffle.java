public class CatPuffle extends AnimalPuffle{
public boolean male;
    public CatPuffle(){
        super.setColor("orange and black");
    }

    public void speak(){
        System.out.println("purrrr");
    }
    public void sleep(){
        System.out.println("zzzzzz");
    }

    public void getSex(){
        System.out.println("male =" + male);
}
    public Boolean setMale(){
        return true;
    }
    public Boolean setFemale(){
        return false;
    }

}
