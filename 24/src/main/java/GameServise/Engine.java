package GameServise;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
public class Engine {
    public void runGame() throws IOException, URISyntaxException {
        Player player = new User().newPlayer();
       new GameProcess().startGame(player);
    }


}
