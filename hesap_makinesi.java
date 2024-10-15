// JAVA 17
// Basit hesap makinesi

import java.util.Scanner;

public class hesap_makinesi{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String error1 = "GEÇERSİZ GİRDİ";

		while(true){

			System.out.print("Rakam 1 : ");
			int rakam_1_int_fromMain = input.nextInt();

			System.out.print("Rakam 2 : ");
			int rakam_2_int_fromMain = input.nextInt();

			System.out.print("operatör Seç: >| +  -  *  / |<  --> ");
			String operator_Str_fromMain = input.next();

			if (operator_Str_fromMain.equals("+")) {
				System.out.print("Sonuç: ");
				System.out.println(rakam_1_int_fromMain + rakam_2_int_fromMain);				
			}
			else if(operator_Str_fromMain.equals("-")){
				System.out.print("Sonuç: ");
				System.out.println(rakam_1_int_fromMain - rakam_2_int_fromMain);
			}
			else if(operator_Str_fromMain.equals("*")){
				System.out.print("Sonuç: ");
				System.out.println(rakam_1_int_fromMain * rakam_2_int_fromMain);
			}
			else if(operator_Str_fromMain.equals("/")){
				System.out.print("Sonuç: ");
				System.out.println(rakam_1_int_fromMain / rakam_2_int_fromMain);
			}
			else if(operator_Str_fromMain.equals("çık")){
				break;
			}
			else{
				System.out.println(error1);
			}
			

		}

	}

}
