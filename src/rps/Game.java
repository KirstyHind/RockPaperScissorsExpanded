import java.util.Random;
import java.util.Scanner;

// Class for game logic
class Game {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public void play() {
        System.out.println("Welcome to Rock Paper Scissors! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Let's play!");

        // Prompt user to choose game mode
        System.out.println("Which game mode do you want to play?");
        System.out.println("1. Regular Version (Rock, Paper, Scissors)");
        System.out.println("2. Big Bang Theory Version (Rock, Paper, Scissors, Lizard, Spock)");
        int gameMode = scanner.nextInt();
        scanner.nextLine();

        // Create array based on the selected game mode
        Item[] availableMoves = initialiseMoves(gameMode);

        int playerWins = 0;
        int computerWins = 0;

        while (true) {
            try {
                System.out.print("Enter your move: ");
                String playerMove = scanner.nextLine().trim().toLowerCase();

                // Holds user's choice
                Item playerItem = null;
                for (Item item : availableMoves) {
                    if (item.getName().equalsIgnoreCase(playerMove)) {
                        playerItem = item;
                        break;
                    }
                }
                if (playerItem == null) {
                    throw new IllegalArgumentException("Invalid move. Please try again.");
                }

                // Computer's randomly chosen item
                Item computerItem = getRandomMove(availableMoves);

                System.out.println("Computer chose: " + computerItem);

                int result = playerItem.compareTo(computerItem);
                if (result < 0) {
                    System.out.println("The computer wins :(");
                    computerWins++;
                } else if (result > 0) {
                    System.out.println("You win! :)");
                    playerWins++;
                } else {
                    System.out.println("It's a draw! :|");
                    System.out.println("Try again");
                    continue;
                }

                while (true) {
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scanner.nextLine().trim().toLowerCase();
                    if (playAgain.equals("yes") || playAgain.equals("y")) {
                        break;
                    } else if (playAgain.equals("no") || playAgain.equals("n")) {
                        System.out.println("Thanks for playing!");
                        System.out.println("Score");
                        System.out.println("Player wins: " + playerWins);
                        System.out.println("Computer wins: " + computerWins);
                        return;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Item[] initialiseMoves(int gameMode) {
        if (gameMode == 1) {
            return new Item[]{new Rock(), new Paper(), new Scissors()};
        } else if (gameMode == 2) {
            return new Item[]{new Rock(), new Paper(), new Scissors(), new Lizard(), new Spock()};
        } else {
            throw new IllegalArgumentException("Invalid game mode. Please choose 1 or 2.");
        }
    }

    private Item getRandomMove(Item[] moveArray) {
        int index = random.nextInt(moveArray.length);
        return moveArray[index];
    }
}
