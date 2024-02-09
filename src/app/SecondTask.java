package app;

public class SecondTask {
    public static void main(String[] args) {
        String sb = "orange, plum, tomato, onion, grape, onion";
        String wordToRemove = "onion";

        String result = removeWord(sb, wordToRemove);
        printWords(result);
    }

    public static String removeWord(String str, String wordToRemove) {
        return str.replace(wordToRemove + ", ", "").replace(wordToRemove, "");
    }

    public static void printWords(String words) {
        String[] wordArray = words.split(", ");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println((i + 1) + ". " + wordArray[i]);
        }
    }
}


