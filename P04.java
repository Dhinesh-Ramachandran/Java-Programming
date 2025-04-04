package level_1;
import java.util.Scanner;
public class P04 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	float num = scan.nextFloat();
	float rounded = Math.round(num*100)/100.0f;
	System.out.print(rounded);
	}

}
