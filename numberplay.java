import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int userInput = scanner.nextInt();
        
        System.out.println("You gave me: " + userInput);

        int manipulatedValue = userInput * 2;
        System.out.println("Doubling it gives you: " + manipulatedValue);
    }
}