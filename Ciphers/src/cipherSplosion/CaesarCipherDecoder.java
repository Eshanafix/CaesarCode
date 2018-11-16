package cipherSplosion;

import java.io.*;
import java.util.Scanner;

public class CaesarCipherDecoder {
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		runDecryption();
		
	}
	
	public void runDecryption() {
		System.out.println("Hi! Welcome To Eshan's Totally Badass Caesar Cipher Decoder Mk1!");
		System.out.print("Please enter in a message you would like to decode -->  ");
		String decode = input.next();
		System.out.println(decode);
	}
	
	public boolean checkIfWord(String input) {
		
		String[] check = input.split(" ");
		int waluigi = 0; 
		
		try(BufferedReader bReader = new BufferedReader(new FileReader("wordList.txt"))){
			
			int size = Integer.parseInt(bReader.readLine());
			
			
			for(int i = 0; i < check.length; i++) {
				String compare = check[i];
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
		
		if(waluigi == check.length) {
			return true;
		}
		return false;
	}
}

//Algorithm for checking all shifts, add an ascii value, if it goes over 90, overflow through 65 and
// Get all the remainder, once it is all done check if done