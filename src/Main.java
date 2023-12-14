import java.util.Scanner;

public class Main {
    /* Player one, we'll need to enter a position
     *if you look at the numpad, you'll see it corresponds pretty well to the positions in tic-tac-toe
     *we'll number each square according to the numpad, starting with one at the bottom lefts, then two
     *if player enters four, then we will replace the space at position for with an X or an 0 depending on whose turn is
     *the array will be a char array, which is a character array, and I'll call it POS  short for positions

     * */

    Scanner scanner= new Scanner(System.in);
    static int position;
    public static void main(String[] args) {
        char[] positions = {'T',' ',' ',' ',' ',' ',' ',' ',' '};

        System.out.println("***TIC-TAC-TOE***");




        for (int i = 0; i < positions.length; i++){
          char  player = i%2 == 0 ?  'X' : 'O';


          int positionNumber;
          do {
              positionNumber = askingTicTacToePosition(player);
          } while (positions[positionNumber] == 'X' || positions[positionNumber] == 'O');

            positions[positionNumber]=player;
            showingChart(positions);
            if ((positions[0] == player && positions[1] == player && positions[2] == player) ||
                    (positions[3] == player && positions[4] == player && positions[5] == player) ||
                    (positions[6] == player && positions[7] == player && positions[8] == player)  ||
                    (positions[0] == player && positions[3] == player && positions[6] == player) ||
                    (positions[1] == player && positions[4] == player && positions[7] == player) ||
                     (positions[2] == player && positions[5] == player && positions[8] == player) ||
                    (positions[0] == player && positions[4] == player && positions[8] == player) ||
                    (positions[2] == player && positions[4] == player && positions[6] == player)
            ){
                System.out.println(player+ " is the Winner");
                break;

            }



        }

        //i > 3


    }


    static int askingTicTacToePosition(char playerNumber){


        System.out.println("Player " + playerNumber + "! Type the position:");
        Scanner scanner= new Scanner(System.in);
        position = scanner.nextInt() -1;

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


