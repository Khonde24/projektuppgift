//package se.moise.projektuppgift;
//
//
//import java.util.Scanner;
//
//public class Game {
//    private Player player1;
//    private Player player2;
//    private Dice dice;
//    private Scanner scanner;
//
//    public yatzyGame() {
//        player1 = new Player(name1);
//        player2 = new Player(name2);
//        dice = new Dice();
//        scanner = new Scanner(System.in);
//    }
//
//    public yatzyGame(String name1, String name2) {
//
//    }
//
//    public void start() {
//        boolean gameRunning = true;
//        int round = 1;
//
//        while (gameRunning) {
//            System.out.println("Round " + round);
//            takeTurn(player1);
//            takeTurn(player2);
//
//// Här kontroller jag om spelet är över(för enkelhetens skulle kan jag avluta efter några rundor)
//
//            if (round >= 5){
//                gameRunning = false;
//            }
//
//            round++;
//        }
//    }
//
//    // Här avslutar spelet och visar resultat
//    void showFinalScores();
//
//    private void showFinalScores() {
//
//    }
//

//}