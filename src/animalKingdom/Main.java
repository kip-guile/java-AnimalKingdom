package animalKingdom;

import java.util.List;
import java.util.ArrayList;

    // | Panda     | 1869  |
    // | Zebra     | 1778  |
    // | Koala     | 1816  |
    // | Sloth     | 1804  |
    // | Armadillo | 1758  |
    // | Raccoon   | 1758  |
    // | Bigfoot   | 2021  |


public class Main {
    private static List<Animals> filterAnimal(List<Animals> animals, CheckAnimal tester) {
        List<Animals> tempList = new ArrayList<>();
        for (Animals v : animals) {
            if (tester.test(v)) {
                tempList.add(v);
            }
        }
        return tempList;
    }
    public static void main(String[] args) {
        System.out.println("This is le animal kingdom");
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animals> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
        System.out.println(myList);
    }
}