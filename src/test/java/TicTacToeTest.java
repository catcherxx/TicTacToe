import com.tdd.game.TicTacToe;
import org.junit.Test;
import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.DisplayName;


public class TicTacToeTest {
    @DisplayName("Empty Game Board Creation")
    @Test
    public void testEmptyBoard(){
        Assertions.assertEquals(" | | \n-+-+-\n | | \n-+-+-\n | | \n", new TicTacToe().showGameBoard());
    }
}
