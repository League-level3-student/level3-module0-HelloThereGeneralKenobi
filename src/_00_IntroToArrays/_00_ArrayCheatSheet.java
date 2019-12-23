package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "Sponge";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 4; i++) {
			strings[i] = "Sponge" + i;
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int n = 0;n < strings.length - 1; n++) {
			System.out.println(strings[n]);
		}
		//7. make an array of 50 integers
		Integer[] fiddy = new Integer[50];

		//8. use a for loop to make every value of the integer array a random number
		Random randGen = new Random();
		for(int k = 0; k < fiddy.length - 1; k++) {
			fiddy[k] = randGen.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
