import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Nice to meet you " + name + "!");

            System.out.println("What is your favorite song?");
            String song = scan.next();
            System.out.println(song + " is a bop.");

            System.out.println("What is your favorite food?");
            String food = scan.next();
            System.out.println("I like eating " + food + " too!");

            System.out.println("What is your favorite store?");
            String store = scan.next();
            System.out.println(store + " is such a cool store.");

            System.out.println("What is your lucky number?");
            String num = scan.next();
            System.out.println(num + " is a cool number.");
        scan.close();
    }
}
