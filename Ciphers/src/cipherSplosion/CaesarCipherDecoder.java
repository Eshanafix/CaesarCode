package cipherSplosion;

import java.io.*;
import java.util.Scanner;

public class CaesarCipherDecoder {
	
	
	public static void main(String[] args) {
		
		runDecryption();
	}
	
	public static void runDecryption() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! Welcome To Eshan's Totally Badass Caesar Cipher Decoder Mk1!");
		System.out.print("Please enter in a message you would like to decode -->  ");
		String decode = input.nextLine();
		
		String[] valArray = decode.split(" ");
		
	}
	
	public boolean inputIfWord(String[] input) {
		
		int waluigi = 0; 
		
		try(BufferedReader bReader = new BufferedReader(new FileReader("wordList.txt"))){
			
			int size = Integer.parseInt(bReader.readLine());
			
			
			for(int i = 0; i < input.length; i++) {
				String compare = input[i];
				for(int j = 0; j < size; j++) {
					String val = bReader.readLine();
					if(compare.equals(val)) {
						waluigi++;
					}
				}
			}
		}
		catch(IOException e) {
			
		}
		
		if(waluigi == input.length) {
			return true;
		}
		return false;
	}
}

//Algorithm for inputing all shifts, add an ascii value, if it goes over 90, overflow through 65 and
// Get all the remainder, once it is all done input if done



// Code for Incrementation below
/*

String str="ABCDEF";
		String strIncremented=new String();
		for(int i=0;i<str.length();i++){
			strIncremented+=(char)(str.charAt(i)+1);
		}
	

*/
