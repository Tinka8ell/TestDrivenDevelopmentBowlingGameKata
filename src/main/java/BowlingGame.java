import java.util.ArrayList;

public class BowlingGame {

    public static int score(String scores){
        int score = 0;
        int frameNumber = 0;
        int bowlsThisFrame = 0;
        int pinsThisFrame = 0;
        ArrayList<Character> strikes = new ArrayList<>();
        for (char pins: scores.toCharArray()){
            int pin = "0123456789X/".indexOf(pins); // valid and pin "value"
            if (pin >= 0) {
                // a real bowl!
                if (bowlsThisFrame <= 0) // reset each frame
                    pinsThisFrame = 10;
                if (pin > 9) {
                    // specials
                    pin = pinsThisFrame; // we cleared them!
                    bowlsThisFrame = 5; // end of frame!
                }
                score += pin;
                pinsThisFrame -= pin;
                bowlsThisFrame++;
                if (bowlsThisFrame >= 2) {
                    bowlsThisFrame = 0;
                    frameNumber++;
                }
                if (strikes.size() > 0){
                    // process strikes
                    ArrayList<Character> spares = new ArrayList<>();
                    while (strikes.size() > 0){
                        char first = strikes.remove(0);
                        score += pin;
                        if (first == 'X')
                            spares.add('/'); // return as a spare
                    }
                    strikes = spares;
                }
                if (pins == 'X' && frameNumber < 10)
                    strikes.add(pins);
            }
        }
        return score;
    }
}
