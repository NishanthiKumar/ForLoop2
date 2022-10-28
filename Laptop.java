package boardPrograms;

public class Laptop {
	public static void main(String[] args) {
		int[] memorySize= {32,64,128};
		for(int i=memorySize.length-1;i>=0;i--) {
			System.out.println(memorySize[i]);
		}
	}

}
