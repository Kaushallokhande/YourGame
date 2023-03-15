package games;
import java.util.Scanner;

public class GuessTheNumber{

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10) +1;//🌟
        int tries = 0;
        boolean win = false;
        Scanner sc = new Scanner(System.in);
        while (win == false){
            tries++;
            System.out.println("select random no. 1-10");
            int guess = sc.nextInt();
            if (randomNumber == guess){
                System.out.println("Cong..");
                System.out.println("Number of Tries"+ ":" +tries);
            } else if (guess< randomNumber) {
                System.out.println("too low");
            }else {
                System.out.println("too high");
            }

        }
    }
}
