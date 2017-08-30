package model;
import java.awt.*;

public class Ball extends Sprite {
    private int x_velo;
    private int y_velo;
    private boolean is_collided;
    private boolean is_launched;
    private final static int DIAMETER = 10;
    private final static int X_OFFSET = Game.WIDTH / 2;
    private final static int Y_OFFSET = (Paddle.HEIGHT / 2) + (DIAMETER / 2) + Paddle.Y_OFFSET;
    private static final Color COLOR = new Color(65, 150, 188);

    public Ball(){
        super(X_OFFSET, Y_OFFSET, DIAMETER, DIAMETER);
        this.x_velo = 0;
        this.y_velo = 0;
        this.is_collided = false;
        this.is_launched = false;
    }
    public void changevelocity(int x, int y){
        this.x_velo = x;
        this.y_velo = y;
    }

    public boolean getLaunchStatus(){
        return is_launched;
    }

    public boolean getCollisionStatus(){
        return is_collided;
    }

    @Override
    public void move(){
        handleboundary();
        x +=  x_velo;
        y +=  y_velo;
    }

    public void handleboundary() {
        if (y == 0 || y < 0) {
            // TODO // trigger game over
        } else if (y == 0){return;}
    }
    // TODO
    public void draw(Graphics g){
        Color savedCol = g.getColor();
        g.setColor(COLOR);
        g.fillOval(x, y, DIAMETER, DIAMETER);
        g.drawOval(x, y, DIAMETER, DIAMETER);
    }


    // outofbounds f(x) for BALL
    // moves ball position
    //
    // can't move paddle until game starts
}
