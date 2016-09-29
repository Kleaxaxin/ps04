package net.mrpaul.ADSA.WM110.ps04;

import java.util.Scanner;

public class Caesar {
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			
			int key = Integer.parseInt(args[0]) % 26;
			int asciiMessage;
			Scanner reader = new Scanner(System.in);
			System.out.print("Please enter a message to encrypt: ");
			String message = reader.nextLine();
			
			for (int i = 0; i < message.length(); i++){
				asciiMessage = (int) message.charAt(i);
				if (asciiMessage < 91 && asciiMessage >= 65){
					asciiMessage += key;
					if (asciiMessage > 90)
						asciiMessage -= 26;
					System.out.print((char) asciiMessage);
				} 
				else if (asciiMessage < 123 && asciiMessage >= 97){
					asciiMessage += key;
					if (asciiMessage > 122)
						asciiMessage -= 26;
					System.out.print((char) asciiMessage);
				}
				else {
					System.out.print(message.charAt(i));	
				}
			}
		}
	}
}
