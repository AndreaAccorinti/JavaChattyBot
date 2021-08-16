package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        boolean testPassed = false;
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is  a \" block\" in java?");
        System.out.println("1. It is a group of zero or more statements enclosed in a pair of curly");
        System.out.println("2. It is the internal implementation of the object is not accessible to the user.");
        System.out.println("3. It is a  is a single command to be executed (like printing a text.");
        System.out.println("4. It is a  object’s current state; it is represented by its fields (attributes)");
        for (; testPassed == false; ) {
            int answer = scanner.nextInt();
            if (answer == 1) {
                testPassed = true;
            } else {
                System.out.println("Please, try again.");
            }
        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
