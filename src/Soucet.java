public class Soucet {
	public static void main(String[] a){
		int result = 0;
		String input = "A2C4Z7";
		for(int x = 0; x<input.length();x++){
			int num = 0;
			try {
				num = Integer.parseInt(input.substring(x,x+1));
			} catch (Exception e){

			}
			result +=num;
		}
		System.out.println(result);
	}
}
