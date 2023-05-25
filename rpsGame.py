import random, sys

print("ROCK, PAPER, SCISSORS")

# These variables keep track of the number wins, losses, and ties
wins = losses = ties = 0

while True:  # Main game loop
    print("%s Wins, %s Losses, %s Ties" % (wins, losses, ties))

    while True:  # Player input loop
        print("Enter your move: (r)ock, (p)aper, (s)cissors, or (q)uit")
        playerMove = input()

        if playerMove == "q" or playerMove == "Q":
            sys.exit()  # Quit program
        if (
            playerMove == "r"
            or playerMove == "R"
            or playerMove == "p"
            or playerMove == "P"
            or playerMove == "s"
            or playerMove == "S"
        ):
            break  # Break player input loop
        print("Type one of 'r', 'p', 's', or 'q'!")
    # Display player choice
    if playerMove == "r" or playerMove == "R":
        print("ROCK versus...")
    elif playerMove == "p" or playerMove == "P":
        print("PAPER versus...")
    elif playerMove == "s" or playerMove == "S":
        print("SCISSORS versus...")
    # Display computer choice
    randomNumber = random.randint(1, 3)
    if randomNumber == 1:
        computerMove = "r"
        print("ROCK")
    elif randomNumber == 2:
        computerMove = "p"
        print("PAPER")
    elif randomNumber == 3:
        computerMove = "s"
        print("SCISSORS")
    # Display and record win/loss/tie
    if playerMove == computerMove:
        print("TIE GAME!\n")
        ties += 1
    elif (
        ((playerMove == "r" or playerMove == "R") and (computerMove == "s"))
        or ((playerMove == "p" or playerMove == "P") and (computerMove == "r"))
        or ((playerMove == "s" or playerMove == "S") and (computerMove == "p"))
    ):
        print("YOU WIN!\n")
        wins += 1
    elif (
        ((playerMove == "r" or playerMove == "R") and (computerMove == "p"))
        or ((playerMove == "p" or playerMove == "P") and (computerMove == "s"))
        or ((playerMove == "s" or playerMove == "S") and (computerMove == "r"))
    ):
        print("YOU LOSE!\n")
        losses += 1

