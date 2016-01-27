package hangman;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> animals = new ArrayList<String>();
			animals.add("german shepherd");
			animals.add("siamese cat");
			animals.add("mouse");
			animals.add("african elephant");
			animals.add("black panther");
			animals.add("zebra");
			animals.add("crow");
			animals.add("great white shark");
			animals.add("lion");
			animals.add("hippopotamus");
			animals.add("rhinoceros");
			animals.add("giant panda");
			animals.add("iguana");
			animals.add("electric eel");
			animals.add("salmon");
			animals.add("bald eagle");
			animals.add("red tailed hawk");
			animals.add("gorilla");
		
		ArrayList<String> people = new ArrayList<String>();
			people.add("president");
			people.add("theoretical physicist");
			people.add("chemist");
			people.add("custodian");
			people.add("electrician");
			people.add("programmer");
			people.add("politican");
			people.add("businessman");
			people.add("lawyer");
			people.add("doctor");
			people.add("football player");
			people.add("software engineer");
			people.add("police officer");
			people.add("mercenary");
			people.add("small forward");
			people.add("director");
			people.add("executive producer");
			people.add("whale biologist");
		
		ArrayList<String> places = new ArrayList<String>();
			places.add("home");
			places.add("lab");
			places.add("library");
			places.add("classroom");
			places.add("mountain");
			places.add("city");
			places.add("ocean");
			places.add("village");
			places.add("farmhouse");
			places.add("courtyard");
			places.add("grand canyon");
			places.add("miami beach");
			places.add("los angeles");
			places.add("new jersey");
			places.add("manhattan");
			places.add("denver");
			places.add("great barrier reef");
			places.add("the grand budapest hotel");
			places.add("castle");
			places.add("college campus");
			places.add("brower commons");
			
		ArrayList<Character> guesses = new ArrayList<Character>();	
			
		System.out.println("Which subject would you like to play? (Enter number)  ");	
		System.out.println("1. Animals ");	
		System.out.println("2. People ");	
		System.out.println("3. Places ");	
		
		int choice = sc.nextInt();
		
		
		String word;
		
//----------------------------------------------------------------------------------------------------------------------------------------------		
		
		if(choice==1){
			
			int rand= new Random().nextInt(animals.size());
			word = animals.get(rand);
			char[] answer = word.toCharArray(); //actual answer, will be used for comparison
			char[] userAnswer = new char[word.length()]; //What the user sees, it will have dashes and the correctly guessed letters
			int spaces=0;
						for(int i=0; i<word.length();i++){
							
							if(answer[i]!=' '){ //filling in what the user sees, adds spaces where spaces are
							userAnswer[i]='_';
							}
							
							if(answer[i]==' '){
								userAnswer[i]=' ';
								spaces++;
								}
						}
						
			int lives=5;//if the user gets a letter wrong, they lose a life
			int score=0;//every correct letter gets a point, when points=number of letters, you win
			
			
			
			
			while(lives>0 && score!=(word.length()-spaces)){ //while you haven't lost or won
				
					for(int i=0; i<word.length();i++){  //prints board
						System.out.print(userAnswer[i] + " ");
					}
					System.out.println(" ");
				
				
				
				
				System.out.print("Enter guess: ");
				char guess=sc.next().charAt(0);
				
				int count=0;
				if(guesses.contains(guess)){
					System.out.println("Already tried that letter!");
				}
				if(!guesses.contains(guess)){
				guesses.add(guess);
				for(int i=0; i<word.length(); i++){
					
					if(guess==answer[i]){
						userAnswer[i]=guess;
						score++;
					}
					
					if(guess!=answer[i]){
						count++;	
					}	
				}
				
				if(count==word.length() ) {   //Checking if your guess was wrong and have lost
					
					lives-=1;
					System.out.println("Wrong! Lives: " + lives);
					
					if(lives==0){
						System.out.println(" You Lose :( " );
					}
					}
					
					if(score==word.length()-spaces){ //Checking if you have won
						System.out.println(word);
						System.out.println("You win!");
						lives=0;
					}
				}
				
			}
			}
			
				
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		if(choice==2){
			int rand= new Random().nextInt(people.size());
			word = people.get(rand);
			char[] answer = word.toCharArray(); //actual answer, will be used for comparison
			char[] userAnswer = new char[word.length()]; //What the user sees, it will have dashes and the correctly guessed letters
			int spaces=0;
						for(int i=0; i<word.length();i++){
							
							if(answer[i]!=' '){ //filling in what the user sees, adds spaces where spaces are
							userAnswer[i]='_';
							}
							
							if(answer[i]==' '){
								userAnswer[i]=' ';
								spaces++;
								}
						}
						
			int lives=5;//if the user gets a letter wrong, they lose a life
			int score=0;//every correct letter gets a point, when points=number of letters, you win
			
			
			
			
			while(lives>0 && score!=(word.length()-spaces)){ //while you haven't lost or won
				
					for(int i=0; i<word.length();i++){  //prints board
						System.out.print(userAnswer[i] + " ");
					}
					System.out.println(" ");
				
				
				
				
				System.out.print("Enter guess: ");
				char guess=sc.next().charAt(0);
				
				int count=0;
				if(guesses.contains(guess)){
					System.out.println("Already tried that letter!");
				}
				if(!guesses.contains(guess)){
				guesses.add(guess);
				for(int i=0; i<word.length(); i++){
					
					if(guess==answer[i]){
						userAnswer[i]=guess;
						score++;
					}
					
					if(guess!=answer[i]){
						count++;	
					}	
				}
				
				if(count==word.length() ) {   //Checking if your guess was wrong and have lost
					
					lives-=1;
					System.out.println("Wrong! Lives: " + lives);
					
					if(lives==0){
						System.out.println(" You Lose :( " );
					}
					}
					
					if(score==word.length()-spaces){ //Checking if you have won
						System.out.println(word);
						System.out.println("You win!");
						lives=0;
					}
				}
				
			}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		if(choice==3){
			int rand= new Random().nextInt(places.size());
			word = places.get(rand);
			char[] answer = word.toCharArray(); //actual answer, will be used for comparison
			char[] userAnswer = new char[word.length()]; //What the user sees, it will have dashes and the correctly guessed letters
			int spaces=0;
						for(int i=0; i<word.length();i++){
							
							if(answer[i]!=' '){ //filling in what the user sees, adds spaces where spaces are
							userAnswer[i]='_';
							}
							
							if(answer[i]==' '){
								userAnswer[i]=' ';
								spaces++;
								}
						}
						
			int lives=5;//if the user gets a letter wrong, they lose a life
			int score=0;//every correct letter gets a point, when points=number of letters, you win
			
			
			
			
			while(lives>0 && score!=(word.length()-spaces)){ //while you haven't lost or won
				
					for(int i=0; i<word.length();i++){  //prints board
						System.out.print(userAnswer[i] + " ");
					}
					System.out.println(" ");
				
				
				
				
				System.out.print("Enter guess: ");
				char guess=sc.next().charAt(0);
				
				int count=0;
				if(guesses.contains(guess)){
					System.out.println("Already tried that letter!");
				}
				if(!guesses.contains(guess)){
				guesses.add(guess);
				for(int i=0; i<word.length(); i++){
					
					if(guess==answer[i]){
						userAnswer[i]=guess;
						score++;
					}
					
					if(guess!=answer[i]){
						count++;	
					}	
				}
				
				if(count==word.length() ) {   //Checking if your guess was wrong and have lost
					
					lives-=1;
					System.out.println("Wrong! Lives: " + lives);
					
					if(lives==0){
						System.out.println(" You Lose :( " );
					}
					}
					
					if(score==word.length()-spaces){ //Checking if you have won
						System.out.println(word);
						System.out.println("You win!");
						lives=0;
					}
				}
				
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
	    
    
    }
		
		
	}
	
	
	
	

