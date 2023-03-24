package controller;

import views.gameboard.JFWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener, IData {

    private Integer row, col;
    private Integer state;
    private JFWindow window;

    public Controller() {
        window = new JFWindow(this, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(row + " " + col);
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
        System.out.println(row + " " + col);
    }
}
