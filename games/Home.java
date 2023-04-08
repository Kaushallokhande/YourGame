package games;
import java.io.IOException;
import java.util.Scanner;

public class Home {

    public static void main(String[] args) throws IOException {
        int idx  = 1;
        while (idx>0) {

            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("=========================================");
            System.out.print("Enter numbers of players:-");

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            System.out.println();
            System.out.print("Enter players name:-");
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }
            System.out.println();
            System.out.println("=========Welcome to YourGames...=========");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + "." + str[i]);
            }


            System.out.println();
            System.out.println("Select your game:");
            System.out.println("1.TicTacToe");
            System.out.println("2.Guess the number");
            System.out.println("3.Quiz Maths");
            System.out.print("Enter your game number:-");

            idx = sc.nextInt();


            switch (idx) {
                case 1:
                    if (n != 2) {
                        System.out.println("only two players required");
                        System.out.println();
                        break;
                    } else {
                        NewTTT.main(str);
                        System.out.println("===========The End==========");
                        idx =0;
                        break;
                    }
                case 2:
                    if (n != 1) {
                        System.out.println("only One player is required");
                        System.out.println();
                        break;
                    } else {
                        GuessTheNumber.main(str);
                        System.out.println("===========The End==========");
                        idx = 0;
                        break;
                    }
                case 3:
                    if (n != 1){
                    System.out.println("only One player is required");
                    System.out.println();
                    break;
                    }else {
                        QuizMaths.main(str);
                        break;
                    }
                default:
                    System.out.println("invalid value");
            }

        }
    }
}
