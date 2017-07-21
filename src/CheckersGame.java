/**
 * Created by Ade on 5/3/2017.
 */
import java.util.*;
public class CheckersGame implements CheckersGameInterface{

    public void movePlayer(int oldX, int oldY, int newX, int newY){

      for (int i =0;i<8;i++){
          for (int j=0;j<8;j++){
              //CheckersGamePiece y = new CheckersGamePiece(false,oldX,oldY);

          }
      }

    }


    public static void main (String [] args){
        CheckersGameBoard checkers = new CheckersGameBoard();
        checkers.makeBoard();
        checkers.drawBoard();
    }
    }
