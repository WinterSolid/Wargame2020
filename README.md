# comp271-Wargame2020

Comp 271 Peer based project
# War Game 2020 Instructions
1. Run the program. The initial prompt will give you details about the board and ships.
![stepOne](https://github.com/WinterSolid/comp271-Wargame2020/blob/master/projectinstrucpics/1.png)

2. In this game, you and the computer will each have 5 boats. One of length 2, two of length 3, one of length 4, and one of length 5. You and the computer will each place your boats on a 10x10 board.

3. The program will prompt you for each boat. It will ask you to pick the coordinate for the first block the boat will occupy. You will pick a row letter (A-J), a column number (1-10), and the direction the rest of the boat will be placed in. After each boat is placed the program will show you the placement of each one on the board. If you input an invalid coordinate or if the boat placement overlaps a previous boat, the program will prompt you to pick a new coordinate.

4. The computer will then randomly place their boats down (you will not get to see this), and then the game will commence.

5. In each round, you and the computer will take turns guessing coordinates. You will guess a row number, enter it, then guess a column number, and enter it. After you enter your guess, you will be told if you landed a hit or a miss. Then, the computer will take their turn, and you will be told if they landed a hit or a miss. The program will ask you to make a new guess if you pick a previously guessed coordinate. After each turn, the program shows either your or the computer’s guesses board - this is where your and the computer’s guesses are recorded; A hit is represented by “X” and a miss is represented by “0”. Landing a hit allows you to keep making guesses until you land a miss.

6. The game ends when either you or the computer has sunk all of the other’s ships.
