package hr.best.ai.games.sum;

import hr.best.ai.gl.GameContext;
import org.junit.Test;

/**
 * Created by nmiculinic on 1/8/16.
 */
public class SumTest {
    @Test
    public void testAIServerCoreIntegratoin() throws Exception{
        SumState init = new SumState(0);
        GameContext gc = new GameContext(init, 2);
        gc.addPlayer(new SumDummyPlayer(1, "p1"));
        gc.addPlayer(new SumDummyPlayer(2, "p2"));
        gc.play();
    }
}
