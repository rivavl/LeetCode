
//28.Implement strStr()
//
//Implement strStr().
//
//Given two strings needle and haystack,
//return the index of the first occurrence of needle in haystack,
//or-1if needle is not part of haystack.


class StrStr {
    public static int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                boolean e = true;
                for (int j = 0; j < needle.length(); ++j) {
                    e = needle.charAt(j) == haystack.charAt(i + j) && e;
                }
                if (e) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}