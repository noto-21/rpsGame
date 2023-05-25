#include <iostream>
#include <random>
#include <string>

int main()
{
    std::cout << "ROCK, PAPER, SCISSORS\n";

    //Variables to keep track of wins, losses, and ties
    int wins = 0, losses = 0, ties = 0;

    std::string playerMove;

    while (true)//Main game loop
    {
        std::cout << wins << " Wins, " << losses << " Losses, " << ties << " Ties\n";

        while (true)//Player input loop
        {
            std::cout << "Enter your move: (r)ock, (p)aper, (s)cissors, or (q)uit\n";
            std::cin >> playerMove;

            if (playerMove == "q")
                return 0;//Quit program
            if (playerMove == "r" || playerMove == "p" || playerMove == "s")
                break;//Break player input loop

            std::cout << "Type one of 'r', 'p', 's', or 'q'!\n";
        }

        //Display player choice
        std::string playerChoice;
        if (playerMove == "r")
            playerChoice = "ROCK";
        else if (playerMove == "p")
            playerChoice = "PAPER";
        else if (playerMove == "s")
            playerChoice = "SCISSORS";
        std::cout << playerChoice << " versus...\n";

        //Display computer choice
        int randomNumber = std::rand() % 3 + 1;
        std::string computerMove;
        if (randomNumber == 1)
        {
            computerMove = "r";
            std::cout << "ROCK\n";
        }
        else if (randomNumber == 2)
        {
            computerMove = "p";
            std::cout << "PAPER\n";
        }
        else if (randomNumber == 3)
        {
            computerMove = "s";
            std::cout << "SCISSORS\n";
        }

        //Display and record win/loss/tie
        if (playerMove == computerMove)
        {
            std::cout << "TIE GAME!\n\n";
            ties++;
        }
        else if ((playerMove == "r" && computerMove == "s") ||
                 (playerMove == "p" && computerMove == "r") ||
                 (playerMove == "s" && computerMove == "p"))
        {
            std::cout << "YOU WIN!\n\n";
            wins++;
        }
        else if ((playerMove == "r" && computerMove == "p") ||
                 (playerMove == "p" && computerMove == "s") ||
                 (playerMove == "s" && computerMove == "r"))
        {
            std::cout << "YOU LOSE!\n\n";
            losses++;
        }
    }

    return 0;
}
