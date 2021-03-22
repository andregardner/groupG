import java.util.Random;
import java.util.Scanner;
public class Guessingwords {
    public static void main(String []args)
    {
        Scanner scan = new Scanner();
        char c = "W";
        int a = c;
        System.out.println(a-64);

        Random randomGenerator = new Random();
            int rand = 0, tries=5;
            while (true)
            {
            rand = randomGenerator.nextInt(11);
            if(rand !=0) break;
            }
            System.out.println(rand);

            int intRandom=0;
            Scanner inputRandom = new Scanner(System.in); // Create a Scanner object

            do
            {
            System.out.println("The next letter is ");
            intRandom = Integer.parseInt(inputRandom.nextLine()); // Read user input & convert to int
            tries--;
            }
            while (intRandom !=rand && tries!=0);
            if (intRandom == rand)
            {
            System.out.println("Good Job!");
            }
            else if (tries == 0)
            {
            System.out.println("Try again, pal!");
            }

            inputRandom.close();
                        }

            
                        
            }
