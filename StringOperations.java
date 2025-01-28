import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 1. Convert to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // 2. Find length
        int length = str.length();
        System.out.println("Length: " + length);

        // 3. Replace a character with another
        System.out.print("Enter character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = scanner.next().charAt(0);
        String replaced = str.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replaced);

        // 4. Extract a substring
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Substring: " + substring);

        scanner.close();
    }
}
    

