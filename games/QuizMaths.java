package games;

import java.util.Scanner;

public class QuizMaths {

    public static int rand2(int ran1){
        ran1 = (int) (Math.random() * 999) + 1;
        int a = 1;
        while (a >0){
            if (ran1 >=10 && ran1<=99){
                a = 0;
            }else {
                ran1 = (int) (Math.random() * 999) + 1;
            }
        }
        return ran1;
    }
    public static int rand3(int ran1){
        ran1 = (int) (Math.random() * 999) + 1;
        int a = 1;
        while (a >0){
            if (ran1 >=100 && ran1<=999){
                a = 0;
            }else {
                ran1 = (int) (Math.random() * 999) + 1;
            }
        }
        return ran1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        int Ten = 0;

        System.out.println("==================================================");
        System.out.println("Enter Mathematical operation want to play:\n  '+'\t '-'\t'*'\t  '/'");
        String op = sc.nextLine();

        System.out.println("__________________________________________________");
        System.out.println("Enter Quiz of level:\n1.Easy\n2.Medium\n3.Hard");
        System.out.println("__________________________________________________");
        int level = sc.nextInt();


        switch (op){
            case "+":
                switch (level){

                case 1:
                    while (flag>0) {
                        int random11 = (int) (Math.random() * 9) + 1;
                        int random12 = (int) (Math.random() * 9) + 1;

                        System.out.print(random11 + " + " + random12 + " = ");
                        int ans1 = sc.nextInt();
                        if (ans1 == random11 + random12) {
                            System.out.println("Congrats..");
                        }
                        Ten++;
                        if (Ten == 7){
                            System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                            int str = sc.nextInt();

                            if (str == 1){
                                QuizMaths.main(args);

                            }else if(str == 2){
                                Ten = 0;
                            }else {
                                flag = 0;
                            }
                        }

                    }
                case 2:
                    while (flag>0) {
                        int random21 = rand2(0);
                        int random22 = rand2(0);


                        System.out.print(random21 + " + " + random22 + " = ");
                        int ans2 = sc.nextInt();
                        if (ans2 == random21 + random22) {
                            System.out.println("Congrats..");

                        }Ten++;
                        if (Ten == 7){
                            System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                            int str = sc.nextInt();

                            if (str == 1){
                                QuizMaths.main(args);

                            }else if(str == 2){
                                Ten = 0;
                            }else {
                                flag = 0;
                            }
                        }

                    }
                case 3:
                    while (flag>0) {
                        int random21 = rand3(0);
                        int random22 = rand3(0);


                        System.out.print(random21 + " + " + random22 + " = ");
                        int ans2 = sc.nextInt();
                        if (ans2 == random21 + random22) {
                            System.out.println("Congrats..");

                        }Ten++;
                        if (Ten == 7){
                            System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                            int str = sc.nextInt();

                            if (str == 1){
                                QuizMaths.main(args);

                            }else if(str == 2){
                                Ten = 0;
                            }else {
                                flag = 0;
                            }
                        }

                    }

            }
            case "-":
                switch (level){

                    case 1:
                        while (flag>0) {
                            int random11 = (int) (Math.random() * 9) + 1;
                            int random12 = (int) (Math.random() * 9) + 1;

                            System.out.print(random11 + " - " + random12 + " = ");
                            int ans1 = sc.nextInt();
                            if (ans1 == random11 - random12) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 2:
                        while (flag>0) {
                            int random21 = rand2(0);
                            int random22 = rand2(0);


                            System.out.print(random21 + " - " + random22 + " = ");
                            int ans2 = sc.nextInt();
                            if (ans2 == random21 - random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 3:
                        while (flag>0) {
                            int random21 = rand3(0);
                            int random22 = rand3(0);


                            System.out.print(random21 + " - " + random22 + " = ");
                            int ans2 = sc.nextInt();
                            if (ans2 == random21 - random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }

                }
            case "/":
                switch (level){

                    case 1:
                        while (flag>0) {
                            int random11 = (int) (Math.random() * 9) + 1;
                            int random12 = (int) (Math.random() * 9) + 1;

                            System.out.print(random11 + " / " + random12 + " = ");
                            float ans1 = sc.nextFloat();
                            float valu = (float)random11 / random12;
                            if (ans1 == valu) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 2:
                        while (flag>0) {
                            int random21 = rand2(0);
                            int random22 = rand2(0);


                            System.out.print(random21 + " / " + random22 + " = ");
                            float ans2 = sc.nextFloat();
                            if (ans2 == (float) random21 / random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 3:
                        while (flag>0) {
                            int random21 = rand3(0);
                            int random22 = rand3(0);


                            System.out.print(random21 + " / " + random22 + " = ");
                            float ans2 = sc.nextFloat();
                            if (ans2 == (float) random21 / random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }

                }
            case "*":
                switch (level){

                    case 1:
                        while (flag>0) {
                            int random11 = (int) (Math.random() * 9) + 1;
                            int random12 = (int) (Math.random() * 9) + 1;

                            System.out.print(random11 + " * " + random12 + " = ");
                            int ans1 = sc.nextInt();
                            if (ans1 == random11 * random12) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 2:
                        while (flag>0) {
                            int random21 = rand2(0);
                            int random22 = rand2(0);


                            System.out.print(random21 + " * " + random22 + " = ");
                            int ans2 = sc.nextInt();
                            if (ans2 == random21 * random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }
                    case 3:
                        while (flag>0) {
                            int random21 = rand3(0);
                            int random22 = rand3(0);

                            System.out.print(random21 + " * " + random22 + " = ");
                            int ans2 = sc.nextInt();
                            if (ans2 == random21 * random22) {
                                System.out.println("Congrats..");

                            }Ten++;
                            if (Ten == 7){
                                System.out.println("if you want to try new levels then enter number\n|| 1.yes ||\t|| 2.no ||");

                                int str = sc.nextInt();

                                if (str == 1){
                                    QuizMaths.main(args);

                                }else if(str == 2){
                                    Ten = 0;
                                }else {
                                    flag = 0;
                                }
                            }

                        }

                }
            default:
                System.out.println("Invalid number");
                break;
        }

    }
}
