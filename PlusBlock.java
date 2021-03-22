import java.util.Scanner;

public class PlusBlock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What should be the width of the square?");
        int width = scan.nextInt();
        System.out.println("What should be the height of the square?");
        int height = scan.nextInt();

        for (int counter = 1; counter <= height; counter++) {
            if (counter!=height/2+1) {

                for (int counter2 = 1; counter2 <= width; counter2++) {
                    if (counter2 != width/2+1) {
                        System.out.print("#");

                    } else {
                        System.out.print(" ");
                    }

                }
            }

            System.out.println("");
        }

        scan.close();
    }

}
