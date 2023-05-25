import java.util.Scanner;

public class RPSGame
{
	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in))
		{
			System.out.println("ROCK, PAPER, SCISSORS");

			//These variables keep track of the number of wins, losses, and ties
			int wins = 0, losses = 0, ties = 0;
			
			String playerMove = "";

			while (true)//Main game loop
			{
				System.out.println(String.format("%d Wins, %d Losses, %d Ties", wins, losses, ties));

				while (true)//Player input loop
				{
					System.out.println("Enter your move: (r)ock, (p)aper, (s)cissors, or (q)uit");
					playerMove = scan.next().toLowerCase();

					if (playerMove.equals("q"))
						System.exit(0);//Quit program
					if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
						break;//Break player input loop

					System.out.println("Type one of 'r', 'p', 's', or 'q'!");
				}

				//Display player choice
				String playerChoice = "";
				if (playerMove.equals("r"))
					playerChoice = "ROCK";
				else if (playerMove.equals("p"))
					playerChoice = "PAPER";
				else if (playerMove.equals("s"))
					playerChoice = "SCISSORS";
				System.out.println(playerChoice + " versus...");

				//Display computer choice
				int randomNumber = (int)(Math.random() * 3) + 1;
				String computerMove = "";
				if (randomNumber == 1)
				{
					computerMove = "r";
					System.out.println("ROCK");
				} 
				else if (randomNumber == 2) 
				{
					computerMove = "p";
					System.out.println("PAPER");
				} 
				else if (randomNumber == 3) 
				{
					computerMove = "s";
					System.out.println("SCISSORS");
				}

				//Display and record win/loss/tie
				if (playerMove.equals(computerMove)) 
				{
					System.out.println("TIE GAME!\n");
					ties++;
				} 
				else if ((playerMove.equals("r") && computerMove.equals("s"))
						|| (playerMove.equals("p") && computerMove.equals("r"))
						|| (playerMove.equals("s") && computerMove.equals("p"))) 
				{
					System.out.println("YOU WIN!\n");
					wins++;
				} 
				else if ((playerMove.equals("r") && computerMove.equals("p"))
						|| (playerMove.equals("p") && computerMove.equals("s"))
						|| (playerMove.equals("s") && computerMove.equals("r"))) 
				{
					System.out.println("YOU LOSE!\n");
					losses++;
				}
			}
		}
	}
}
