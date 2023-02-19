package ru.netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName1) {
        super("Name of player " + playerName1 + " not found");
    }
}