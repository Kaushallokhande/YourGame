package games;
import java.util.*;
public class NewTTT {
        static char[][] board = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        static char currentPlayer = 'X';
        static Scanner sc;

        public NewTTT() {
        }

        public static void main(String[] args) {
            while(true) {
                printBoard();
                System.out.print("Enter row and column for " + currentPlayer + ": ");
                int row = sc.nextInt() - 1;
                int col = sc.nextInt() - 1;
                if (!placeMark(row, col)) {
                    System.out.println("Place already filled. Try again.");
                } else {
                    if (isWinning(currentPlayer)) {
                        System.out.println(currentPlayer + " has won!");
                    } else {
                        if (!isDraw()) {
                            currentPlayer = (char)(currentPlayer == 'X' ? 79 : 88);
                            continue;
                        }

                        System.out.println("It's a draw.");
                    }

                    return;
                }
            }
        }

        static boolean placeMark(int row, int col) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                return true;
            } else {
                return false;
            }
        }

        static void printBoard() {
            System.out.println("=========Start Game..=========");
            System.out.println(" 1 2 3");

            for(int i = 0; i < 3; ++i) {
                System.out.print(i + 1 + " ");

                for(int j = 0; j < 3; ++j) {
                    System.out.print(board[i][j] + " ");
                }

                System.out.println();
            }

        }

        static boolean isWinning(char player) {
            int i;
            for(i = 0; i < 3; ++i) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    return true;
                }
            }

            for(i = 0; i < 3; ++i) {
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                    return true;
                }
            }

            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            } else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            } else {
                return false;
            }
        }

        static boolean isDraw() {
            for(int i = 0; i < 3; ++i) {
                for(int j = 0; j < 3; ++j) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }

            return true;
        }

        static {
            sc = new Scanner(System.in);
        }
    }

