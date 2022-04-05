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

    @Test
    public void checkAllSingles(){
        // set up
        String scores = "11 11 11 11 11 11 11 11 11 11"; // 10 frames of 2 singles

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(20, score, scores);
    }

    @Test
    public void checkMixed(){
        // set up
        String scores = "1- 11 -1 -- 12 11 21 22 11 11"; // 10 frames of 2 singles

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(20, score, scores);
    }

    @Test
    public void checkAllStrikes(){
        // set up
        String scores = "X X X X X X X X X X X X "; // 10 frames of strikes and 2 bonus strikes

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(300, score, scores);
    }

    @Test
    public void checkMaxStrikesOrSpares(){
        // set up
        String scores = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"; // 10 frames of 9 and 0 bonus strikes

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(90, score, scores);
    }

    @Test
    public void checkAllSpares(){
        // set up
        String scores = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"; // 10 frames of strikes and 1 bonus strike of 5

        // do it
        int score = BowlingGame.score(scores);

        // check it
        assertEquals(150, score, scores);
    }



}