
//QuickSort

public class TestaOrdenaRapido {

	public static void main(String[] args) {

		Cartas cartas[] = {
				
				new Cartas("Espadas", 1),
				new Cartas("Copas", 4),
				new Cartas("Copas", 10),
				new Cartas("Ouros", 8),
				new Cartas("Copas", 2),
				new Cartas("Espadas", 5),
				new Cartas("Copas", 6),
				new Cartas("Copas", 7),
				new Cartas("Copas", 9)
		
		};
		
		
		ordenar(cartas, 0, cartas.length);
		int posicaoCarta = buscar(cartas, 0, cartas.length, 5);
		
		if (posicaoCarta == -1) {
			System.out.println("Carta não encontrada");
		}
		else {
			System.out.println("Achada a carta " + cartas[posicaoCarta].getValor() + " de " + 
					cartas[posicaoCarta].getCarta() + " na posiçâo " + posicaoCarta);
		}
	
		
		for(Cartas carta : cartas) {

			System.out.println(carta.getValor() + " de " + carta.getCarta());
		}
	}

	private static int buscar(Cartas[] cartas, int de, int ate, int buscando) {
		if(de>ate) {
			return -1;
		}
		int meio= (de + ate)/2;
		Cartas carta = cartas[meio];
		if (carta.getValor() == buscando ) {
			return meio;
			
		}
		if(carta.getValor() > buscando) {
			return buscar(cartas, de, meio - 1, buscando);
		}
		return buscar(cartas, meio + 1, ate, buscando);
	}

	private static void ordenar(Cartas[] cartas, int de, int ate) {
		
		int quantidadeCartas = ate - de;
		if(quantidadeCartas > 1) {
			int posicaoPivo = divide(cartas, de, ate);
			ordenar(cartas, 0, posicaoPivo);
			ordenar(cartas, posicaoPivo, ate);
		}
		
	}

	private static int divide(Cartas[] cartas, int de, int ate) {
		
		int quantidadeCartasMenores = 0;
		Cartas pivo = cartas[ate - 1];
		for( int analisando = 0; analisando < ate; analisando++) {
			Cartas atual = cartas[analisando];
			if(atual.getValor() < pivo.getValor()) {
				troca(cartas, analisando, quantidadeCartasMenores);
				quantidadeCartasMenores ++;
			}
			
			
		}
		troca(cartas, ate -1, quantidadeCartasMenores);
		return quantidadeCartasMenores;
	}

	private static void troca(Cartas[] cartas, int analisando, int quantidadeCartasMenores) {
		Cartas atual = cartas[analisando];
		Cartas novoPivo = cartas[quantidadeCartasMenores];
		cartas[analisando] = novoPivo ;
		cartas[quantidadeCartasMenores] = atual ;
		
	}

}
