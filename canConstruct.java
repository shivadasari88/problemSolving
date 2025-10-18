class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        

        Map<Character, Integer> sub1 = new HashMap<>();
        Map<Character, Integer> sub2 = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char substring1=ransomNote.charAt(i);
            if (sub1.containsKey(substring1)) {
                sub1.put(substring1, sub1.get(substring1) + 1);
            } else {
                sub1.put(substring1, 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char substring2=magazine.charAt(i);
            if (sub2.containsKey(substring2)) {
                sub2.put(substring2, sub2.get(substring2) + 1);
            } else {
                sub2.put(substring2, 1);
            }
        }

        for (char ch : sub1.keySet()) {
            if (sub2.get(ch) == null || sub1.get(ch) > sub2.get(ch)) {
                return false;
            }
        }

        return true;
    }
}