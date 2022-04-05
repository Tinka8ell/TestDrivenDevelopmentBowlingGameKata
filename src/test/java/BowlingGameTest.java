import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    @Test
    public void checkAllMisses(){
        // set up
        String scores = "-- -- -- -- -- -- -- -- -- --"; // 10 frames of 2 misses

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(0, score, scores);
    }

}