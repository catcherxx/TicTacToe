import com.tdd.game.Player;
import org.junit.Test;
import org.junit.gen5.api.Assertions;

public class PlayersTest {

    @Test
    public void testPlayerX(){
        Assertions.assertEquals("X", new Player("X").getName());
    }

    @Test
    public void testOtherPlayerNames(){
        Assertions.assertFalse(new Player("r").validatePlayerName());
    }
}
