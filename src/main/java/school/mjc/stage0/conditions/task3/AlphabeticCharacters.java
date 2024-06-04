package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        boolean isEnglishSymbol =
                ((int) character >= 65
                && (int) character <= 90)
                || ((int) character >= 97
                && (int) character <= 122);

        boolean isVowel = character == 'a'
                        || character == 'e'
                        || character == 'i'
                        || character == 'o'
                        || character == 'u'
                        || character == 'A'
                        || character == 'E'
                        || character == 'I'
                        || character == 'O'
                        || character == 'U';

        if (isEnglishSymbol && isVowel) {
            System.out.println("Vowel");
        } else if (isEnglishSymbol) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
