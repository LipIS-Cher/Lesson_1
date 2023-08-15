package Classes;

import java.util.Objects;
import java.util.Random;

public class Hogwarts {

    private String firstName;

    private String lastName;

    private int conjure;

    private int transgression;
    public Hogwarts(String firstName, String lastName, int conjure, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.conjure = conjure;
        this.transgression = transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void printInfo(){
        System.out.println("Имя  - " + getFirstName() + ", Фамилия - " + getLastName() + ", уровень магии - " + getConjure() + ", уровень трансгрессии - " + getTransgression());
    }

    public static void comparisonSilas(Hogwarts one, Hogwarts two){
        int oneSum = one.getConjure() + one.getTransgression();
        int twoSum = two.getConjure() + two.getTransgression();
        if (oneSum > twoSum){
            System.out.println(one.getFirstName() + " лучше по силам, чем " + two.getFirstName());
        } else if (oneSum == twoSum){
            System.out.println("Оба притендента достойны");
        }
    }
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
