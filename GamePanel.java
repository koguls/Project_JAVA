import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.Random;
import java.util.Timer;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements ActionListener {


    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyparts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel(){
        
    }




    
    public void paintComponent(){

    }

    public void draw(){
        
    }

    public void appleEat(){

    }

    public void move(){

    }
    public void checkApple(){

    }
    public void chechCollisions(){

    }
    public void gameOver(){

    }

    @Override 
    public void actionPerformed(ActionEvent e){


    }

public class MyKeyAdapter extends KeyAdapter{

}
    
}
