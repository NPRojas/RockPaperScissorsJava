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

    public static void main(String[] args) {

    }
}