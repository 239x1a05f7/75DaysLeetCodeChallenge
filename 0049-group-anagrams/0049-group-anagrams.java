import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Handle empty input case
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map to store sorted string key and list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert to char array and sort to create a signature key
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            
            // If key doesn't exist, create it
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            // Add the original string
            map.get(keyStr).add(s);
        }
        
        // Return all values from the map
        return new ArrayList<>(map.values());
    }
}
