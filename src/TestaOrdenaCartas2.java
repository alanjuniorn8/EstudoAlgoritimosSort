
//InsertionSort

public class TestaOrdenaCartas2 {
	public static void main(String[] args) {
		
		Cartas maoCartas[] = {
				new Cartas("Copas", 4),
				new Cartas("Copas", 7),
				new Cartas("Copas", 10),
				new Cartas("Espadas", 0),
				new Cartas("Ouros", 8)	
		};
		
		ordenaCartas(maoCartas);
		
		for(Cartas carta : maoCartas) {
			System.out.println(carta.getValor() + " de " + carta.getCarta());
		}
		
	}
	
	public static void ordenaCartas(Cartas[] cartas) {
		
		for(int atual = 1 ; atual < 5; atual++) {
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
