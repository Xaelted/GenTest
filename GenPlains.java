
public class GenPlains extends BiomesGen {
	
	public static int GetRealHeight (int[][] Heightmap, int r, int c){
		
		
		
		int avg =FindAvgHeight(Heightmap, r, c);
		
		
		int temprand = (int) (Math.random()*(100-1)+1);
		 if (temprand >= 25) RealHeight = avg + 1;
		 else if (temprand >=50) RealHeight = avg -1;
		 else RealHeight = avg;
		
		
		return RealHeight;
	}
	

	
	
	

	
}
