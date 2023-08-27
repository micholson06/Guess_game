package projectone;

import java.util.Scanner;

public class gameone {
	public void start() {
		System.out.println("welcome to the game");
	}
	
	public void play() {
		int count = 0;
		int limit = 3;
		int guess = 0;
		int number = 8;
		while(count <= limit) {
			count++;
			Scanner turn = new Scanner(System.in);
			System.out.println("enter your guess number:\n ");
			guess = turn.nextInt();
			if(guess == number) {
				System.out.println("You win!");
				break;
			}
			else {
				System.out.println("Wrong answer! \n Tray Again");
			}
				
			if(count == limit) {
				System.out.println("You Loose!!!");
				break;
			}
		}
	}
}
