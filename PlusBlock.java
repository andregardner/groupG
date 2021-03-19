import java.util.Scanner;

public class PlusBlock {
    private int width;
    private int height;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What should be the width of the square?");
        int width = scan.nextInt();
        System.out.println("What should be the height of the square?");
        int height = scan.nextInt();

        for (int counter = 1; counter <= height; counter++) {
            if (0 > (counter * 2 - height) || 2 < (counter * 2 - height)) {

                for (int counter2 = 1; counter2 <= width; counter2++) {
                    if (0 > (counter2 * 2 - width) || 2 < (counter2 * 2 - width)) {
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
