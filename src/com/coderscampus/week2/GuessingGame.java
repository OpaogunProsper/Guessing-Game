package com.coderscampus.week2;

import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main (String[] args) {
		

		        
		        Random rand = new Random();
		        int randomNumber = rand.nextInt(100) + 1;

		        
		        int numGuesses = 0;
		        int guess = 0;

		        
		        Scanner scanner = new Scanner(System.in);

		       
		        while (numGuesses < 5) {
		            System.out.print("Pick a number between 1 and 100: ");

		           
		            if (scanner.hasNextInt()) {
		                guess = scanner.nextInt();

		               
		                if (guess < 1 || guess > 100) {
		                    System.out.println("Your guess is not between 1 and 100, please try again");
		                    continue;
		                }

		               
		                numGuesses++;

		                
		                if (guess == randomNumber) {
		                    System.out.println("You win!");
		                    return;
		                } else if (guess < randomNumber) {
		                    System.out.println("Please pick a higher number");
		                } else {
		                    System.out.println("Please pick a lower number");
		                }
		            } else {
		                System.out.println("Invalid input, please enter a number");
		                scanner.next();
		            }
		        }

		        
		        System.out.printf("You lose, the number to guess was " +  randomNumber);
		    }
		

	
		
	  }
	