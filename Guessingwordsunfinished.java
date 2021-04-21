import java.util.Random;
import java.util.Scanner;
public class Guessingwordsunfinished {
    public static void main(String []args)
    {
        
        Random generator = new Random();
        char randomletter = (char)(generator.nextInt(26) + 'a');

        System.out.println(randomletter);
        Scanner inputWord = new Scanner(System.in); // Create a Scanner object
        String userWord;
        Integer score=0,wordLength=0,currentScore=0,previousScore=0;
        Boolean ascendingOrder=false, multiplicationEligible = true;
        System.out.println("What's your word? ");
        userWord = inputWord.nextLine();
        System.out.println(userWord);
        if (userWord.charAt(0) != randomletter)
            {
            score = 0;
            System.out.println("The word must start with the given letter" );
            }
        else if (userWord.charAt(0) == randomletter)
            {
            wordLength=userWord.length();
            System.out.println(wordLength.toString());
            multiplicationEligible=false;
            }
        
            for (int i=0; i<wordLength; i++)
            {
                currentScore = Character.getNumericValue(userWord.charAt(i));
                System.out.println(currentScore.toString());
                score = score + currentScore;

                if (currentScore>previousScore && multiplicationEligible)
                {
                    ascendingOrder = true;
                    previousScore=currentScore;
                    System.out.println("counting up");
                }
                else if (currentScore<previousScore)
                {
                    ascendingOrder = false;
                    multiplicationEligible = false;
                    previousScore=currentScore;
                    System.out.println("descending score");
                }
            }
                if (multiplicationEligible)

                {
                    score = score*3;
                    System.out.println("An exceptional word");
                }
                System.out.println(score.toString());

                inputWord.close();
                
            }}