package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	static String[] strings = new String[4];
	
	
	public static void main(String[] args) {
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		strings[3] = "d";
		
		ArrayMethod1(strings);
		ArrayMethod2(strings);
		ArrayMethod3(strings);
		ArrayMethod4(strings);
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void ArrayMethod1(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void ArrayMethod2(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[array.length - i - 1]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void ArrayMethod3(String[] array) {
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 1) {
			System.out.println(array[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static Random randgen = new Random();
	static void ArrayMethod4(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[randgen.nextInt(i + 1)]);
		}
	}
	
}
