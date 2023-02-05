HINT:
- Create a HashMap<String, List> for ans
- Loop through each String s within strs array
- Create a char[] array, ca, for each String s like this: char[] ca = s.toCharArray
- Sort each string using Arrays.sort(ca);
- Create a String variable key, to store the sorted string using String.valueOf(ca);
- Check if ans doesn't yet contain the key of our String we just sorted, if it indeed doesn't, put sorted string into ans in the key place, along with an empty ArrayList<>();
- At the bottom of the for each loop, each string should be added into our the List of our hmap using ans.get(key).add(s);


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
