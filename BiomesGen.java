
public class BiomesGen {
	
	
	public int AvgHeight, RealHeight;

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
}
	
	
	
	

