package arrayAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersTest {
	
	UniqueCharacters unique = new UniqueCharacters();
	
	@Test
	public void testUniqueChars(){
		assertTrue(unique.containsAllUnique("abc"));
	}
	
	@Test
	public void testUniqueBitManipulation(){
		assertFalse(unique.isAllUniqueChars_UsingBitManipulation("hello"));
	}
}
