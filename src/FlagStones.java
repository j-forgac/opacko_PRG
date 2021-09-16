public class FlagStones {
	public static void main(String[] a){
		int width = 6;
		int height = 6;
		int stoneSize = 4;
		System.out.println(Math.ceil((double) width/stoneSize) * Math.ceil((double) height/stoneSize));
	}
}
