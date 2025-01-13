class Scissors extends Item {
    // Override method to compare paper with another item
    @Override
    //Determines win, loss, or draw
    public int compareTo(Item item) {
        if (item instanceof Paper || item instanceof Lizard) return 1; // Scissors beat Paper and Lizard
        else if (item instanceof Rock || item instanceof Spock) return -1; // Scissors lose to Rock and Spock
        else return 0; // Draw
    }

    @Override
    //Converts to string
    public String toString() {
        return "Scissors";
    }

    @Override
    //Returns name of the item
    public String getName() {
        return "Scissors";
    }
}