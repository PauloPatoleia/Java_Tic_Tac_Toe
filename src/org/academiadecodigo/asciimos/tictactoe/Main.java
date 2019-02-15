package org.academiadecodigo.asciimos.tictactoe;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int boardSize = 3;

        TicTacToe ticTacToe = new TicTacToe();

        LinkedList<Player> players = new LinkedList<Player>();

        players.add(new Player("Jim"));
        players.add(new Player("Tom"));

        ticTacToe.init(players);

        ticTacToe.start();

    }
}
