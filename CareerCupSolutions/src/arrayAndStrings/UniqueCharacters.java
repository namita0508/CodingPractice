package arrayAndStrings;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
	
	public Boolean containsAllUnique(String s){
		char[] sArray = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c : sArray){
			Integer freq = charMap.get(c);
			if (freq != null){
				System.out.println("First repeating character: "+c);
				return false;
			}
			charMap.put(c, (freq == null) ? 1 : freq+1);
			//(freq == null) ? charMap.put(c, 1) : charMap.put(c, freq+1);
		}
		return true;
	}
	
	public Boolean isAllUniqueChars_UsingBitManipulation(String str){
		//Assuming all lower case letters
		int checker = 0;
	    for (int i = 0; i < str.length(); i++) {
	    	//val is 0 for 'a', 1 for 'b' and so on
	        int val = str.charAt(i) - 'a';
	        //System.out.println(Integer.toBinaryString(val)); //prints 111 for 'h', 0 for 'a'
	        int temp = 1 << val;
	        //System.out.println(Integer.toBinaryString(temp)); //prints 10000000 when val = 7 for 'h'
	        //System.out.println(checker & (1 << val)); // prints 0
	        if ((checker & (1 << val)) > 0) {
	        //we are storing 1's in checker if we find that character. Anding it with a found char
	       //will result in > 1 but a missing character will keep it same. Oring (done later) turns into a 1.
	        return false;
	        }
	        checker |= (1 << val);
	    }
	    return true;
	}

}
