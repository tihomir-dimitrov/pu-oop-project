package Game;

import java.awt.*;
import java.util.Random;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }

    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        if (
                (this.row == 0 && this.col == 0) ||
                (this.row == 0 && this.col == 2) ||
                (this.row == 0 && this.col == 4) ||
                (this.row == 0 && this.col == 6) ||
                (this.row == 0 && this.col == 8) ||
                (this.row == 1 && this.col == 1) ||
                (this.row == 1 && this.col == 3) ||
                (this.row == 1 && this.col == 5) ||
                (this.row == 1 && this.col == 7) ||

                (this.row == 5 && this.col == 0) ||
                (this.row == 5 && this.col == 2) ||
                (this.row == 5 && this.col == 4) ||
                (this.row == 5 && this.col == 6) ||
                (this.row == 6 && this.col == 1) ||
                (this.row == 6 && this.col == 3) ||
                (this.row == 6 && this.col == 5) ||
                (this.row == 6 && this.col == 7)
        ){
            g.setColor(Color.GRAY);

        } else if (
                (this.row == 1 && this.col == 0) ||
                (this.row == 1 && this.col == 2) ||
                (this.row == 1 && this.col == 4) ||
                (this.row == 1 && this.col == 6) ||
                (this.row == 0 && this.col == 1) ||
                (this.row == 0 && this.col == 3) ||
                (this.row == 0 && this.col == 5) ||
                (this.row == 0 && this.col == 7) ||

                (this.row == 5 && this.col == 1) ||
                (this.row == 5 && this.col == 3) ||
                (this.row == 5 && this.col == 5) ||
                (this.row == 5 && this.col == 7) ||
                (this.row == 6 && this.col == 0) ||
                (this.row == 6 && this.col == 2) ||
                (this.row == 6 && this.col == 4) ||
                (this.row == 6 && this.col == 6)
        ){
            g.setColor(Color.BLACK);

        } else {
            g.setColor(Color.WHITE);

        }

        g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
    }

    //Чертаене на решетката
    void boardGrid(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i <= 660; i += 100) {
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
