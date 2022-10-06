package formativa;

import java.util.Scanner;

public class Veiculo {
	double dinheiroAbastecer=0;
	double[] preco = {5.0, 5.0, 4.3, 2.9};
	Scanner s = new Scanner(System.in);
	double saldo, litros;
	int km;
	int opcao;


	public Veiculo(double saldo, double litros, int km) {
		super();
		this.saldo = saldo;
		this.litros = litros;
		this.km = km;
	}

	int acelerar() {
		this.km += 10;
		if (this.km > 200){
			this.km = 200;
		}
		return this.km;
	}
	int desacelerar() {
		km -= 10;
		if (this.km < 0){
			this.km = 0;
		}
		return this.km;
	}
	void manutencao() {
		return;
	}
	String Menuabastecer() {
		return "[1] - Shell: 5.0\n"+
				"[2] - BR: 4.85\n"+
				"[3] - Ipiranga: 4.9\n"+
				"[4] - Esso 4.41\n";
	}

	void EscolhaMenuAbastecer() {
		System.out.println(Menuabastecer());
		System.out.print("Escolha uma opcao: ");
		opcao = s.nextInt()-1;
		System.out.print("Quanto deseja abastecer? ");
		double dinheiroAbastecer = s.nextInt();
		this.litros += dinheiroAbastecer/preco[opcao];
		this.saldo -= dinheiroAbastecer;
		
	}
	String situacao() {
		return "-------------SITUACAO------------\n" + 
				"O saldo atual e: " + this.saldo + 
				"\nQuantidade de litros no tanque: " + this.litros + "\n";

	}
	String menu() {
		System.out.println(situacao());
		return "------------MENU-------------\n" +
		"[0] - SAIR\n"+
		"[1] - ACELERAR\n"+
		"[2] - DESACELERAR\n"+
		"[3] - MANUTENCAO\n"+
		"[4] - ABASTECER\n"+
		"[5] - SALDO NA CARTEIRA\n"+
		"---------------------------------";
	}
	void escolhaMenu(){
		while (true) {
			System.out.println(menu());
			System.out.print("Escolha uma opcao: ");
			opcao = s.nextInt();
			if (opcao==0) {
				break;
			}
			else if (opcao==1) {
				System.out.println("Sua velocidade aumentou 10km/h");
				System.out.println("Sua velociodade atual e de "+acelerar()+"km/h");
			}
			else if (opcao==2) {
				System.out.println("Sua velocidade diminuiu 10km/h");
				System.out.println("Sua velociodade atual e de "+desacelerar()+"km/h");
			}
			else if (opcao==3) {
				System.out.println("");
			}
			else if (opcao==4) {
				EscolhaMenuAbastecer();
			}
		}
		
	}
}

