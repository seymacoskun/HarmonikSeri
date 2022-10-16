import java.util.Scanner;

public class Harmonik {

	public static void main(String[] args) {
		int n;
		double result = 0.0;
		Scanner a = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		n = a.nextInt();
		
		for(double i=1.0; i<=n; i++) {
			result += (1/i);
		}
		System.out.println("Sonuç: " +result);
	}

}
