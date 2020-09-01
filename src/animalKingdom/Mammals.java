package animalKingdom;

public class Mammals extends Animals {
    private String name;
    private int year;
    
    public Mammals(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override 
    public String move() {
        return "Walk";
    }

    @Override 
    public String breathe() {
        return "Lungs";
    }

    @Override 
    public String reproduce() {
        return "Live births";
    }

    @Override 
    public String getName() {
        return name;
    }

    @Override 
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + year + "}";
    }
}