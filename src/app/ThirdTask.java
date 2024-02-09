package app;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        String names = "Bob, Alice, Tom, Lucy, Bob, Lisa";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine().trim();

        int count = countListName(names, searchName);
        if (count > 0) {
            System.out.println("Name \"" + searchName + "\" is used " + count + " times.");
        } else {
            System.out.println("Name \"" + searchName + "\" is not used.");
        }
    }

    public static int countListName(String names, String searchName) {
        int count = 0;
        StringBuilder sb = new StringBuilder(names);
        int startIndex = 0;
        while (startIndex < sb.length()) {
            int commaIndex = sb.indexOf(", ", startIndex);
            String name;
            if (commaIndex != -1) {
                name = sb.substring(startIndex, commaIndex);
                startIndex = commaIndex + 2;
            } else {
                name = sb.substring(startIndex);
                startIndex = sb.length();
            }
            if (name.equals(searchName)) {
                count++;
            }
        }
        return count;
    }
}



