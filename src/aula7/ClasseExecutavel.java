package aula7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
public class ClasseExecutavel {
	public static final String ANSI_RESET="\u001B[0m";
	public static final String ANSI_BLUE="\u001B[44m";
	public static final String ANSI_YELLOW="\u001B[33m";
	

	public static void main(String[] args) {
		
		int[]elementos=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int cont=0;cont<elementos.length;cont++) {
			System.out.println(ANSI_BLUE+"<<<POSICAO>>>>"+ANSI_RESET);
			elementos[cont]=scan.nextInt();
		}
		System.out.println(ANSI_BLUE+"<<<<<>>>>><<<<>>>>><<<<>>><<<>>><<<>>><<<>>>"+ANSI_RESET);
		Arrays.sort(elementos);
		for(int cont1=0;cont1 < elementos.length;cont1++) {
			System.out.println( ANSI_YELLOW+"Elementos ordem crescente>>> " +elementos[cont1] +ANSI_RESET);
		}
		

	}

}
