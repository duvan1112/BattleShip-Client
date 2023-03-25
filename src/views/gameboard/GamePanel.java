package views.gameboard;

import controller.IData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    private int score;
    private JLabel sc;
    private Table panelTable;

    public GamePanel(ActionListener actionListener, IData iData) {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new GridLayout(2, 0));
        panel.add(new JLabel("BattleShip", SwingConstants.CENTER));
        sc = new JLabel("Score: "+ score);
        panel.add(sc);
        add(panel, BorderLayout.NORTH);


        panelTable = new Table(actionListener, iData);
        add(panelTable, BorderLayout.CENTER);
    }

    public void updateScore(IData data){
        sc.setText("Score: "+ data.getScore());
    }

}
