import java.util.ArrayList;
import java.util.Scanner;

public class BigAndSmall {
	public static void main(String[] a){
		ArrayList<Integer> ls = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			ls.add(sc.nextInt());
		}
		int num = ls.get(0);
		for(Integer i: ls){
			if(i > num){
				num = i;
			}
		}
		System.out.println(num);
		for(Integer i: ls){
			if(i < num){
				num = i;
			}
		}
		System.out.println(num);

	}
}
