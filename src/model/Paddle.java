package model;

import java.awt.*;

/**
 * Created by justi on 8/28/2017.
 */

// TODO
// make game_width
// handle key left, and handle key right in game

public class Paddle extends Sprite {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 10;
    public static final int X_OFFSET =  Game.WIDTH / 2;
    public static final int Y_OFFSET = 50;
    public static final int PADDLE_SPEED = 2;
    public static final Color COLOR = new Color(250,128,20);

    public Paddle(){
        super(WIDTH,HEIGHT,X_OFFSET,Y_OFFSET);
    }

    protected void handleBoundary_x() {
        if (x < 0)
            x = 0;
        else if (x > Game.WIDTH)
            x  = Game.WIDTH;
    }

    public void moveleft(){
        x = x - PADDLE_SPEED;
        handleBoundary_x();
    }

    public void moveright(){
        x = x + PADDLE_SPEED;
        handleBoundary_x();
    }

    public void draw(Graphics g){
        Color currcolour = g.getColor();
        
        createpaddle();



        return;
    }


    public Polygon createpaddle(){
        Polygon paddle = new Polygon();
        paddle.addPoint(0,0);
        paddle.addPoint(0, HEIGHT);
        paddle.addPoint(WIDTH,0);
        paddle.addPoint(WIDTH, HEIGHT);
        return paddle;
    }


    public void move(){
        return;
    }


}
