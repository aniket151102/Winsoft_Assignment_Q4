package duplicateChar;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println("Duplicate characters: ");
        for (Character c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c + ": " + charCount.get(c));
            }
        }
    }
}
