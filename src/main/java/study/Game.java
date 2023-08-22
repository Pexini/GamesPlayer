package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    protected HashMap<String, Player> playerHashMap = new HashMap<>();

    public void register(Player player) {
        playerHashMap.put(player.getName(), player);
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = playerHashMap.get(playerName1);
        Player player2 = playerHashMap.get(playerName2);


        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }
        if (player1.getStringht() > player2.getStringht()) {
            return 1;
        }
        if (player1.getStringht() < player2.getStringht()) {
            return -1;
        } else {
            return 0;
        }
    }
}
