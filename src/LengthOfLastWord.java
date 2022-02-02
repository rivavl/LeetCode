//58. Length of Last Word
//Given a string s consisting of some words separated by some number of spaces,
//return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int sum = 0;
        int i = s.length() - 1;
        while (s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            sum++;
            i--;
        }
        return sum;
    }
}
