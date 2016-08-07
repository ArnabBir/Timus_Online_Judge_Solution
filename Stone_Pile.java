import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Stone_Pile {
	public static void main(String [] Args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for( int i = 0; i < n; ++i){
			a.add(sc.nextInt());
		}
		
		int diff = 9999999;
		
		for(int i = (1<<(n-1)) - 1; i >= 0; --i ){
			int temp = 0;
			for(int j = 0; j < n; ++j){
				if(((1<<j) & i)!=0){
					temp += a.get(j);
				}
				else{
					temp -= a.get(j);
			}
			}
			temp = Math.abs(temp);
			if(temp < diff){
				diff = temp;
			}
		}
		System.out.println("Minimal Difference = " + diff);
	}
}
