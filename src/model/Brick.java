package model;

import java.awt.*;

/** Represents a Brick **/
public class Brick extends Sprite {

    private Color brickColor;
    public int brickScore;
    public boolean powerup_Extend;

    public Brick(int BRICK_X_OFFSET,int BRICK_Y_OFFSET, int BRICK_WIDTH, int BRICK_HEIGHT, Color COLOR, int BRICK_SCORE){
        super(BRICK_X_OFFSET, BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT);
        brickColor = COLOR;
        brickScore = BRICK_SCORE;
        powerup_Extend = false;
    }

    // Draws and colors the brick
    public void draw(Graphics g){
        g.setColor(this.brickColor);
        g.fillRect(x, y, width, height);
    }

    // Can't move bricks!
    public void move() throws InvalidMove{
        throw new InvalidMove("Bricks can't move");
    }

    // Gets bounding rectangle of brick
    public Rectangle getBounds(){
        Rectangle bounds = new Rectangle(x, y, width, height);
        return bounds;
    }

    // Sets this brick with a powerup
    public void setPowerup_Extend(Boolean status){
        this.powerup_Extend = status;
    }
}
