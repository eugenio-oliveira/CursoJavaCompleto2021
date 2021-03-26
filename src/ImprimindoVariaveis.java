
public class ImprimindoVariaveis {
	
	//Tipos primitivos: int, float, double, boolean, byte, short, char, byte
		
	public static void main(String[] args) {
		
		String nome = "Eugênio";		
		int idade = 2021 - 1984;
		String[] hobbies = {"comer, beber, dormir"};

		System.out.println("Nome: " + nome + "\nIdade: " + idade);
		
		for (int i = 0; i < hobbies.length; i++) {
			
			System.out.println("Hobbies: " + hobbies[i]);
		}
		
	}

}
