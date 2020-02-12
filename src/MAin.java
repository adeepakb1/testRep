import Arrays.Ar;
import Chess.Board;

import java.util.ArrayList;

public class MAin {


    public static void main(String [] args){
        /*int [] a ={1,2,3,4,5,6,7,8,9,10,11,12};
        Ar.cyclicRotation(a);
        for(int a1:a )
        System.out.println(a1);
        *//*System.out.println(System.getProperty("user.dir"));*/

        ArrayList<Board> boards = new ArrayList<>();

        Board board1 = new Board();
        for(Board board: boards){
            if(board==board1){
                System.out.println("Found succes");
            }
        }
    }
}
