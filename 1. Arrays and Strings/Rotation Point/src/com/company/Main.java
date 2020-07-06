package com.company;

public class Main {
    public static int findRotationPoint(String[] words) {
        final String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while(floorIndex < ceilingIndex) {

            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
            String guessWord = words[guessIndex];

            if (guessWord.compareTo(firstWord) >= 0) {
                floorIndex = guessIndex;
            } else {
                ceilingIndex = guessIndex;
            }

            if (floorIndex + 1 == ceilingIndex) {
                break;
            }
        }

        return ceilingIndex;
    }

    public static void main(String[] args) {
        String[] words = new String[]{
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage",
        };

        int result = findRotationPoint(words);
        System.out.println(result);
    }
}
