package entidade;

import java.util.Scanner;

public class Pessoa {
	int resp;
	
	void menu(){
		Scanner s = new Scanner(System.in);
		System.out.print("[1] opcao 1 \n"
				+ "[2] opcao 2 \n"
				+ "[3] opcao 3 \n"
				+ "[4] opcao 4 \n"
				+ "[5] opcao 5 \n");
		System.out.println("Digite uma opcao: ");
		resp = s.nextInt();
	}
	void Pergunta() {
		while (true) {
			menu();
			if (resp != 5) {
				System.out.println("Vc escolheu a opcao: " + resp);
			}else {
				System.out.println("Bye baby! ");
				break;
			}

		}
	}

}



