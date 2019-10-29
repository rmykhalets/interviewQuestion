package question7;

import java.util.Scanner;

public class box {
	
	//a method to count how long each string in the array is
	public static int[] count(String[] wordsArray, int[] countArray){
		
		for(int i=0; i<wordsArray.length;i++) {
			countArray[i]=wordsArray[i].length();
		}
		return countArray;
	}
	
	//a method to find largest word length in the string array
	public static int max(String[] wordsArray, int[] countArray){
		int max= 0;
		
		for(int i=0; i<wordsArray.length;i++) {
			if(countArray[i]>max) max=countArray[i];
		}
		
		return max;
	}
	
	public static void print(int max,String[] wordsArray, int[] countArray){
		//print top asterisks
		for(int i=0; i<max+2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//print strings with asterisks
		for(int i=0; i<wordsArray.length;i++) {
			int a = (max-countArray[i])/2;
			int b = max-(a+countArray[i]);
			System.out.print("*");
			space(a);
			System.out.print(wordsArray[i]);
			space(b);
			System.out.print("*");
			System.out.println();
		}
		
		//print bottom asterisks
		for(int i=0; i<max+2; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//function that prints a certain amount of spaces
	public static void space(int space) {
		for(int i=0; i<space; i++) {
			System.out.print(" ");
		}
	}
	
	public static void main(String [] args) {
		int max=0;
		String[] wordsArray = new String[10];
		int[] countArray = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string: ");
		wordsArray = scanner.nextLine().split(" ");
		System.out.println();
		scanner.close();
		
		count(wordsArray,countArray);
		max=max(wordsArray,countArray);
		print(max,wordsArray,countArray);
	}
}
