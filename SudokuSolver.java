/*
* Author: Joseph Strubhart
* Input: command line integers from 1 to 9, using 0 for blank
* spots.
* Output: command line diagram of the solved puzzle
*
*
*/

import java.util.*;
import java.lang.String.*;
import java.io.*;
import java.text.*;



public class SudokuSolver {
  public static void main(String[] args){
  SudokuSolver instance = new SudokuSolver();
  instance.mainloop(args);
  }
  
  //This is to eliminate static method errors
  public void mainloop(String[] args){
  
  int[][] board = new int[9][9];

  //We will first need to get the 9x9 array, either from command line
  //or from asking for input
  
  if(args.length!=0){
    for(int i=0; i<args.length; i++){
      board[i/10][i%10]=Integer.parseInt(args[i]);
      }
    System.out.println("reached args!=null");
  }
  else 
    for(int i=0; i<9; i++){
      try{
      System.out.println("Please enter line number "+(i+1));
      BufferedReader r=new BufferedReader(new 
InputStreamReader(System.in));
      String in=r.readLine();
      String[] s=in.split(" ");
      for(int j=0; j<9; j++)
        board[i][j]=Integer.parseInt(s[j]);
      }catch(IOException e){
        System.out.println("Error :"+e.getMessage());
        }
      }

  




  //test to see that we get the correct input
  for(int i=0; i<9; i++){
    for(int j=0; j<9; j++)
      System.out.print(board[i][j] + " ");
    System.out.println(" ");
    }











  }
}
