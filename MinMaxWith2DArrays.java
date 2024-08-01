import java.io.*; //imports java input output

public class MinMaxWith2DArrays
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    
    for ( int row=0; row < data.length; row++)
    {
        int minRow = 99999; //sets mimimum value
        int maxRow = -99999; //sets maximum value
        
        for ( int col=0; col < data[row].length; col++)  //repeat as the column value is less than the row length in the data array
      {
        minRow = Math.min(minRow, data[row][col]); //find the mimimum of the row
        maxRow = Math.max(maxRow, data[row][col]); //find the maximum of the row
      }
      
      //prints min and max values for each row
        System.out.println("Minimum value in row " + (row + 1) + ": " + minRow);
        System.out.println("Maximum value in row " + (row + 1) + ": " + maxRow);
    }
      
  }
}     
/* Sample Output
Minimum value in row 1: 2
Maximum value in row 1: 5
Minimum value in row 2: 1
Maximum value in row 2: 13
Minimum value in row 3: 0
Maximum value in row 3: 9
Minimum value in row 4: -8
Maximum value in row 4: 6
 * 
 */
