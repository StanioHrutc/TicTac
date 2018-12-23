package TicTac;

public class Field {

    private static final byte ROW_LENGTH = 3;
    private static final byte COLUMN_LENGTH = 3;

    char field[][] = new char[ROW_LENGTH][COLUMN_LENGTH];

    public Field () {
        fillField();
    }

    public char[][] getField() {
        return field;
    }

    protected void generateField (char[][] field) {

        for (int i = 0; i < ROW_LENGTH; i++) {
            System.out.println();
            for (int j = 0; j < COLUMN_LENGTH; j++) {
                if (j == 0) System.out.print("| ");
                System.out.print(field[i][j] + " | ");
            }
        }
    }

    private void fillField () {
        for (int i = 0; i < ROW_LENGTH; i++) {
            for (int j = 0; j < COLUMN_LENGTH; j++) {
                field[i][j] = '_';
            }
        }
    }

}
