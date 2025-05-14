class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");  // Clean string

        for (int i = 0; i < s.length(); i++) {
            char pal = s.charAt(i);
            char f = s.charAt(s.length() - 1 - i);

            if (pal != f) {
                return false;
            }
        }

        return true;
    }
}