// This program checks whether an array contains duplicates
// Written by: Effiea Ponniah
// Last day revised: January 31st, 2022

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 5}; // false
		int[] num2 = {1}; // false
		int[] num3 = {1, 1}; // true
		int[] num4 = {1, 2, 2, 5}; // true
		int[] num5 = {1, 2, 3, 1, 5}; // true
		System.out.println(containsDuplicate(num1));
		System.out.println(containsDuplicate(num2));
		System.out.println(containsDuplicate(num3));
		System.out.println(containsDuplicate(num4));
		System.out.println(containsDuplicate(num5));
	}
	
   // containsDuplicate(nums) returns true if array nums contains duplicates
   //		and false otherwise
   public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
       
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;  
            }
        }
        return false;
    }
}
