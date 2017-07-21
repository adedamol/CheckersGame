/**
 * Created by Ade on 5/3/2017.
 */
public class CheckersGameBoard {
    CheckersGamePiece[][] board;


    public CheckersGameBoard() {
        board = new CheckersGamePiece[8][8];

    }



    public void makeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
//
                if (((i == 0 || i == 2) && (j % 2 == 1)) ||
                        (i == 1 && (j % 2 == 0)))
                    board[i][j] = new CheckersGamePiece(false, i, j);

                else if (((i == 5 || i == 7) && (j % 2 == 0)) ||
                        (i == 6 && (j % 2 == 1)))
                    board[i][j] = new CheckersGamePiece(true, i, j);

                else
                    board[i][j] = null;
            }
            }


        }


    public void drawBoard() {
        System.out.println("  0   1   2   3   4   5   6   7 ");
        System.out.println("*********************************");
        for (int i = 0; i<8;i++){
            for(int j = 0;j<8;j++){
                if (board [i][j] == null){
                    System.out.print("|   ");

                }

                else if (board [i][j].isBlank()){
                    System.out.print("|(X)");
                }
                else{
                    System.out.print("|(Y)");
                }
                //System.out.print("|");
                // System.out.println("********************************");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("*********************************");
           // System.out.println("\n  0   1   2   3   4   5   6   7 ");
        }

    }


}