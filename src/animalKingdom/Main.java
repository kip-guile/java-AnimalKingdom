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

        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(myList);

        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        System.out.println(myList);

        System.out.println();
        System.out.println("*** List only those animals the breath with lungs ***");
        List<Animals> filteredList = filterAnimal(myList, v -> v.breathe() == "Lungs");
        filteredList.forEach(v -> System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breathe() + " " + v.getYear()));

        System.out.println();
        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        filteredList = filterAnimal(myList, v -> (v.breathe() == "Lungs") && (v.getYear() == 1758));
        filteredList.forEach(v -> System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breathe() + " " + v.getYear()));

        System.out.println();
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        filteredList = filterAnimal(myList, v -> (v.getYear() == 1758));
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach(v -> System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breathe() + " " + v.getYear()));

                System.out.println();
        System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
        filteredList = filterAnimal(myList, v -> (v instanceof Mammals));
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach(v -> System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breathe() + " " + v.getYear()));
    }
}