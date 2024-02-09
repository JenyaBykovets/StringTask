package app;

public class FirstTask {
    public static void main(String[] args) {

        String sb ="brange, plum, tomato, onibn, grape";
        String str = correctWords(sb);
        printWords(str);
    }
    public static String correctWords(String words) {
        return new StringBuilder(words)
                .replace(words.indexOf("brange"), words.indexOf("brange") + "brange".length(), "orange")
                .replace(words.indexOf("onibn"), words.indexOf("onibn") + "onibn".length(), "onion")
                .toString();


    }
    public static void printWords(String words) {
        String[] wordArray = words.split(", ");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println((i + 1) + ") " + wordArray[i]);
        }
    }
}



