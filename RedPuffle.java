public class RedPuffle extends NormalPuffle {
    
    private int age = 6;
    public RedPuffle(){
        super.setNature("happy");
        super.setColor("red");
    }

    public void getAge(){
        System.out.println("The red puffle is " + age + " years old");
    }

    public int setAge(int age){
        return age;
    }

    public void shopping(){
        System.out.println("you and you puffle go shopping");
    }

}
