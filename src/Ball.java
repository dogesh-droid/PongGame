import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed=3;
    Ball(int x,int y,int width,int height){
        super(x,y,width,height);
        random=new Random();
        int randomXDirection=random.nextInt(2);
        if(randomXDirection == 0) randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);


        int randomYDirection=random.nextInt(2);
        if(randomYDirection == 0) randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);

    }
    public void setYDirection(int RandomYDirection){
        yVelocity=RandomYDirection;

    }
    public void setXDirection(int RandomXDirection){
        xVelocity=RandomXDirection;

    }
    public void move(){
        x+=xVelocity;
        y+=yVelocity;

    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);

    }
}
