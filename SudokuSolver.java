/*
* Author: Joseph Strubhart
* Input: command line integers from 1 to 9, using 0 for blank
* spots.
* Output: command line diagram of the solved puzzle
*
*
*/

import java.util.*;
import java.Strings.*;


public class SudokuSolver {
  public static void main(String[] args){
  SudokuSolver instance = new SudokuSolver();
  instance.mainloop(args);
  }
  
  //This is to eliminate static method errors
  public void mainloop(String[] args){
  
  int[][] board = new array[9][9];

  //We will first need to get the 9x9 array, either from command line
  //or from asking for input
  
  if(args[0] != null)
    for(int i=0; i<args.length; i++){
      board[i/10][i%10]=args[i];
      }
  else
    for(int i=0; i<10; i++){
      System.out.println("Please enter line number "+(i+1));
      BufferedReader r=newBufferedReader(System.in);
      String[] s=r.readLine().split(" ");
      for(int j=0; j<10; j++)
        board[i][j]=(int)s.charAt(j);
      }

  




  //test to see that we get the correct input
  for(int i=0; i<10; i++)
    System.out.println(board[i].toString());

    











  }
}
