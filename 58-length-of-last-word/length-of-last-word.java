class Solution {
    public int lengthOfLastWord(String s) {
        // trim() removes leading/trailing spaces; split("\\s+") collapses
        // internal runs of spaces so no empty strings appear
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}