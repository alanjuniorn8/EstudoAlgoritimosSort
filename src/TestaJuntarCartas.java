
//MergeSort

public class TestaJuntarCartas {

	public static void main(String[] args) {
		
		Cartas cartasJogador1[] = {
				
				new Cartas("Espadas", 1),
				new Cartas("Copas", 4),
				new Cartas("Copas", 7),
				new Cartas("Copas", 10)
				

			};
		Cartas cartasJogador2[] = {
				
				new Cartas("Copas", 2),
				new Cartas("Espadas", 5),
				new Cartas("Copas", 6),
				new Cartas("Ouros", 8),
				new Cartas("Copas", 9)
		
		};
		
		
		Cartas[] maoCartas = junta(cartasJogador1, cartasJogador2);
		for(Cartas carta : maoCartas) {
			System.out.println(carta.getValor() + " de " + carta.getCarta());
		}
		
		
		
	}

	private static Cartas[] junta(Cartas[] cartasJogador1, Cartas[] cartasJogador2) {
		int quantidadeDeCartas = cartasJogador1.length + cartasJogador2.length;
		Cartas[] maoCartas = new Cartas[quantidadeDeCartas];
		int atualJogador1 = 0;
		int atualJogador2 = 0;
		int atual = 0;
		
		while (atualJogador1 < cartasJogador1.length &&  atualJogador2 < cartasJogador2.length) {
			
			Cartas carta1 = cartasJogador1[atualJogador1];
			Cartas carta2 = cartasJogador2[atualJogador2];
			
			if(carta1.getValor() < carta2.getValor()) {
				maoCartas[atual] = carta1;
				atualJogador1++;
			}
			else {
				maoCartas[atual] = carta2;
				atualJogador2++;
			}
			
			atual++;
			
		}
		
		while(atualJogador1 < cartasJogador1.length) {
			maoCartas[atual] = cartasJogador1[atualJogador1];
			atualJogador1 ++;
			atual++;
		}
		
		while(atualJogador2 < cartasJogador2.length) {
			maoCartas[atual] = cartasJogador2[atualJogador2];
			atualJogador2 ++;
			atual++;
		}
		
		return maoCartas;
	}

	
	
	
}
