package j1.s.p0050;

import static j1.s.p0050.Validation.checkEven;
import static j1.s.p0050.Validation.checkInputA;
import static j1.s.p0050.Validation.checkInputB;
import static j1.s.p0050.Validation.checkInputC;
import static j1.s.p0050.Validation.checkInputIntLimit;
import static j1.s.p0050.Validation.checkOdd;
import static j1.s.p0050.Validation.checkSquareNumber;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private MenuModel model;
    private MenuView view;

    public Manager(MenuModel model, MenuView view) {
        this.model = model;
        this.view = view;
    }

    public void startMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.Menu();
            int choice = view.UserChoice();

            switch (choice) {
                case 1:
                    superlativeEquation();
                    break;
                case 2:
                    quadraticEquation();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputA();
        System.out.print("Enter B: ");
        double b = checkInputB();
        double x = -b / a;
        System.out.println("Solution: x=" + String.format("%.3f", x));
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ,");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ,");
        }
        if (checkOdd(x)) {
            System.out.print(x + " ,");
        }
        System.out.println(" ");
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ,");
        }
        if (checkEven(b)) {
            System.out.print(b + " ,");
        }
        if (checkEven(x)) {
            System.out.print(x + " ,");
        }
        System.out.println(" ");
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ,");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ,");
        }
        if (checkSquareNumber(x)) {
            System.out.print(x + " ,");
        }
        System.out.println(" ");
    }

    //allow user calculate Quadratic Equation
    public static void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = checkInputA();
        System.out.print("Enter B: ");
        double b = checkInputB();
        System.out.print("Enter C: ");
        double c = checkInputC();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + String.format("%.3f", x1) + " and x2 = " + String.format("%.3f", x2));
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ,");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ,");
        }
        if (checkOdd(c)) {
            System.out.print(c + " ,");
        }
        if (checkOdd(x1)) {
            System.out.print(x1 + " ,");
        }
        if (checkOdd(x2)) {
            System.out.print(x2 + " ,");
        }
        System.out.println(" ");
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ,");
        }
        if (checkEven(b)) {
            System.out.print(b + " ,");
        }
        if (checkEven(c)) {
            System.out.print(b + " ,");
        }
        if (checkEven(x1)) {
            System.out.print(x1 + " ,");
        }
        if (checkEven(x2)) {
            System.out.print(x1 + " ,");
        }
        System.out.println(" ");
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ,");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ,");
        }
        if (checkSquareNumber(c)) {
            System.out.print(c + " ,");
        }
        if (checkSquareNumber(x1)) {
            System.out.print(x1 + " ,");
        }
        if (checkSquareNumber(x2)) {
            System.out.print(x2 + " ,");
        }
        System.out.println();
    }
}
