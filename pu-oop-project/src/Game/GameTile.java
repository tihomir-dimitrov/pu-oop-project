package Game;

import java.awt.*;
import java.util.Random;

public class GameTile {

    private int row;
    private int col;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {
        BlockedTile(g);
        boardGrid(g);
        Grey(g);
        Green(g);
    }

    //Чертаене на дъската
    public void Green(Graphics g){
        g.setColor(Color.GREEN);

        g.fillRect(100,25,100,75);
        g.fillRect(300,25,100,75);
        g.fillRect(500,25,100,75);
        g.fillRect(700,25,100,75);
        g.fillRect(0,100,100,100);
        g.fillRect(200,100,100,100);
        g.fillRect(400,100,100,100);
        g.fillRect(600,100,100,100);
        g.fillRect(800,100,100,100);

        g.fillRect(100,500,100,100);
        g.fillRect(300,500,100,100);
        g.fillRect(500,500,100,100);
        g.fillRect(700,500,100,100);
        g.fillRect(0,600,100,100);
        g.fillRect(200,600,100,100);
        g.fillRect(400,600,100,100);
        g.fillRect(600,600,100,100);
        g.fillRect(800,600,100,100);
    }

    public void Grey(Graphics g){
        g.setColor(Color.GRAY);

        g.fillRect(0,25,100,75);
        g.fillRect(200,25,100,75);
        g.fillRect(400,25,100,75);
        g.fillRect(600,25,100,75);
        g.fillRect(800,25,100,75);
        g.fillRect(100,100,100,100);
        g.fillRect(300,100,100,100);
        g.fillRect(500,100,100,100);
        g.fillRect(700,100,100,100);

        g.fillRect(0,500,100,100);
        g.fillRect(200,500,100,100);
        g.fillRect(400,500,100,100);
        g.fillRect(600,500,100,100);
        g.fillRect(800,500,100,100);
        g.fillRect(100,600,100,100);
        g.fillRect(300,600,100,100);
        g.fillRect(500,600,100,100);
        g.fillRect(700,600,100,100);
    }

    //Чертаене на решетка
    void boardGrid(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i <= 900; i += 100) {
            for (int j = 0; j <= 700; j += 100) {
                g.drawRect(i, j, 100, 100);
            }
        }
    }
    
        //Непроходими полета
    private int randTiles() {
        Random random = new Random();
        int rand = random.nextInt(7);
        while (rand == 2) {
            rand = random.nextInt(7);
        }
        return rand;
    }

}
