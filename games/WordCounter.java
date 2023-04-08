package games;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Word Counter---------");
        System.out.println();
        System.out.println("enter paragraph");
        System.out.println("________________________________");
        String str = sc.nextLine();

        int words = 0;
        int lines = 0;
        int chart = 0;
        System.out.println("________________________________");
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) != ' '){
                chart++;
            }
            if (str.charAt(i) == '.'){
                lines++;
            }
            if (str.charAt(i) == ' ' || str.charAt(i) == '.'){
                words++;
            }
        }
        System.out.println();
        System.out.println("Words -> "+words);
        System.out.println("lines -> "+ lines);
        System.out.println("Characters -> "+chart);

    }
}
