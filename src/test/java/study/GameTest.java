package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void PlayersSvetaWon() {
        Game game = new Game();

        Player sveta = new Player(15, "Sveta", 140);
        Player vasia = new Player(11, "Vasia", 110);

        game.register(sveta);
        game.register(vasia);
        int actual = game.round("Sveta", "Vasia");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayersSvetaLost() {
        Game game = new Game();

        Player sveta = new Player(15, "Sveta", 100);
        Player vasia = new Player(11, "Vasia", 110);

        game.register(sveta);
        game.register(vasia);
        int actual = game.round("Sveta", "Vasia");
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayersSvetaEquals() {
        Game game = new Game();

        Player sveta = new Player(15, "Sveta", 110);
        Player vasia = new Player(11, "Vasia", 110);

        game.register(sveta);
        game.register(vasia);
        int actual = game.round("Sveta", "Vasia");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayersNotReg() {
        Game game = new Game();

        Player sveta = new Player(15, "Sveta", 110);
        Player vasia = new Player(11, "Vasia", 110);

        game.register(sveta);
        game.register(vasia);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Marina", "Nikita");
        });
    }

    @Test
    public void OnePlayersNotReg() {
        Game game = new Game();

        Player sveta = new Player(15, "Sveta", 110);
        Player vasia = new Player(11, "Vasia", 110);

        game.register(sveta);
        game.register(vasia);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Sveta", "Nikita");
        });
    }

    @Test
    public void getIdPlayers() {

        Player sveta = new Player(15, "Sveta", 110);

        int actual = sveta.getId();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIdPlayers() {

        Player sveta = new Player(15, "Sveta", 110);
        sveta.setId(17);
        int actual = sveta.getId();
        int expected = 17;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNamePlayers() {

        Player sveta = new Player(15, "Sveta", 110);

        String actual = sveta.getName();
        String expected = "Sveta";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNamePlayers() {

        Player sveta = new Player(15, "Sveta", 110);
        sveta.setName("Natasha");
        String actual = sveta.getName();
        String expected = "Natasha";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStringhtPlayers() {

        Player sveta = new Player(15, "Sveta", 110);

        int actual = sveta.getStringht();
        int expected = 110;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStringhtPlayers() {

        Player sveta = new Player(15, "Sveta", 110);
        sveta.setStringht(1500);
        int actual = sveta.getStringht();
        int expected = 1500;
        Assertions.assertEquals(expected, actual);
    }

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    public void AddAndCheckPlayersInfo() {

        game.register(new Player(15, "Sveta", 110));
        game.register(new Player(11, "Vasia", 101));

        HashMap<String, Player> playerHashMap = game.playerHashMap;

        Player svetaPlayer = playerHashMap.get("Sveta");
        assertEquals("Sveta", svetaPlayer.getName());
        assertEquals(110, svetaPlayer.getStringht());
    }

}
