import java.util.Scanner;

public class Main {
    /* Player one, we'll need to enter a position
     *if you look at the numpad, you'll see it corresponds pretty well to the positions in tic-tac-toe
     *we'll number each square according to the numpad, starting with one at the bottom lefts, then two
     *if player enters four, then we will replace the space at position for with an X or an 0 depending on whose turn is
     *the array will be a char array, which is a character array, and I'll call it POS  short for positions

     * */
    public static void main(String[] args) {
        char[] positions = {'T',' ',' ',' ',' ',' ',' ',' ',' '};

        System.out.println("***TIC-TAC-TOE***");


       char algo = positions[0];


        for (int i = 0; i < positions.length; i++){
          String  playerNumber = i%2 == 0 ?  "1" : "2";
          int positionNumber = askingTicTacToePosition(playerNumber);
            if (String.valueOf(positions[positionNumber]).equals("X") || String.valueOf(positions[positionNumber]).equals("Y")){
                System.out.println("Position isn't available try again. ");
                positionNumber = askingTicTacToePosition(playerNumber);
            }
            positions[positionNumber]=playerNumber.equals("1") ? 'X' : 'Y';
            showingChart(positions);
        }



    }

    static int askingTicTacToePosition(String playerNumber){

        System.out.println("Player " + playerNumber + "! Type the position:");
        Scanner scanner= new Scanner(System.in);
        int position = scanner.nextInt() -1;
        return position;
    }

    static void showingChart(char[] positions){
        System.out.println(" " + positions[0] + " | " + positions[1] + " | " + positions[2] + "  ");
        System.out.println("---+---+----");
        System.out.println(" " + positions[3] + " | " + positions[4] + " | " + positions[5] + "  ");
        System.out.println("---+---+----");
        System.out.println(" " + positions[6] + " | " + positions[7] + " | " + positions[8] + "  ");
    }
}


/*
Asking the user the position number
Store the position number
Replace the position number by X
Print the tic-tac-toe chart updated
Asking the second player the position number
Store the position number
Replace the position number by O
Print the tic-tac-toe chart updated
Asking the second player the position number
 */