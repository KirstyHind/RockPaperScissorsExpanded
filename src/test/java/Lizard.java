class Lizard extends Item {
    @Override
    public int compareTo(Item item) {
        if (item instanceof Spock || item instanceof Paper) return 1; // Lizard beats Spock and Paper
        else if (item instanceof Rock || item instanceof Scissors) return -1; // Lizard loses to Rock and Scissors
        else return 0; // Draw
    }

    @Override
    //Converts to string
    public String toString() {
        return "Lizard";
    }
    @Override
    //Returns name of the item
    public String getName() {
        return "Lizard";
    }
}