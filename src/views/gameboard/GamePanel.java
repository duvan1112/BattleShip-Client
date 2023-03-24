package views.gameboard;

import controller.IData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {

    private String row,col;
    private Integer state,score;
    private Table panelTable;
    public GamePanel(ActionListener actionListener, IData iData) {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new GridLayout(2,0));
        panel.add(new JLabel("BattleShip",SwingConstants.CENTER));
        panel.add(new JLabel("Score: "+ score));
        add(panel,BorderLayout.NORTH);


        panelTable = new Table(actionListener, iData);
        add(panelTable,BorderLayout.CENTER);
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Table getPanelTable() {
        return panelTable;
    }

    public void setPanelTable(Table panelTable) {
        this.panelTable = panelTable;
    }
}
