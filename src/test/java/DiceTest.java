import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceTest {
    @Test
    public void toss() {
        Dice test = new Dice(4);
        int  x = test.toss();
        assertEquals(x, x);
    }
}
