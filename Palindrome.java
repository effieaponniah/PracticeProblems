// This program checks whether a string is a palindrome
// Written by: Effiea Ponniah
// Last day revised: January 31st, 2022

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basicTrue = "Mom"; // True
		String basicFalse = "effiea"; // False
		String advancedTest = "Here is my code, edoc ym si ereh"; // True
		System.out.println(isPalindrome(basicTrue));
		System.out.println(isPalindrome(basicFalse));
		System.out.println(isPalindrome(advancedTest));

	}
	
	   // isPalindrome(s) returns true if string s is a palindrome
	   //		and false otherwise
	public static boolean isPalindrome(String s) {
		boolean isPalindrome = true;
		s = s.toLowerCase();
		String alphaValues = "";

		for (int i = 0 ; i < s.length(); i++)
		{
			if ((s.charAt(i) >= 97) && (s.charAt(i) <= 122))
			{
				alphaValues += s.charAt(i);
			}
		}

		for (int i = 0 ; i < alphaValues.length()/2; i++)
		{
			if (alphaValues.charAt (i) != alphaValues.charAt(alphaValues.length () - 1 - i))
			{
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}
