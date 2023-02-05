import java.util.*;

class Main {
  public static void main(String[] args) {
    /**
      Given an array of Strings strs, group the anagrams together. You can return the answer in any order.

      An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Ex: 
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    **/

    String[] strarr = {"eat", "tea", "tan", "ate", "nat", "bat"};

    
    System.out.println(groupAnagrams(strarr));



    /**
      SOLUTION:
        - Create a HashMap<String, List> ans
        - Create a guard clause if statement at the top, where if (strs.length == 0), return new ArrayList<>()
        - Create a for each loop of (String s : strs)
        - Within the loop, create a char[] array of each string turned into an individual character array using s.toCharArray();
        - Use Arrays.sort(ca), to sort the character array.
        - Create a String variable named key, to store the result of String.valueOf(ca);
        - Still within the for loop but at the bottom, create an if statement where if(!ans.containsKey(key)), return ans.put(key, new ArrayList<>());
        - Outside of the if statement and at the very bottom of the for each loop, ans.get(key).add(s), to add each string value to the list section of our HashMap to populate our reuslt.
        - At the end of program, return new ArrayList(ans.values());


    **/
  } 


  public static List<List<String>> groupAnagrams(String[] strs) {
    
    HashMap<String, List> ans = new HashMap<>();

    if (strs.length == 0)
    {
        return new ArrayList<>();
    }

    for (String s : strs)
      {
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String key = String.valueOf(ca);


        if (!ans.containsKey(key))
        {
          ans.put(key, new ArrayList<>());
        }

        ans.get(key).add(s);
      }

    return new ArrayList(ans.values());
        
    }
}