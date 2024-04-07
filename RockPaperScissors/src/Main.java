import java.util.Objects;

public class Main {
    public static String createRandomChoice() {
        // stores a random number from 1 to 3
        int choice = (int) Math.floor(Math.random() * 3);

        // determines players choice
        String move;

        if (choice == 0) {
            move = "rock";
        } else if (choice == 1) {
            move = "paper";
        } else if (choice == 2) {
            move = "scissors";
        } else {
            move = "invalid move";
        }

        return move;
    }

    public static String declareWinner(String player1, String player2) {
        String winner;

        if (player1.equals(player2)) {
            winner = "It's a tie!";
        } else if (player1.equals("paper") && player2.equals("rock") ||
                   player1.equals("rock") && player2.equals("scissors") ||
                   player1.equals("scissors") && player2.equals("paper")) {
            winner = "Player 1 Wins!";

        } else {
            winner = "Player 2 Wins!";
        }

        return winner;
    }

    public static void main(String[] args) {
        // sets a move for player 1
        String player1 = createRandomChoice();
        // sets a move for player 2
        String player2 = createRandomChoice();

        System.out.println("Player 1 chooses " + player1);
        System.out.println("Player 2 chooses " + player2);
    }
}