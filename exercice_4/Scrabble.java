import java.util.HashMap;
import java.util.Map;

/**
 * Scrabble
 */
public class Scrabble  {

    Map<String, Integer> Scrabble = new HashMap<>();

    final int getScores(String word){

        int score = 0 ;

        for (int i = 0; i < word.length(); i++) {
            
            String charScrabble = (word.charAt(i) + "").toUpperCase();

            if(Scrabble.containsKey(charScrabble)){

                score += Scrabble.get(charScrabble);

            }

        }

        return score;
     }

}