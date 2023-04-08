package games;

import java.util.Random;
import java.util.Scanner;

public class randomName {

    public static void ranName(String name1,String name2){
        int size1 = name1.length();
        Random ran1 = new Random();

        int value1 = ran1.nextInt(size1);

        int size2 = name2.length();
        Random ran2 = new Random();

        int value2 = ran2.nextInt(size2);

        while (value1<2) {
            if (value1 < 2) {
                value1 = ran1.nextInt(size1);
            }
        }
        while (value2<2) {
            if (value2 < 2) {
                value2 = ran2.nextInt(size2);
            }
        }
        System.out.print("# ");
        for (int i = 0; i<value1 ; i++){
            System.out.print(name1.charAt(i));
        }
        for (int i = 0; i<value2 ; i++){
            System.out.print(name2.charAt(i));
        }

    }


    public static void main(String[] args) {
        int idx = 1;
        while (idx >0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two name:");
            String name1 = sc.nextLine();
            String name2 = sc.nextLine();


            ranName(name1,name2);
            System.out.println();
        }

    }

}
