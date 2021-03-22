import java.util.Scanner;

public class Circle {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What should be the width of the square?");
        int width = scan.nextInt();
        System.out.println("What should be the height of the square?");
        int height = scan.nextInt();
        int radius = 3 * (height > width ? width : height) / 8;
        for (int counter = 1; counter <= height; counter++) {

            for (int counter2 = 1; counter2 <= width; counter2++) {
                if (0 == Math.pow((Math.abs(counter2 - (width / 2 + 1))), 2)
                        + Math.pow((Math.abs(counter - (height / 2 + 1))), 2)) {
                    System.out.print(" ");
                } else {
                    // This is pretty much the circle formula of x^2+y^2=r^2
                    if ((Math.pow((Math.abs(counter2 - (width / 2 + 1))), 2)
                            + Math.pow((Math.abs(counter - (height / 2 + 1))), 2)) <= Math.pow(radius, 2) + 1) {
                        System.out.print("O");

                    } else {

                        System.out.print("#");
                    }
                }
            }

            System.out.println("");
        }

        scan.close();
    }

}
