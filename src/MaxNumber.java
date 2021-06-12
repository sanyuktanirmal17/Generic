package com;

/**
 * MaximumCheck is an class of public type
 * @author sanyukta Nirmal
 *
 */
public class MaxNumber {
	
	/**
	 * calculating Maximum of Three Numbers using CompareTo method
	 */
	
		public static int checkMaximum(Integer x, Integer y, Integer z) {
			Integer max = x;
			if(y.compareTo(max) > 0) {
				max = y; 
			}
			if(z.compareTo(max) > 0) {
				max = z; 
			}
			return max; 
		}
		
		/*
		 *printing max value
		 */
		
		public static void main(String[] args) {
			
			int c = checkMaximum(10,23,15);
			System.out.println("The Maximum value is : " +c);
		}

}