class Rock extends Item {
    // Override method to compare rock with another item
    @Override
    //Determines win, loss, or draw
    public int compareTo(Item item) {
        if (item instanceof Scissors || item instanceof Lizard) return 1; // Rock beats Scissors and Lizard
        else if (item instanceof Paper || item instanceof Spock) return -1; // Rock loses to Paper and Spock
        else return 0; // Draw
    }

    @Override
    //Converts to string
    public String toString() {
        return "Rock";
    }

    @Override
    //Returns name of the item
    public String getName() {
        return "Rock";
    }
}
