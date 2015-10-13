
	import java.io.*;
import java.util.Scanner;

	public class SatPix {

		public static void main(String[] args) throws IOException
		{
//			boolean[][] booleanArr = fileToBoolArray("satpix.in");
			int sizeOfLargestPasture;
			
			/* YOUR CODE GOES HERE */
			
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
				for(int b = 0;b<farm[a].length;b++)
				{
					
				}
			}
		}

		private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
		{
			//This recursive method employs the flood-fill algorithm to
			//count the size of a single pasture and "mark" it so it is not double-counted
			return 0;
		}
		
	}

}
