
import java.util.Scanner;

public class TicTacToe {
 public static void main(String[] args) {
 int n = 3;
  // Board size
char[][] board = new char[n][n];
initializeBoard(board);

Scanner scanner = new Scanner(System.in);
System.out.println("Tic Tac Toe is ready for play!\n");

System.out.print("Enter name for Player 1 (X): ");
String player1 = scanner.nextLine();
System.out.print("Enter name for Player 2 (O): ");
String player2 = scanner.nextLine();

boolean player1Turn = true;
boolean gameEnded = false;

while (!gameEnded) {
drawBoard(board);
if (player1Turn) {
 System.out.println(player1 + "'s Turn (X):");
} else {
  System.out.println(player2 + "'s Turn (O):");
}

            int row, col;
            while (true) {
                System.out.print("Enter row (0, 1, or 2): ");
                row = scanner.nextInt();
                System.out.print("Enter column (0, 1, or 2): ");
                col = scanner.nextInt();

                if (row < 0 || row >= n || col < 0 || col >= n) {
                    System.out.println("Position is off the board! Try again.");
                } else if (board[row][col] != '-') {
                    System.out.println("Position already taken! Try again.");
                } else {
                    break;
                }
            }

            board[row][col] = player1Turn ? 'X' : 'O';

            if (hasPlayerWon(board, player1Turn ? 'X' : 'O')) {
                drawBoard(board);
                System.out.println((player1Turn ? player1 : player2) + " has won!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                drawBoard(board);
                System.out.println("It's a tie!");
                gameEnded = true;
            } else {
                player1Turn = !player1Turn;
            }
        }
        scanner.close();
    }

    // Initialize the board with dashes to represent empty cells
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current state of the board
    public static void drawBoard(char[][] board) {
        System.out.println("Board:");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " "); // Add space for readability
            }
            System.out.println();
        }
    }

    // Check if the given player has won
    public static boolean hasPlayerWon(char[][] board, char player) {
        int n = board.length;

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            if (checkRow(board, i, player) || checkColumn(board, i, player)) {
                return true;
            }
        }

        // Check diagonals
        return checkDiagonal1(board, player) || checkDiagonal2(board, player);
    }

    private static boolean checkRow(char[][] board, int row, char player) {
        for (int col = 0; col < board.length; col++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumn(char[][] board, int col, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonal1(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonal2(char[][] board, char player) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][n - 1 - i] != player) {
                return false;
            }
        }
        return true;
    }

    // Check if the board is full (tie condition)
    public static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                if (c == '-') {
                    return false;
                }
            }
        }
        return true;
}
}