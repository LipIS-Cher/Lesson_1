package Classes;

import java.util.Random;

public class Slytherin extends Hogwarts{

    private int cunning; //хитрость

    private int determined; //решительность

    private int ambitious; //амбициозность

    public Slytherin(String firstName, String lastName, int conjure, int transgression) {
        super(firstName, lastName, conjure, transgression);
        this.cunning = generateRandomIntIntRange(1,100);
        this.determined = generateRandomIntIntRange(1,100);
        this.ambitious = generateRandomIntIntRange(1,100);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public void setDetermined(int determined) {
        this.determined = determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public void printInfo(){
        System.out.println("///////////////////////////////");
        System.out.println("Имя  - " + getFirstName() + ", Фамилия - " + getLastName() + ", уровень магии - " + getConjure() + ", уровень трансгрессии - " + getTransgression());
        System.out.println("Хитрость - " + getCunning() + ", решительность - " + getDetermined() + ", амбициозность - " + getAmbitious());
        System.out.println("///////////////////////////////");    
    }

    public static void comparisonSilasSly(Slytherin one, Slytherin two){
        int oneSum = one.getCunning() + one.getDetermined() + one.getAmbitious();
        int twoSum = two.getCunning() + two.getDetermined() + two.getAmbitious();
        if (oneSum > twoSum){
            System.out.println(one.getFirstName() + " лучше по качествам Слизерина, чем " + two.getFirstName());
        } else if (oneSum == twoSum){
            System.out.println("Оба притендента достойны");
        }
    }
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
