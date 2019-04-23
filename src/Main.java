import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("------Menu------");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle ");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                rectangle(5, 5);
                show();
                break;
            case 2:
                squareTriangle(5);
                show();
                break;
            case 3:
                isoscelesTriangle(5);
                show();
                break;
            case 4:
                break;
            default:
                System.out.println("Nhap lai !!!");
                show();
        }
    }

    static void rectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    static void squareTriangle(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    static void isoscelesTriangle(int h) {
        for (int i = h; i > 0; i--) {
            for (int j = i; j <= h; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
