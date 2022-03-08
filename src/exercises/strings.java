package exercises;

import java.util.Locale;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search");
        word = input.next();
        if (sentence.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("Term " + word + " is found");
        } else {
            System.out.println("Not found");
        }

    }
}
