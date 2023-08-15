import Classes.*;

import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry", "Potter", 80, 90);
        Gryffindor ghermiona = new Gryffindor("Ghermiona", "Greindger", 100, 100);
        Gryffindor ron = new Gryffindor("Ron", "Yizli", 60, 65);
        Puffendui zaharia = new Puffendui("Zaharia", "Smit", 75, 70);
        Puffendui sedrik = new Puffendui("Sedrik", "Diggori", 80, 75);
        Puffendui dgastin = new Puffendui("Dgastin", "Finch-Fletchli", 65, 70);
        Claw chgoy = new Claw("Chgoy", "Chang", 80, 70);
        Claw padma = new Claw("Padma", "Patil", 70, 70);
        Claw markus = new Claw("Markus", "Belbi", 65, 75);
        Slytherin drako = new Slytherin("Drako", "Malfoy", 85, 80);
        Slytherin grehem = new Slytherin("Grehem", "Montegu", 70, 80);
        Slytherin gregori = new Slytherin("Gregori", "Goyl", 75, 70);

        harry.printInfo();


        Gryffindor.comparisonSilasGry(harry,ghermiona);
        Puffendui.comparisonSilasPuf(zaharia, sedrik);

        Hogwarts.comparisonSilas(harry, chgoy);

    }
}