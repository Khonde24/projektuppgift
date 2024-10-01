package se.moise.projektuppgift;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Välkommen till min Yatzy poäng spel! ");

//---------------------------------------------------------------------------------------------->

        System.out.println("Ange ditt namn: för spelare 1: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Ange ditt namn: för spelare 2: ");
        Player player2 = new Player(scanner.nextLine());

//---------------------------------------------------------------------------------------------->

        while (true) {
            int player1sum = 0;
            int player2sum = 0;

            for (int i = 0; i < 2; i++) {
                int roll = rand.nextInt(6) + 1;
                player1sum += roll;
                System.out.println("Spelare 1: " + player1.getName());
                System.out.println(" Fick poäng " + roll);
                delay();
                System.out.println();
                player1.extraMarkers();

//------------------------------------------------------------------------------------------->
            }

            for (int i = 0; i < 2; i++) {
                int roll = rand.nextInt(6) + 1;
                player2sum += roll;
                System.out.println("Spelare 2: " + player2.getName());
                System.out.println(" Fick poäng " + roll);
                delay();
                System.out.println();
                player2.extraMarkers();

//-------------------------------------------------------------------------------------------->

            }

            System.out.println(player1.getName() + " " + player1sum);
            System.out.println(player2.getName() + " " + player2sum);

            if (player1sum > player2sum) {
                System.out.println("Spelare 1 vann!");
            } else if (player1sum < player2sum) {
                System.out.println("Spelare 2 vann!");
            } else {
                System.out.println("OAVGJORT");
            }

//------------------------------------------------------------------------------------------->

            System.out.println("Vill du försöka/spela igen? (JA/NEJ): ");
            String response = scanner.nextLine();
            if(response.equals("NEJ")) {
                System.out.println("Tack för att du spelade spelet...! ");
                break;
            }

        }
    }

    private static void delay() {
        try {

            Thread.sleep(2000);

        }catch (InterruptedException e){
            System.out.println("Stopp.");
        }
    }

}

