
//InsertionSort

public class TestaOrdenaCartas2 {
	public static void main(String[] args) {
		
		Cartas maoCartas[] = {
				new Cartas("Ouros", 8),
				new Cartas("Copas", 2),
				new Cartas("Copas", 9),
				new Cartas("Copas", 6),
				new Cartas("Espadas", 5)	
		};
		
		ordenaCartas(maoCartas);
		
		for(Cartas carta : maoCartas) {
			System.out.println(carta.getValor() + " de " + carta.getCarta());
		}
		
	}
	
	public static void ordenaCartas(Cartas[] cartas) {
		
		for(int atual = 1 ; atual < cartas.length; atual++) {
			int analise = atual;
			while(analise > 0 &&  cartas[analise].getValor() < cartas[analise - 1].getValor()) {
				movimentaCartas(cartas, analise, analise -1);
				analise = analise - 1;
			}
		}
	}
	
	public static void movimentaCartas(Cartas[] cartas, int cartaAtual, int cartaAnterior) {
		
		Cartas atual = cartas[cartaAtual];
		Cartas anterior = cartas[cartaAnterior];
		cartas[cartaAtual] = anterior ;
		cartas[cartaAnterior] = atual ;
	}
	
	
	
}
