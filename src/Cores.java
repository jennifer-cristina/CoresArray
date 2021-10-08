import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {

		String cores[] = new String[10];
		
		cores[0] = "Azul";
		cores[1] = "Amarelo";
		cores[2] = "Vermelho";
		cores[3] = "Roxo";
		cores[4] = "Preto";
		cores[5] = "Verde";
		cores[6] = "Cinza";
		cores[7] = "Branco";
		cores[8] = "Laranja";
		cores[9] = "Lilás";
		
		Scanner leitor = new Scanner(System.in);
		
		String resposta = "";
		boolean encontrei = false;
		
		System.out.print("Por favor, insira uma cor: ");
		resposta = leitor.next();
		
		leitor.close();
		
		for (int i = 0; i < cores.length; i++) {
			if (resposta.equalsIgnoreCase(cores[i])) {
				System.out.println("A cor está na lista");
				encontrei = true;
				break;
			}
		}
		
		if (encontrei == false) {
			System.out.println("A cor não está na lista.");
		}
		
	}

}
