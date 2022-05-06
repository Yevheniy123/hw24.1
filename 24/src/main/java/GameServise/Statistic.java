package GameServise;

public class Statistic {
    Player player = new Player();

    public void endGame(Player player) {
        System.out.println("===============================================");
        System.out.println("Statistic");
        System.out.println("Player name: " + player.getName());
        System.out.println("Game rounds: " + player.getGameRound());
        System.out.println("User win: " + player.getUserWin());
        System.out.println("User louse: " + player.getUserLouse());
        System.out.println("Tie rounds: " + player.getTieRounds());
        System.out.println("===============================================");
    }

}
