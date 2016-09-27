package net.mrpaul.ADSA.WM110.ps04;
// letters r 65-91 for uppercase and 97-123 for lowercase in ascii
import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			int key = Integer.parseInt(args[0]) % 26;
			int asciiMessage;
			Scanner reader = new Scanner(System.in);
			System.out.print("Please enter a message to encrypt: ");
			String message = reader.nextLine();
			for (int i = 0; i < message.length(); i++){
				asciiMessage = (int) message.charAt(i);
				if ((asciiMessage <= 91 && asciiMessage >= 65) || (asciiMessage <= 123 && asciiMessage >= 97)){
					
				}
			}
		}
	}

}
