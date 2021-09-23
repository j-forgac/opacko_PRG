public class Substrings {
	public static void main(String[] a){
		String input = "AXBABABA";
		int pos1 = input.indexOf("AB");
		int pos2 = input.indexOf("BA",pos1+2);
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println("----------");


		int pos3 = input.indexOf("BA");
		int pos4 = input.indexOf("AB",pos1+2);
		System.out.println(pos3);
		System.out.println(pos4);

		System.out.println((pos1 > -1 && pos2 > -1) || (pos3 > -1 && pos4 > -1));
	}
}
