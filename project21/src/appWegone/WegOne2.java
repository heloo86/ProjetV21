package appWegone;
import Orientacao.model.*;

public class WegOne2 {

	public static void main(String[] args) {
		
		
		
		// cada coluna se refere a um idioma 0 - Português, 1 - Espanhol, 2 - Ingles, 3 - Alemão, 4 - Francês
		
				Orientacao inicia = new Orientacao();
				/// instanciando orientações em PT 
				for (int novaOrient = 0; novaOrient < Orientacao.orientacoes.length; novaOrient ++) {
					Orientacao orientacao = new Orientacao ();
				
					
					String newID = "" + novaOrient + 0 ;
					
					
					orientacao.orientacoes[novaOrient][0] = orientacao;
					orientacao.orientacoes[novaOrient][0].setId(newID);
					
					System.out.println("Orientação criada em " + novaOrient + " coluna "+ 0 + " ID - " + Orientacao.orientacoes[novaOrient][0].getId());
					
				}
				
				System.out.println("///////////////////////////////////////////////////");
				
				// instancia as orientaçôes em Espanhol
				for (int novaOrient = 0; novaOrient < Orientacao.orientacoes.length; novaOrient ++) {
					
					Orientacao orientacao = new Orientacao ();
					
					String newID = "" + novaOrient + 1 ;
					
					orientacao.orientacoes[novaOrient][1] = orientacao;
					orientacao.orientacoes[novaOrient][1].setId(newID);
					
					
					System.out.println("Orientação criada em " + novaOrient + " coluna " + 1 + " ID - " + Orientacao.orientacoes[novaOrient][1].getId());
					
				}
				
				System.out.println("///////////////////////////////////////////////////");

				
				// instancia orientações em inglês 
				for (int novaOrient = 0; novaOrient < Orientacao.orientacoes.length; novaOrient ++) {
					
					Orientacao orientacao = new Orientacao ();
					
					String newID = "" + novaOrient + 2 ;
					
					Orientacao.orientacoes[novaOrient][2] = orientacao;
					Orientacao.orientacoes[novaOrient][2].setId(newID);
					
					System.out.println("Orientação criada em " + novaOrient + " coluna " + 2 + " ID - " + Orientacao.orientacoes[novaOrient][2].getId());
					
				}
				
				System.out.println("///////////////////////////////////////////////////");
				
				//intancia orientações em alemão
				for (int novaOrient = 0; novaOrient < Orientacao.orientacoes.length; novaOrient ++) {
					
					Orientacao orientacao = new Orientacao ();
					
					String newID = "" + novaOrient + 3 ;
					
					Orientacao.orientacoes[novaOrient][3] = orientacao;
					Orientacao.orientacoes[novaOrient][3].setId(newID);
					
					System.out.println("Orientação criada em " + novaOrient + " coluna " + 3 + " ID - " + Orientacao.orientacoes[novaOrient][3].getId());
					
				}
				
				System.out.println("///////////////////////////////////////////////////");
				
				// instancia orientações em francês
				for (int novaOrient = 0; novaOrient < Orientacao.orientacoes.length; novaOrient ++) {
					
					Orientacao orientacao = new Orientacao ();
					
					String newID = "" + novaOrient + 4 ;
					
					Orientacao.orientacoes[novaOrient][4] = orientacao;
					Orientacao.orientacoes[novaOrient][4].setId(newID);
					
					System.out.println("Orientação criada em " + novaOrient + " coluna " + 4 + " ID - " + Orientacao.orientacoes[novaOrient][4].getId());
					
				}
				
				/////////////////////////////////////////////////////////////////////////////////////
				inicia.cadastrarPT();
				inicia.cadastrarPT();
				inicia.buscarPT();
	}

}


