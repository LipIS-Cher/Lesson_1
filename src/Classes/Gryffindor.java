package Classes;

import java.util.Random;

public class Gryffindor extends Hogwarts{

    private int nobility;

    private int honour;

    private int courage;

    public Gryffindor(String firstName, String lastName, int conjure, int transgression) {
        super(firstName, lastName, conjure, transgression);
        this.nobility = generateRandomIntIntRange(1, 100);
        this.honour = generateRandomIntIntRange(1, 100);
        this.courage = generateRandomIntIntRange(1, 100);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void printInfo(){
        System.out.println("///////////////////////////////");
        System.out.println("Имя  - " + getFirstName() + ", Фамилия - " + getLastName() + ", уровень магии - " + getConjure() + ", уровень трансгрессии - " + getTransgression());
        System.out.println("Благородство - " + getNobility() + ", честь - " + getHonour() + ", храбрость - " + getCourage());
        System.out.println("///////////////////////////////");
    }

    public static void comparisonSilasGry(Gryffindor one, Gryffindor two){
        int oneSum = one.getNobility() + one.getHonour() + one.getCourage();
        int twoSum = two.getNobility() + two.getHonour() + two.getCourage();
        if (oneSum > twoSum){
            System.out.println(one.getFirstName() + " лучше по качествам Гриффиндора, чем " + two.getFirstName());
        } else if (oneSum == twoSum){
            System.out.println("Оба притендента достойны");
        }
    }
    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", courage=" + courage +
                '}';
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
