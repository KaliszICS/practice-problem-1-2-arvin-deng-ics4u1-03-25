public class PracticeProblem {

	public static boolean validIndex(int[] arr, int index) {
		
		try {
			arr[index] = arr[index];
			return true;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int divide(int x, int y) {

		try {
			return x / y;
		}
		catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String s) {

		try {
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e){
			return 0;
		}
	}
}
	


