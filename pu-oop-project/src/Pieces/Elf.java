package Pieces;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Elf extends JFrame {
    private int row;
    private int col;

    public Elf(int row, int col) {

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
    public void ElfPiece(Graphics g){

        int ep1 = RandPiece();
        int ep2 = RandPiece();
        int ep3 = RandPiece();
        int ep4 = RandPiece();

        g.setColor(Color.YELLOW);
        g.fillOval((ep1*100)+10, 15, 65, 65);
        g.fillOval((ep2*100)+10, 115, 65, 65);

        g.setColor(Color.YELLOW);
        g.fillOval((ep3*100)+10,515 , 65, 65);
        g.fillOval((ep4*100)+10, 615, 65, 65);
    }
}
