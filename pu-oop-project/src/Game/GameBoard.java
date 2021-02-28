package Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {
    private ArrayList<Object> pieces;

    public GameBoard(){

        this.setSize(900,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 7; col++){

                GameTile tile = new GameTile(row, col);
                tile.render(g);
                tile.boardGrid(g);
            }
        }
    }
}
