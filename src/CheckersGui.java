import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Created by Ade on 5/20/2017.
 */
public class CheckersGui extends JFrame {


    private Container contents;

    //components
    private JButton[][] squares = new JButton[8][8];

    //colors
    private Color  colorBlue = Color.blue;

    //current position
    //upper left corner of board is 0
    private int row = 7;
    private int col = 1;

    private ImageIcon piece = new ImageIcon("trc.png");
    private ImageIcon piece2 = new ImageIcon("pc2.png");
    private JPanel panel1;

    public CheckersGui(){
        super("Checkers game board");
        contents = getContentPane();
        contents.setLayout(new GridLayout(8,8));

        //event handlers:
        ButtonHandler buttonHandler = new ButtonHandler();


        //create board
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                squares[i][j] = new JButton();
                if ((i+j) % 2 != 0){
                    squares[i][j].setBackground(colorBlue);
                   //squares[i][j].setIcon(piece);
                }
                if(((i == 5 || i == 7) && (j % 2 == 0)) ||
                        (i == 6 && (j % 2 == 1))){
                    squares[i][j].setIcon(piece);
                }else if (((i == 0 || i == 2) && (j % 2 == 1)) ||
                        (i == 1 && (j % 2 == 0))){
                    squares[i][j].setIcon(piece2);
                }
                contents.add(squares[i][j]);
                squares[i][j].addActionListener(buttonHandler);
            }
        }

        //squares[row][col].setIcon(piece);
        setSize(1000,1000);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private boolean isValidMove(int i, int j){
  int rowD=Math.abs(i-row);
  int colD = Math.abs(j-col);
if ((rowD==1)&&(colD == 2)){
    return true;
}if((rowD==2)&& (colD==1)){
    return true;
        }return false;
    }
    private void processClick(int i, int j){
        if (isValidMove(i,j)== false){
            return;
        }
        squares[row][col].setIcon(null);
        squares[i][j].setIcon(piece);
        row =i;
        col=j;
    }

    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            for(int i =0; i<8;i++){
                for(int j=0;j<8;j++){
                    if (source ==squares[i][j]){
                        processClick(i,j);
                        return;
                    }
                }
            }
        }

        }

    public static void main(String [] args){
      //  JFrame frame = new JFrame();
//        frame.setSize(600,600);
//      frame.add(new CheckersGui());
        CheckersGui x = new CheckersGui();
        x.processClick(2,3);
              //x.drawBoard();
//        frame.setLocationRelativeTo(null);
//        frame.setBackground(Color.LIGHT_GRAY);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
}

