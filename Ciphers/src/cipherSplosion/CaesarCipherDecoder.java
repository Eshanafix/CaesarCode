package cipherSplosion;

import java.io.*;

public class CaesarCipherDecoder {
	public static void main(String[] args) {
		
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