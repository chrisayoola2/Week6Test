package com.example.week6test;

public class PigLatinTest {
    public static void main(String[] args) {
        String firstWord = "chicken";
        String secondWord = "soup";

        System.out.println(translate(firstWord));
        System.out.println(translate(secondWord));

    }

    public static String translate(String aword) {

        String word = aword.toLowerCase();
        char firstChar = word.charAt(0);
        int firstVowel = 0;
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            return aword + "ay";
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                break;
            }
            firstVowel = i;
        }
        String constants = word.substring(0, firstVowel + 1);
        String newWord = word.replace(word.substring(0, firstVowel + 1), "");
        newWord += constants + "ay";
        System.out.println(newWord);

        return newWord;
    }
}
