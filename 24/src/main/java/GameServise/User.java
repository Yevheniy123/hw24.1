package GameServise;

import java.util.Scanner;

public class User {

    public Player newPlayer() {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Please enter your name");
        System.out.print("Name: ");
        player.setName(sc.nextLine());
        System.out.println("Please enter count of game rounds");
        System.out.print("Rounds: ");
        player.setGameRound(sc.nextInt());
        return player;
    }
}
