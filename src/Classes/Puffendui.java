package Classes;

import java.util.Objects;
import java.util.Random;

public class Puffendui extends Hogwarts{

    private int hardworking; //трудолюбивы

    private int loyal; //верность

    private int honest; //честность

    public Puffendui(String firstName, String lastName, int conjure, int transgression) {
        super(firstName, lastName, conjure, transgression);
        this.hardworking = generateRandomIntIntRange(1, 100);
        this.loyal = generateRandomIntIntRange(1, 100);
        this.honest = generateRandomIntIntRange(1, 100);
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void printInfo(){
        System.out.println("///////////////////////////////");
        System.out.println("Имя  - " + getFirstName() + ", Фамилия - " + getLastName() + ", уровень магии - " + getConjure() + ", уровень трансгрессии - " + getTransgression());
        System.out.println("Трудолюбие - " + getHardworking() + ", верность - " + getLoyal() + ", честность - " + getHonest());
        System.out.println("///////////////////////////////");    }


    public static void comparisonSilasPuf(Puffendui one, Puffendui two){
        int oneSum = one.getHardworking() + one.getLoyal() + one.getHonest();
        int twoSum = two.getHardworking() + two.getLoyal() + two.getHonest();
        if (oneSum > twoSum){
            System.out.println(one.getFirstName() + " лучше по качествам Пуффендуя, чем " + two.getFirstName());
        } else if (oneSum == twoSum){
            System.out.println("Оба притендента достойны");
        }
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
