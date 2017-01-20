
public class Main {

	public static void main(String[] args) {
		int [][] Map = new int [100][100];
		
		Map[0][0] = 10;
		String Biomename = "Plains";
		
		
		
		BiomesGen StarterBiome = new BiomesGen (Biomename, Map);
		for(int r = 0; r< Map.length; r++){
			System.out.println();
			for (int c = 0; c< Map[r].length; c++){
			System.out.print(Map[r][c]);
			System.out.print (" ");
			}
			}
		
		
	}

}


