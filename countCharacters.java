//

class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charsCount.put(c, charsCount.getOrDefault(c, 0) + 1);
        }
        
        for (String word : words) {
            if (canFormWord(word, charsCount)) {
                totalLength += word.length();
            }
        }
        
        return totalLength;
    }
    
    private boolean canFormWord(String word, Map<Character, Integer> charsCount) {
        Map<Character, Integer> wordCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : wordCount.keySet()) {
            if (!charsCount.containsKey(c) || wordCount.get(c) > charsCount.get(c)) {
                return false;
            }
        }
        return true;
    }
}