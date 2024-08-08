package string;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
