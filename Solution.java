import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static Character mostFrequentChar(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            }
            else {
                charMap.put(character, 1);
            }
        }
        ArrayList<Character> maxChar = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = new ArrayList<>();
                maxChar.add(entry.getKey());
                maxCount = entry.getValue();
            }
            else if (entry.getValue() == maxCount) {
                maxChar.add(entry.getKey());
            }
        }
      if (maxChar.size() == 1) {
          return maxChar.get(0);
      }
      else {
          for (int i = 0; i < s.length(); i++) {
              if (maxChar.contains(s.charAt(i))) {
                  return s.charAt(i);
              }
          }
      }
      return '0';
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookkkeeper")); // -> 'e'
    }

  }
