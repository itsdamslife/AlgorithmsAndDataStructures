
public class Basics {

	public Basics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int basicArray[];
		
		basicArray = new int[20];
		
		int valuesDuringInit[] = new int[] {0,1,2,3,4};
		
		for (int i = 0; i < valuesDuringInit.length; i++) {
			System.out.println( "Element at index " + i + " is : " + valuesDuringInit[i] );
		}

		int[] clonedArray = valuesDuringInit.clone();
		clonedArray[0] = 10;
		
		System.out.println("Sum of basicArray : " + sum(basicArray));
		System.out.println("Sum of valuesDuringInit : " + sum(valuesDuringInit));
		System.out.println("Sum of Cloned array : " + sum(clonedArray));
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	

}
