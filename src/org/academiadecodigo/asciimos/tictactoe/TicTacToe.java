package org.academiadecodigo.asciimos.tictactoe;

import java.util.List;

public class TicTacToe {


    public TicTacToe(int boardSize) {
        GameBoard gameBoard = new GameBoard(boardSize);
    }

    public void init(List<Player> players) {

        int requiredPlayers = 2;

        if (players.size() != 2) {
            throw new IllegalArgumentException("Two players are required to play.");
        }

    }

    public void start() {

    }
}
