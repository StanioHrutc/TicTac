package TicTac;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    private byte x_coord;
    private byte y_coord;

    public Player () {
        getInput();
    }

    private void getInput() {
        System.out.println("\nВведіть номер Рядка: ");
        this.x_coord = (byte) (scanner.nextByte() - 1);

        System.out.println("\nВведіть номер стовпця: ");
        this.y_coord = (byte) (scanner.nextByte() - 1);
    }

    public byte getX_coord() {
        return x_coord;
    }

    public byte getY_coord() {
        return y_coord;
    }

}
