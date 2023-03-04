package ChuyenDoiNhietDo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Chuyển từ độ c sang độ f");
            System.out.println("2. Chuyển từ độ f sang độ c");
            System.out.println("0. Thoát");
            System.out.println("vui lòng nhập số: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhiệt độ cần chuyển: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Khết quả: " + celsiusToFahrenheit(fahrenheit) + " F");
                    break;
                case 2:
                    System.out.println("Nhập nhiệt độ cần chuyển");
                    celsius = input.nextDouble();
                    System.out.println("kết quả: " + fahrenheitToCelsius(celsius) + " C");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
