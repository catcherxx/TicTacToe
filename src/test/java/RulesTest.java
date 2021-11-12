import com.tdd.game.TicTacToe;
import org.junit.Test;
import org.junit.gen5.api.Assertions;

public class RulesTest {
    @Test
    public void testXPined(){
        TicTacToe game = new TicTacToe();
       // game.getBoard().setSymbolAtPosition(1,1, "X");
       // Assertions.assertTrue(game.getBoard().getPossition(1,1).contains("X"));
    }
    @Test
    public void testOPined(){
       // Assertions.assertTrue(new TicTacToe().getBoard().getPossition(1,1).contains("O"));
    }

    @Test
    public void testFinish(){
        //todo define
    }

    @Test
    public void testOutOfBoard(){

    }

    @Test
    public void testPositionIsEmpty(){
       
    }

    @Test
    public void testHorizontalO(){

    }

    @Test
    public void testVerticalO(){

    }

    @Test
    public void testDiagonalO(){

    }

}
