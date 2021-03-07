package Pieces;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Dwarf extends JFrame{
  
    private int row;
    private int col;

    public Dwarf(int row, int col) {

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
    public void DwarfPiece(Graphics g){

        int dp1 = RandPiece();
        int dp2 = RandPiece();

        g.setColor(Color.RED);
        g.fillOval((dp1*100)+10, 15, 65, 65);
        g.fillOval((dp2*100)+10, 115, 65, 65);
    }
}
