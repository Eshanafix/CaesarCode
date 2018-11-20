package cipherSplosion;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

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
	
	public String autoLetterShift(String[] input) {
		
		ArrayList<String> matches = new ArrayList<String>();
		
		for(int i = 1;i < 25; i++) {
			
			String incrementVal = " ";
			for(int j = 0; j < input.length; j++) {
				
				String temp = input[j];
				for(int k = 0;i < temp.length();k++){
					
					incrementVal += (char)(temp.charAt(k)+ i);
				}
				
				incrementVal += " ";
				
				
			}
			
		}
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
		
		if(waluigi >= 1) {
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
