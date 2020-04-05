
// SelectionSort

public class TestaOrdenaCartas {
	
	public static void main(String[] args) {
		
		Cartas maoCartas[] = {
			new Cartas("Copas", 4),
			new Cartas("Copas", 7),
			new Cartas("Copas", 10),
			new Cartas("Espadas", 1),	
		};
		
	ordenaCartas(maoCartas, maoCartas.length);
	
	for(Cartas carta : maoCartas) {
		System.out.println(carta.getValor() + " de " + carta.getCarta());
	}
	
	
	}

	
	
	public static void ordenaCartas(Cartas[] cartas, int numeroDeCartas) {
		int cartaMenor = 0;
		for(int carta = 0; carta < numeroDeCartas - 1; carta++) {
			for(int cartaAtual = carta; cartaAtual < numeroDeCartas; cartaAtual++ ){
				if( cartas[cartaAtual].getValor() < cartas[cartaMenor].getValor()) {
					cartaMenor = cartaAtual;
				}
			}

		Cartas atual = cartas[carta];
		Cartas menor = cartas[cartaMenor];
		cartas[carta] = menor ;
		cartas[cartaMenor] = atual ;
		}
	}
}
