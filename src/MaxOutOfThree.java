	/**
	 * MaximumCheck is a class of public type
	 */

	public class MaxOutOfThree {
		
		/**
		 * Calculating Maximum of 3 Integers, Floating point, Strings
		 * return max value
		 * @param elements
		 * @param x
		 * @param y
		 * @param z
		 */
		
		public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
			T max = x;
			if(y.compareTo(max) > 0) {
				max = y; // y is maximum now
			}
			if(z.compareTo(max) > 0) {
				max = z; // z is maximum now
			}
			return max; 
		}
		
		/**
		 * @param <T>
		 * @param elements
		 * @return
		 */
		public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
			T max = elements[0];
			for(T maximumParametereter : elements) {
				if(maximumParametereter.compareTo(max) > 0) {
					max = maximumParametereter;
				}
			}
			return max;
		}
		
		/**
		 * main method
		 */

		public static void main(String[] args) {
			Integer c = checkMaximum(55,43,21);
			Double d = checkMaximum(22.0,33.0,44.0);
			String s = checkMaximum("Apple", "Peach", "Banana");
			Integer c1 = checkMaximum_With_MoreThan_ThreeParameters(55,43,21,4,66);
			Double d1 = checkMaximum_With_MoreThan_ThreeParameters(12.5,22.0,33.0,44.0 );
			String s1 = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Peach", "Bananna", "Kiwi", "chiku"); 
			System.out.println("The maximum integer value in 55,43,21 is : " +c);
			System.out.println("The maximum float value in 122.0,33.0,44.0 is : " +d);
			System.out.println("The maximum float value in Apple ,Peach, Banana is: " +s);
			System.out.println("The maximum integer value is : " +c1);
			System.out.println("The maximum float value is : " +d1);
			System.out.println("The maximum string value is : " +s1);
		}

	}


