package havaDurumEtkinlik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Sýcaklýk Giriniz: ");
		heat=scan.nextInt();
		
		if(heat<5) {
			System.out.println("Kayaða gidebilirsiniz.");
		}
		else {
			if(heat<=15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat<=25) {
				System.out.println("Pikniðe gidebilirsiniz.");
			}
			else {
				System.out.println("Yüzmeye gidebilirsiniz.");
			}
		}
	}

}
