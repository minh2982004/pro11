package j1.s.p0050;

import java.util.Scanner;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputA() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter A: ");
            }

        }
    }
    public static double checkInputB() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter B: ");
            }

        }
    }
    public static double checkInputC() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter C: ");
            }

        }
    }

    //check number is odd or not
    public static boolean checkOdd(double n) {
    return n % 2 != 0;
}


    //check number is even or not
    public static boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //check number is squarenumber or not
    public static boolean checkSquareNumber(double n) {
        double sqrt = Math.sqrt(n);
        return sqrt == Math.floor(sqrt);
    }

}
