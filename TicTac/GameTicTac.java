package TicTac;

import java.util.Scanner;

public class GameTicTac {



    static char turn;

    byte x_coord;
    byte y_coord;
    char field[][];

    Player player;

    WinValidation validator;

    Field mainField;


    public static void main(String[] args) {

        GameTicTac game = new GameTicTac();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вітаємо у грі TIC-TAC\nВведіть персонажа за якого будете грати\nУ форматі: (O/X)\n");
        turn = scanner.next().charAt(0);

        game.play(turn);

    }


    private void play (char startTurn) {

        boolean isGameOver = true;
        mainField = new Field();


        while (isGameOver) {

            player = new Player();

            field = mainField.getField();

            validator = new WinValidation(field);

            x_coord = player.getX_coord();
            y_coord = player.getY_coord();

            field[x_coord][y_coord] = startTurn;


            if (validator.checkWin(x_coord, y_coord)) {
                System.out.println("Game over");
                isGameOver = false;
            }   else if (validator.checkDraw()) {
                System.out.println("Draw, game over!");
                isGameOver = false;
            }


            startTurn = nextPlayer(startTurn);

            mainField.generateField(field);

        }

        System.out.println('\n');
        System.out.println(startTurn + " Lose!");

    }


    private char nextPlayer (char turn) {
        if (turn == 'X') {
            turn = 'O';
        }   else {
            turn = 'X';
        }

        return turn;
    }




}