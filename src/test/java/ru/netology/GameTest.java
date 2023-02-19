package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void testThenPlayer1IsWiner() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 20);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly", "Oly");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testThenPlayer2IsWiner() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 200);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly", "Oly");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testThenNoWiner() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 100);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Koly", "Oly");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testThenPlayer1NotFound() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 20);
        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Katy", "Oly"));

    }

    @Test
    public void testThenPlayer2NotFound() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 20);
        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Koly", "Toly"));

    }

    @Test
    public void testThenPlayersNotFound() {
        Game game = new Game();
        Player player1 = new Player(25, "Koly", 100);
        Player player2 = new Player(45, "Oly", 20);
        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Ivan", "Boris"));

    }
}


