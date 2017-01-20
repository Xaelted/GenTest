
public class BiomesGen {
	
	
	public static int AvgHeight, RealHeight;

	public BiomesGen () {
	}
	

	public BiomesGen (String BiomeName, int[][] Map){
		
		
		
		if(BiomeName.equals("Plains")){
			for(int r = 0; r< Map.length; r++){
				for (int c = 0; c< Map[r].length; c++){
					Map[r][c] = GenPlains.GetRealHeight(Map, r, c);
					
				}
			}
		
		}
			
	}
	
	
	
	//finds the avg height of the blocks around the current block
	public static int FindAvgHeight (int[][] Heightmap, int r, int c) {
		
		if (r<=0 && c <=0){
			AvgHeight = (Heightmap[r][c+1]+Heightmap[r+1][c]+Heightmap[r+1][c+1])/8;
		}
		else if (r>=Heightmap.length && c>=Heightmap[r].length){
			AvgHeight = (Heightmap[r-1][c-1]+Heightmap[r-1][c]+Heightmap[r][c-1])/8;
		}
		else if (r>=Heightmap.length){
			AvgHeight = (Heightmap[r-1][c-1]+Heightmap[r-1][c]+Heightmap[r-1][c+1]+Heightmap[r][c-1]+Heightmap[r][c+1])/8;
		}
		else if (c>=Heightmap.length){
			AvgHeight = (Heightmap[r-1][c-1]+Heightmap[r-1][c]+Heightmap[r][c-1]+Heightmap[r+1][c-1]+Heightmap[r+1][c])/8;
		}
		else if(r<0) {
			AvgHeight = (Heightmap[r][c-1]+Heightmap[r][c+1]+Heightmap[r+1][c-1]+Heightmap[r+1][c]+Heightmap[r+1][c+1])/8;
		}
		else if (c<0) {
			AvgHeight = (Heightmap[r-1][c]+Heightmap[r-1][c+1]+Heightmap[r][c+1]+Heightmap[r+1][c]+Heightmap[r+1][c+1])/8;
		}
		else {
			AvgHeight = (Heightmap[r-1][c-1]+Heightmap[r-1][c]+Heightmap[r-1][c+1]+Heightmap[r][c-1]+Heightmap[r][c+1]+Heightmap[r+1][c-1]+Heightmap[r+1][c]+Heightmap[r+1][c+1])/8;
		}
		
		return AvgHeight;
	}
	
}
	
	
	
	

