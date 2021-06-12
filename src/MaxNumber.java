/**
 * MaximumCheck is an class of public type
 * @author sanyukta
 *
 */
public class MaxNumber {
	
	/**
	 .*calculating Maximum of Three Numbers using CompareTo method
	 *returning int max value
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
		
		/**
		 * checkMaximum is a method to check the maximum value in float.
		 */
		
		public static Double checkMaximum(Double a, Double b, Double c) {
			Double max = a;
			if(b.compareTo(max) > 0) {
				max = b; 
			}
			if(c.compareTo(max) > 0) {
				max = c; 
			}
			return max; 
		}
		
		/**
		 * main method calculating 
		 */
		
		public static void main(String[] args) {
			
			int c = checkMaximum(59,55,32);
			Double d = checkMaximum(4.5,55.0,67.70);
			System.out.println("The Maximum int value is : " +c);
			System.out.println("The Maximum float value is : " +d);
		}

}