package telran.string.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!")); 
	}
	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));	
		assertFalse(hello.contains("elo")); 
	}
	@Test
    void compareToTest() {
        String string1 = "apple";
        String string2 = "banana";
        String string3 = "apple";

        assertTrue(string1.compareTo(string2) < 0); 
        assertTrue(string2.compareTo(string1) > 0); 
        assertEquals(0, string1.compareTo(string3)); 
    }
	@Test
    void compareToIgnoreCaseTest() {
        String string1 = "Apple";
        String string2 = "banana";
        String string3 = "apple";
        String string4 = "Banana";

        assertTrue(string1.compareToIgnoreCase(string2) < 0); 
        assertTrue(string2.compareToIgnoreCase(string1) > 0); 
        assertEquals(0, string1.compareToIgnoreCase(string3)); 
        assertEquals(0, string2.compareToIgnoreCase(string4)); 
    }
	@Test
    void concatWithEmptyStringTest() {
        String baseString = "Java";
        String emptyString = "";
        
        assertEquals(baseString, baseString.concat(emptyString)); 
        assertEquals(baseString, emptyString.concat(baseString)); 
    }
	@Test
    void startsWithTest() {
        String string = "Hello World";
        
        assertTrue(string.startsWith("Hello")); 
        assertFalse(string.startsWith("world")); 
        assertTrue(string.startsWith("")); 
        assertFalse(string.startsWith(" World")); 
    }
	void endsWithTest() {
        String string = "Hello World";
        
        assertTrue(string.endsWith("World")); 
        assertFalse(string.endsWith("Hello")); 
        assertTrue(string.endsWith("")); 
        assertFalse(string.endsWith("Hello ")); 
    }
	@Test
    void equalsIgnoreCaseTest() {
        String string1 = "Java";
        String string2 = "JAVA";
        String string3 = "JaVa";
        String string4 = "java";
        String string5 = "Python";
        
        assertTrue(string1.equalsIgnoreCase(string2)); 
        assertTrue(string1.equalsIgnoreCase(string3)); 
        assertTrue(string1.equalsIgnoreCase(string4)); 
        assertFalse(string1.equalsIgnoreCase(string5)); 
    }
	@Test
    void indexOfTest() {
        String string = "Hello World";
        
        assertEquals(0, string.indexOf("Hello")); 
        assertEquals(6, string.indexOf("World")); 
        assertEquals(-1, string.indexOf("world")); 
        assertEquals(2, string.indexOf("llo")); 
        assertEquals(-1, string.indexOf("Java")); 
    }
	@Test
    void lastIndexOfTest() {
        String string = "Hello World";
        
        assertEquals(9, string.lastIndexOf((int) 'l')); 
        assertEquals(-1, string.lastIndexOf((int) 'z')); 
        assertEquals(7, string.lastIndexOf((int) 'o')); 
        assertEquals(10, string.lastIndexOf((int) 'd')); 
    }
}
