
public class TesteArray {

	public static void main(String[] args) {
		
		int notas[] = new int[4];
		
		notas[0] = 8;
		notas[1] = 7;
		notas[2] = 10;
		notas[3] = 6;
		
		System.out.println(notas[2] + notas[0]);
		
		
		String linguagens[] = new String[5];
		
		linguagens[0] = "Java";
		linguagens[1] = "C#";
		linguagens[2] = "PHP";
		linguagens[3] = "Ruby";
		linguagens[4] = "Kotlin";
		
		System.out.println(linguagens.length);
		
		int i = 0;
		
		while (i < linguagens.length) {
			System.out.println(linguagens[i]);
			i++;
		}
		
	}

}
