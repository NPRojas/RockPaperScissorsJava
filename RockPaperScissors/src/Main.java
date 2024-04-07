import java.util.Locale;
import java.util.Scanner;

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

    public static String getUserMove () {
        // Declare the scanner
        Scanner reader = new Scanner(System.in);
        //Prompt the user to enter move
        System.out.println("Pick your move: rock, paper, or scissors?");
        // Gets user input
        return reader.next().toLowerCase();
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
        // waits for input for player 1
        String player1 = getUserMove();
        // sets a move for player 2
        String player2 = createRandomChoice();

        // stores the winner for the match
        String winnerOfRound = declareWinner(player1,player2);

        System.out.println("Player 1 chooses " + player1);
        System.out.println("Player 2 chooses " + player2);
        System.out.println(winnerOfRound);
    }
}