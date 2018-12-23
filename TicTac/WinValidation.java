package TicTac;

public class WinValidation {

    private char[][] field;


    public WinValidation (char field[][]) {
        this.field = field;
    }

    protected boolean checkWin (byte x_coord, byte y_coord) {

        char field[][] = this.field;

        /*
         * check perpendicular wining combination
         * 1) checks horizontal line that depands on row number
         * 2) checks vertical line thar depands on column number
         */

        if (field[x_coord][0] == field[x_coord][1] && field[x_coord][0] == field[x_coord][2] && field[x_coord][0] != '_' && field[x_coord][0] != ' ') return true;
        if (field[0][y_coord] == field[1][y_coord] && field[0][y_coord] == field[2][y_coord] && field[0][y_coord] != '_' && field[0][y_coord] != ' ') return true;

        // check diagonal lines

        if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[0][0] != '_') return true;
        if (field[0][2] == field[1][1] && field[0][2] == field[2][0] && field[0][2] != '_') return true;


        return false;

    }

    protected boolean checkDraw () {
        char[][] field = this.field;

        byte trueCounter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] != '_') {
                    trueCounter += 1;
                }
            }
        }

        if (trueCounter == 9) {
            return true;
        }   else {
            return false;
        }
    }


}
