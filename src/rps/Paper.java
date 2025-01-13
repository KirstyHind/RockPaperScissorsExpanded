class Paper extends Item {
    // Override method to compare paper with another item
    @Override
    //Determines win, loss, or draw
    public int compareTo(Item item) {
        if (item instanceof Rock || item instanceof Spock) return 1; // Paper beats Rock and Spock
        else if (item instanceof Scissors || item instanceof Lizard) return -1; // Paper loses to Scissors and Lizard
        else return 0; // Draw
    }

    @Override
    //Converts to string
    public String toString() {
        return "Paper";
    }

    @Override
    //Returns name of the item
    public String getName() {
        return "Paper";
    }
}