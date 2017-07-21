/**
 * Created by Ade on 5/3/2017.
 */
public class CheckersGamePiece{
    int piece1;
   int  piece2;
    boolean blank;

    public CheckersGamePiece(boolean blank, int piece1,int piece2){
        this.piece1=piece1;
      this.piece2 =piece2;
        this.blank = blank;

    }

    public int getPiece1() {
        return piece1;
    }

    public void setPiece1(int piece1) {
        this.piece1 = piece1;
    }

    public int getPiece2() {
        return piece2;
    }

    public boolean isBlank() {
        return blank;
    }

    public void setBlank(boolean blank) {
        this.blank = blank;
    }

    public void setPiece2(int piece2) {
        this.piece2 = piece2;
    }
}