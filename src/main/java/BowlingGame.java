public class BowlingGame {

    public static int score(String scores){
        int score = 0;
        for (char pins: scores.toCharArray()){
            int pin = pins - '0';
            switch (pins){
                case 'X':
                    pin = 10;
                    break;
                case '-':
                    pin = 0;
                    break;
                case ' ':
                    pin = -1;
                    break;
                default:
                    if (pin < 0 || pin > 9)
                        pin = -1;
            }
            if (pin >= 0)
                score += pin;
        }
        return score;
    }
}
