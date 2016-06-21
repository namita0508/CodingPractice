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
	
	public Boolean containsAllUniqueNoAddtionalDS(String s){
		char[] sArray = s.toCharArray();
		
		for(char c : sArray){
			
		}
		
		return true;
	}

}
