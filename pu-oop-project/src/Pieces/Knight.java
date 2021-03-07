package Pieces;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Knight extends JFrame {
    private int row;
    private int col;

    public Knight(int row, int col) {

        this.row      = row;
        this.col      = col;
    }

    private int RandPiece() {
        Random random = new Random();
        int rand = random.nextInt(5);
        while (rand == 2) {
            rand = random.nextInt(5);
        }
        return rand;
    }
    public void KnightPiece(Graphics g){

        int kp1 = RandPiece();
        int kp2 = RandPiece();
        int kp3 = RandPiece();
        int kp4 = RandPiece();

        g.setColor(Color.BLUE);
        g.fillOval((kp1*100)+10, 15, 65, 65);
        g.fillOval((kp2*100)+10, 115, 65, 65);

        g.setColor(Color.BLUE);
        g.fillOval((kp3*100)+10,515 , 65, 65);
        g.fillOval((kp4*100)+10, 615, 65, 65);
    }
}
