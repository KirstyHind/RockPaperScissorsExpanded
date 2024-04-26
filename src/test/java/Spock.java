class Spock extends Item {
    @Override
    public int compareTo(Item item) {
        if (item instanceof Scissors || item instanceof Rock) return 1; // Spock beats Scissors and Rock
        else if (item instanceof Lizard || item instanceof Paper) return -1; // Spock loses to Lizard and Paper
        else return 0; // Draw
    }

    @Override
    //Converts to string
    public String toString() {
        return "Spock";
    }

    @Override
    //Returns name of the item
    public String getName() {
        return "Spock";
    }
}