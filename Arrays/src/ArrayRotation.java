
public class ArrayRotation {

	public ArrayRotation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayRotation.method1();
	}

	// First method
	
	public static void method1() {
		int[] array = new int[]{0, 1, 2, 3, 4, 5};
		System.out.println("Elements of array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		int[] newArray = rotate(array, 3, array.length);
		System.out.println("Elements of rotated array:");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}
	
	public static int[] rotate(int[] array, int numOfRotations, int sizeOfArray) {
		int[] returnArray = array.clone();
		
		for (int i = 0; i < numOfRotations; i++) {
			int temp = returnArray[0];
			for (int j = 0; j < (returnArray.length - 1); j++) {
				returnArray[j] = returnArray[j+1];
			}
			returnArray[returnArray.length - 1] = temp;
		}
		
		return returnArray;
	}
}
