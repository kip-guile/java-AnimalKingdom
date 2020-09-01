package animalKingdom;

abstract class Animals {
    private static int maxId = 0;
    protected int id;

    public Animals() {
        maxId++;
        id = maxId;
    }

    int getId() {
        return id;
    }

    String consume() {
        return "Swallow";
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();
    abstract String getName();
    abstract int getYear();
}