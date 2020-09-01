package animalKingdom;

public class Fish extends Animals {
    private String name;
    private int year;
    
    public Fish(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override 
    public String move() {
        return "Swim";
    }

    @Override 
    public String breathe() {
        return "Gills";
    }

    @Override 
    public String reproduce() {
        return "Eggs";
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