public class BowlingGame {

    public static int score(String scores){
        return scores
                .chars()
                .filter(c -> (c >= '0' && c <= '9') || c == 'X')
                .map(c -> c == 'X' ? 10 : c - '0')
                .sum();
    }
}
