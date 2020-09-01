package animalKingdom;

public class Birds extends Animals {
    private String name;
    private int year;
    
    public Birds(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override 
    public String move() {
        return "Fly";
    }

    @Override 
    public String breathe() {
        return "Lungs";
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
        return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + year + "}\n";
    }
}