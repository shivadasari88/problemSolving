class Solution {
    public int rearrangeCharacters(String string, String target) {

        int pos =0;

        Map<Character, Integer> stringCount = new HashMap<>();
        Map<Character, Integer> targetCount = new HashMap<>();
        
        for(char s : string.toCharArray() ){
            stringCount.put(s ,stringCount.getOrDefault(s,0)+1);
        }

        for(char tar : target.toCharArray()){
            targetCount.put(tar,targetCount.getOrDefault(tar,0)+1);
        }

        int minCopies = Integer.MAX_VALUE;
        
        for(char c : targetCount.keySet()) {
            if (!stringCount.containsKey(c)) {
                return 0;
            }
            
            int available = stringCount.get(c);
            int needed = targetCount.get(c);
            int possibleCopies = available / needed;
            
            minCopies = Math.min(minCopies, possibleCopies);
        }
        
        return minCopies;
        
    }
}