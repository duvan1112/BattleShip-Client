package controller;

import network.Client;
import views.gameboard.JFWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener, IData {

    private int row, col, score;
    private boolean isWinner;
    private int state; // 0=> sin estado   1=>Le dio a un barco  2=>Falló
    private JFWindow window;
    private Client client;

    public Controller() {
        window = new JFWindow(this, this);
        client = new Client();
        isWinner = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public Integer getRow() {
        return row;
    }

    @Override
    public Integer getCol() {
        return col;
    }

    @Override
    public Integer getStatus() {
        return state;
    }

    @Override
    public void setStatus(int status) {
        this.state = status;
    }

    @Override
    public Integer getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public void sendInfo() {
        client.sendInfo(this);
    }

    @Override
    public boolean isWinner() {
        return isWinner;
    }

    @Override
    public void setIsWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }
}
