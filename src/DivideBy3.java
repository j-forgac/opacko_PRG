import java.util.Scanner;

public class DivideBy3 {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int counter = 1;
		while (sc.hasNext()){
			int x = sc.nextInt();
			if(x%3 == 0 && counter%2 == 0){
				result += x;
			}
			counter++;
		}
		System.out.println(result);
	}
}
