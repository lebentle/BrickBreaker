package ui;

import model.Game;

import javax.swing.*;
import java.awt.*;

/** Represents the score panel **/
@SuppressWarnings("serial")

public class ScorePanel extends JPanel {
    private static final String BRICKS_TEXT = "Bricks Remaining:  ";
    private static final String SCORE_TEXT = "Score:  ";
    private static final int LBL_WIDTH = Game.WIDTH / 2 - 50;
    private static final int LBL_HEIGHT = 40;
    private Game game;
    private JLabel bricksLbl;
    private JLabel scoreLbl;

    // Constructs a score panel
    // effects: sets the background colour and draws the initial labels;
    //          updates this with the game whose score is to be displayed
    public ScorePanel(Game g) {
        game = g;
        setBackground(new Color(54, 54, 54));
        bricksLbl = new JLabel(BRICKS_TEXT + game.getNumBricksLeft(), SwingConstants.LEFT);
        bricksLbl.setPreferredSize(new Dimension(LBL_WIDTH, LBL_HEIGHT));
        //bricksLbl.setFont(new Font("Calibri", Font.BOLD, 14));
        bricksLbl.setForeground(Color.white);
        scoreLbl = new JLabel(SCORE_TEXT + game.getScore(), SwingConstants.LEFT);
        scoreLbl.setPreferredSize(new Dimension(100, LBL_HEIGHT));
        scoreLbl.setForeground(Color.white);
        add(bricksLbl);
        add(Box.createHorizontalStrut(200));
        add(scoreLbl);
    }

    // Updates the score panel
    // modifies: this
    // effects:  updates number of bricks left and score
    public void update() {
        bricksLbl.setText(BRICKS_TEXT + game.getNumBricksLeft());
        scoreLbl.setText(SCORE_TEXT + game.getScore());
        repaint();
    }
}

