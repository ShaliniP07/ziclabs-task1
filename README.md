# ziclabs-task1
## Number Game in Java programming Language
## Author: Shalini P
## Batch: (1 November- 30 November,2023)
## Domain: 
JAVA Programming
## Aim: 
To build a Number Guessing Game
## Description/Working of code:
1. User Interaction: The code begins by creating a Scanner object that will allow the program to receive input from the user.

2. Random Number Generation: A Random object is also created, which will be used to generate a random number between 1 and 100 that the user will try to guess.

3. Game Mechanics: The code includes a while loop that represents the main game loop. Within this loop, the program prompts the user to enter their guess. If the guess is correct, the program updates the score and exits the inner loop. If the guess is too high or too low, the program gives a hint and continues to the next iteration of the inner loop.

4. Maximum Attempts: If the user does not guess the correct number within 10 attempts, the program displays a message indicating that the maximum number of attempts has been reached and provides the correct number as the hint.

5. Game End and Scoring: After each round of the game, the program asks the user if they want to play again. If the user enters "yes", the game loop starts over with a new randomly generated number. If the user enters "no", the game ends, and the program displays the user's final score.

6. This Number Game allows users to continuously guess numbers until they reach the maximum number of attempts or choose to stop playing.
