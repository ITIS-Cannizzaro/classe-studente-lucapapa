package ditta;
public class veri09 {
	private int a=2006;
	private String n="simone";
	public veri09(String nome, int adn) {
	
	}
	public void setanno() {
		int anno=a;
	}
	public int getanno(int anno) {
		return anno;
	}
	public void setanno2(int adn) {
		int anno2=adn;
	}
	public int getanno2(int anno2) {
		return anno2;
	}
	public String toString() {
		return "veri09 []";
	}
}


package ditta;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire il nome dello studente");
		String nome = scan.nextLine();
		System.out.println("inserire l'anno di nascita dello studente");
		int adn= scan.nextInt();
		veri09 s1=new veri09(nome,adn);
		int a=2006;
		String n="simone";
		veri09 s2=new veri09(n, a);
		if(adn>a) {
			System.out.println(nome+"e' piu grande");
		}else if(adn<a) {
			System.out.println(n+"e' piu grande");
		}else {
			System.out.println(nome+" e "+n
					+" sono coetanei");
		}	
	}
}
