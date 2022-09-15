package listas;
import java.util.Arrays;
import java.util.Scanner;

public class VetorParImpar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz! ");
		
		//VARIAVEIS PARA QUANTIDADE, TAMANHO DA LISTA E INDICE 
		int tamanho = s.nextInt();
		int qtd_par = 0;
		int qtd_impar = 0;
		int iPar = 0;
		int iImpar = 0;
		
		//O VETOR INDICE RECEBE O TAMANHO DIGITADO PELO USU�RIO
		int[] numeros = new int[tamanho];

		//PRIMEIRO FOR PARA O PRIMEIRO VETOR
		for (int i=0; i<tamanho; i++) {
			System.out.printf("Coloque o %d� n�mero: ", (i+1));
			int n = s.nextInt();	
			numeros[i] = n;      //N�MEROS [I] RECEBE OS N�MEROS DIGITADOS PELO USU�RIO
			
		//SE O RESTO DA DIVIS�O FOR 0 A QUANTIDADE DE PAR RECEBE +1, A MESMA COISA PARA O N� IMPAR
			if (n % 2 == 0)
			{
				qtd_par++;
			}
			else {
				qtd_impar++;
			}
		}
		//CRIANDO AS LISTAS DE PAR E IMPAR
		int[] par = new int[qtd_par];
		int[] impar = new int[qtd_impar];

		//FOR PARA PERCORRER A 1� LISTA PRONTA E VERIFICANDO SE OS N�MEROS S�O PARES OU IMPARES
		for(int i=0; i<tamanho; i++)
			if (numeros[i] % 2 ==0) { //O VETOR N�MEROS NA POSI��O i � par?
				par[iPar] = numeros[i]; //VETOR PAR, ADICIONANDO NO INDICE PAR, O N� DO VETOR 1
				iPar++; //INCREMENTADOR RECEBENDO O N�MERO PAR
			}
			else {
				impar[iImpar] = numeros[i];
				iImpar++;
			}
		System.out.println(Arrays.toString(numeros)); //convertemos para String, por qu� sem ela vai printar o n�mero da mem�ria e n�o da lista
		System.out.println(Arrays.toString(par));
		System.out.println(Arrays.toString(impar));
	}
}

