import java.util.Scanner;

public class Pendu {
	
	private static String mot = "hello";
	private static String mot0 = "*****";
	private static int count = 0;
	
	
	
	public static void main(String[] args) {
		
		Scanner nvltr = new Scanner(System.in);
		
		while (count < 10 && mot0.contains("*")  ) {
			
			System.out.println("C'est ton tour >>");
			String ltrentree = nvltr.next();
			essay(ltrentree);
		}
		nvltr.close();
	}
	public static void essay(String ltrentree) {
		String nvmot = "";
		for (int i =0; i < 5; i++) {
			if (mot.charAt(i)== ltrentree.charAt(0)) {
				nvmot+=ltrentree.charAt(0);
				System.out.println("Bravo!! ");
				
			} else if(mot0.charAt(i) != '*') {
				nvmot += mot.charAt(i);
			} else {
				nvmot += "*";
			}
		}
		System.out.println(nvmot);
		
		if (mot0.equals(nvmot)) {
			System.out.println("Nop! essay encore ");
			count++;
		}else {
			mot0 = nvmot;
		}
		
		if (mot0.equals(mot)) {
			System.out.println("t'as gagner");
		}
	}
}
