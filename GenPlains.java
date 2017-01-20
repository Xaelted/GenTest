
public class GenPlains extends BiomesGen {
	
	public static int GetRealHeight (int[][] Heightmap, int r, int c){
		
		
		
		int avg =(int) FindAvgHeight(Heightmap, r, c);
		
		//just does a little roll to add or subtract one, 
		int temprand = (int) (Math.random()*(100-1)+1);
		 if (temprand >= 25 && avg < 20 ) RealHeight = avg + 1;
		 else if (temprand >=75 && avg > 1) RealHeight = avg -1;
		 else RealHeight = avg;
		
		
		return RealHeight;
	}
	

	
	
	

	
}
