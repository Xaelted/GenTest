
public class BiomesGen {
	
	
	public static int RealHeight;
	public static double AvgHeight;

	public BiomesGen () {
	}
	

	public BiomesGen (String BiomeName, int[][] Map){
		
		
		//runs through a cycle to get the real height
		if(BiomeName.equals("Plains")){
			for(int r = 0; r< Map.length; r++){
				for (int c = 1; c< Map[r].length; c++){
					Map[r][c] = GenPlains.GetRealHeight(Map, r, c);
					
				}
			}
		
		}
			
	}
	
	
	
	//finds the avg height of the blocks around the current block (at max checking four)
	public static double FindAvgHeight (int[][] Heightmap, int r, int c) {
		
		if (r<=0 && c<=0){
			AvgHeight = Heightmap[r][c];
		}
		else if (c<=0) {
			AvgHeight = Heightmap[r-1][c];
		}
		
		else if(r<=0) {
			AvgHeight = (Heightmap[r+1][c-1]+Heightmap[r][c-1])/2;
		}
		
		else if (c<=Heightmap[r].length){
			AvgHeight = (Heightmap[r-1][c-1]+Heightmap[r-1][c]+Heightmap[r][c-1])/3;
		}
	
	
		else {
			AvgHeight = (Heightmap[r-1][c]+Heightmap[r-1][c-1]+Heightmap[r+1][c-1]+Heightmap[r][c-1])/4;
		}
		
		return AvgHeight;
	}
	
}
	
	
	
	

