/**
  test BoardForQueensPuzzle
 */

public class UserOfBoard {
    public static void main(String[] commandLine) {
        System.out.println();

        System.out.println( "construct a BoardForQueensPuzzle");
        BoardForQueensPuzzle b = new BoardForQueensPuzzle( 3);


        // System.out.println( "width and length of the board: "
                          // + b.ranks()
                          // + " ...expecting 3"
                          // + System.lineSeparator());

        // System.out.println( "toString for an empty board:");
        // System.out.println( b + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "no solution could start with "
                          // + "an empty board: "
                          // + b.lastIsNg()
                          // + " ...expecting false"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "an empty size " + b.ranks()
                          // + " board is acceptable as a solution: "
                          // + b.accept()
                          // + " ...expecting false"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "queen in top left corner");
        // b.populate( 0);
        // System.out.println( b + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "no solution could start with "
                          // + "a single-queen board: "
                          // + b.lastIsNg()
                          // + " ...expecting false"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "Add a queen a knights-move away.");
        // b.populate( 2);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "no solution could start with "
                          // + "a knights-move separation: "
                          // + b.lastIsNg()
                          // + " ...expecting false"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println(
          // "Remove the queen from the most-recently-populated rank.");
        // b.depopulate( );
        // System.out.println( b + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "Add a queen to an already-populated file.");
        // b.populate( 0);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "no solution could start with "
                          // + "sharing a file: "
                          // + b.lastIsNg()
                          // + " ...expecting true"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println(
          // "\"Move\" a queen to the south-east diagonal.");
        // b.depopulate();
        // b.populate( 1);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "no solution could start with "
                          // + "sharing a south-east diagonal: "
                          // + b.lastIsNg()
                          // + " ...expecting true"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "Restart, with queen in SW diagonal.");
        // b = new BoardForQueensPuzzle( 2);
        // b.populate( 1);
        // b.populate( 0);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "no solution could start with "
                          // + "sharing a SW diagonal: "
                          // + b.lastIsNg()
                          // + " ...expecting true"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "a full-but-illegal board "
                          // + "is acceptable as a solution: "
                          // + b.accept()
                          // + " ...expecting false"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "A one-by-one board, populated:");
        // b = new BoardForQueensPuzzle( 1);
        // b.populate( 0);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "an acceptable solution: "
                          // + b.accept()
                          // + " ...expecting true"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // System.out.println( "A 4-by-4 board, fully populated, legally:");
        // b = new BoardForQueensPuzzle( 4);
        // b.populate( 1);
        // b.populate( 3);
        // b.populate( 0);
        // b.populate( 2);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "drum roll: an acceptable solution: "
                          // + b.accept()
                          // + " ...expecting true, and the crowd goes wild!"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----


        // // optional extra education for true believers
        // System.out.println( "A size zero board, trivially populated:");
        // b = new BoardForQueensPuzzle( 0);
        // System.out.println( b + System.lineSeparator());

        // System.out.println( "Zero conflicts => an acceptable solution: "
                          // + b.accept()
                          // + " ...expecting true"
                          // + System.lineSeparator());
        // // ----- next incremental step ends here -----
    }
}
