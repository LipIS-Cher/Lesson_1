package Classes;

import java.util.Random;

public class Claw extends Hogwarts{

    private int intelligent; //умны

    private int wise; //мудры

    private int witty; //остроумны

    public Claw(String firstName, String lastName, int conjure, int transgression) {
        super(firstName, lastName, conjure, transgression);
        this.intelligent = generateRandomIntIntRange(1,100);
        this.wise = generateRandomIntIntRange(1,100);
        this.witty = generateRandomIntIntRange(1,100);
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
}
    public void printInfo(){
        System.out.println("///////////////////////////////");
        System.out.println("Имя  - " + getFirstName() + ", Фамилия - " + getLastName() + ", уровень магии - " + getConjure() + ", уровень трансгрессии - " + getTransgression());
        System.out.println("Ум - " + getIntelligent() + ", мудрость - " + getWise() + ", остроумие - " + getWitty());
        System.out.println("///////////////////////////////");    
    }

    public static void comparisonSilasCla(Claw one, Claw two){
        int oneSum = one.getIntelligent() + one.getWise() + one.getWitty();
        int twoSum = two.getIntelligent() + two.getWise() + two.getWitty();
        if (oneSum > twoSum){
            System.out.println(one.getFirstName() + " лучше по качествам Когтеврана, чем " + two.getFirstName());
        } else if (oneSum == twoSum){
            System.out.println("Оба притендента достойны");
        }
    }
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
