import java.util.Scanner;

public class NumbersTable
{

    public static int getNumbers()
    {

        int value;

        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();
        return value;
    }
    public static void main (String[] Args)
    {
        int width, height, count = 0;

        System.out.println("Enter width: ");
        width = getNumbers();
        System.out.println("Enter height: ");
        height = getNumbers();


        
            for(int j = 0; j < height; j++){
                for(int k = 0; k < width; k++){
                    count++;
                    if(count<10)
                    System.out.printf("|    " +count+"    ");
                    else if(count<100)
                    System.out.printf("|    " +count+"   ");
                    else 
                    System.out.printf("|    " +count+"  ");
                }
                System.out.println("|");
            }

    }
}