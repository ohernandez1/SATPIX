
	import java.io.*;
import java.util.Scanner;

	public class SatPix {

		public static void main(String[] args) throws IOException
		{
			boolean[][] booleanArr = fileToBoolArray("satpix.in");
			int sizeOfLargestPasture;
			
			/* YOUR CODE GOES HERE */
			int r = booleanArr.length;
			int c = booleanArr[0].length;
			sizeOfLargestPasture = recursivelyMeasureAndMarkPasture(r,c,booleanArr);
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
			out.println(sizeOfLargestPasture);
			out.close();
			}
		
		private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
		{
			//This helper method converts the input file into a 2D array of booleans
			Scanner scan = new Scanner (new File(fileName));
			int c = scan.nextInt();
			int r = scan.nextInt();
			boolean [][] farm = new boolean[r][c];
			for(int a = 0;a<farm.length;a++)
			{
				String str = scan.next();
				for(int b = 0;b<str.length();b++)
				{
					if(str.substring(b,b+1).equals("*"))
					{
						farm[a][b]=true;
					}
					else
					{
						farm[a][b]=false;
					}
				}
			}
			return farm;
		}

		private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)

{

if (row < 0) return 0 ;

if (col < 0) return 0;

if (row >= arr.length) return 0;

if (col >= arr[row].length) return 0;




boolean old = arr[row][col];

arr[col][row] = false; 

if (old == arr[row+1][col] )

return 1 + recursivelyMeasureAndMarkPasture( row+1, col ,  arr);

if(old == arr[row-1][col])

return 1 + recursivelyMeasureAndMarkPasture( row - 1,  col,  arr);

if (old == arr[row][col+1])

return 1 + recursivelyMeasureAndMarkPasture( row,  col + 1,  arr);

if (old == arr[row][col-1])

return 1 + recursivelyMeasureAndMarkPasture( row,  col + 1,  arr);




//This recursive method employs the flood-fill algorithm to

//count the size of a single pasture and "mark" it so it is not double-counted

return 0;

}
		
	}


