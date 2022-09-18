import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class palindromedectector {
	public static void main(String[] args) {
	
		
	    final int attempts = 1;
	    for (int i = 0; i < attempts; i++) {
	    	String word = "";
	        word = JOptionPane.showInputDialog("Enter word: ");
	        
	        word=word.toUpperCase();

	        while (!word.equalsIgnoreCase("quit")) 
	        {
	           

	        System.out.print("\"" + word + "\"");
	        if (isPalindrome(stripString(word))) {
	            System.out.println(" is a palindrome.");
	        } else {
	            System.out.println(" is not a palindrome.");
	        }
	        
            word = JOptionPane.showInputDialog("Enter word: ");
            
	        }
	        
	    }
	    
	}


	private static String stripString(String word) {
	    if (null == word || word.isEmpty()) {
	        return word;
	    }
	    return word.replaceAll("[^A-Za-z]", "").toUpperCase(); // remove all non-letters
	}
	


	// use Java Stream API to check letters using half of word length
	private static boolean isPalindrome(String word) {
	    if (null == word) {
	        return false;
	    }
	    final int len = word.length();
	    if (len < 2) {
	        return true;
	    }
	    return IntStream.range(0, len/2)
	                    .allMatch(i -> word.charAt(i) == word.charAt(len - 1 - i));
	}
	
}


