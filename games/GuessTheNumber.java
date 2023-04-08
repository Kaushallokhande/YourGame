package games;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        int tries = 0;
        int flag;
        System.out.println("====================================");
        boolean win = false;
        Scanner sc = new Scanner(System.in);


        System.out.println("Select level:\n1.Easy"+"  "+"\t(Guess the number b/w 1-10)\n" );
        System.out.println("2.Normal\t(Guess the number b/w 1-100)\n");
        System.out.println("3.High"+"  "+ "\t(Guess the number b/w 1-1000)");
        System.out.print("Enter Level number:");
        flag = sc.nextInt();
        System.out.println();
        System.out.println("====================================");

        switch (flag){
            case 1:int randomNumber = (int) (Math.random() * 10) +1;//*
                while (win == false){
                    tries++;
                    System.out.println("Select random no. 1-10");
                    int guess = sc.nextInt();
                    if (randomNumber == guess){
                        System.out.println("Congrats..");
                        System.out.println("Number of Tries"+ ":" +tries);
                        return;

                    } else if (guess< randomNumber) {
                        System.out.println("too low");
                    }else {
                        System.out.println("too high");
                    }

                }
                break;

            case 2:int randomNumber1 = (int) (Math.random() * 100) +1;
            while (win == false){
                tries++;
                System.out.println("Select random no. 1-100");
                int guess = sc.nextInt();
                if (randomNumber1 == guess){
                    System.out.println("Congrats..");
                    System.out.println("Number of Tries"+ ":" +tries);
                    return;

                } else if (guess< randomNumber1) {
                    System.out.println("too low");
                }else {
                    System.out.println("too high");
                }

            }
            break;

            case 3:int randomNumber2 = (int) (Math.random() * 1000) +1;
                while (win == false){
                    tries++;
                    System.out.println("Select random no. 1-1000");
                    int guess = sc.nextInt();
                    if (randomNumber2 == guess){
                        System.out.println("Congrats..");
                        System.out.println("Number of Tries"+ ":" +tries);
                        return;
                    } else if (guess< randomNumber2) {
                        System.out.println("too low");
                    }else {
                        System.out.println("too high");
                    }

                }
                break;

            default:
                System.out.println("Invalid value");
        }







    }
}
