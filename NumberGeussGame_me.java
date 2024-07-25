import java.util.Scanner;
import java.util.Random;

public class NumberGeussGame_me 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter The User Name : ");
        Scanner scanner1 = new Scanner(System.in);
        String name=scanner1.nextLine();
        
        System.out.println("Hellow,"+name+"....! Please read this instruction");
        
        System.out.println("==========================================================");
    	System.out.println("------------------------GAME RULES------------------------");
    	System.out.println("1) I am choose the number from 1 t0 100 ");
    	System.out.println("2) You want to find that number");
    	System.out.println("3) You will only get 10 chances to find the numbers");
    	System.out.println("4) If you find the number in 10 chances,then you win");
    	System.out.println("==========================================================");
        
    	System.out.print("So,"+name+" You are ready to play this game...?  (yes/no):");
        boolean playGame=true;
        playGame = scanner1.next().equalsIgnoreCase("yes");
        
        Random random = new Random();
        int MyNumber = random.nextInt(1,100);
        
        int Chances=10;
        int attempts = 0;
        boolean guessedCorrectly=false;
        
        while(playGame)
        {
        	while (attempts < Chances && !guessedCorrectly) 
        	{
	        	System.out.print("Enter your guess: ");
	        	Scanner scanner2 = new Scanner(System.in);
	        	int yourGuess = scanner2.nextInt();
	        	
	        	 attempts++;
	        	
	        	 if(yourGuess < MyNumber)
	        	{
	        		System.out.println("Too low!");
	        	}
	        	else if (yourGuess > MyNumber) 
                {
                    System.out.println("Too high!");
                }
	        	else 
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                }
        	}
        	if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you've used all " + Chances + " attempts. The number was " + MyNumber + ".");
            }
        	
        	System.out.println("Do you want to play again? (yes/no): ");
            playGame = scanner1.next().equalsIgnoreCase("yes");
        }
        System.out.println("Ok,Thanks No Problem.....!");
        

	}

}
