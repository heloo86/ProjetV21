package Orientacao.model;
import java.util.Scanner;
public class Orientacao {
	
	public static Orientacao[][] orientacoes = new Orientacao [100][5];
	
	private String id;
	private int tipo;
	private String titulo;
	private String orientacao;
	private int idioma;
	private boolean exist;
	
	public Orientacao() {
		
		this.tipo = 0;
		this.titulo = "";
		this.orientacao = "";
		this.idioma = 0;
		this.exist = false;
	}
	
	public Orientacao(String id, int tipo, String titulo, String orientacao, int idioma, boolean exist) {
		
		this.id = "";
		this.tipo = tipo;
		this.titulo = titulo;
		this.orientacao = orientacao;
		this.idioma = idioma;
		this.exist = exist;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(String orientacao) {
		this.orientacao = orientacao;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}	
	
	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	////////////////////////////////////////////////////////////////////
	
	Scanner scan = new Scanner (System.in);
	
	public void print() {
		System.out.println("Id: " + this.id);
		System.out.println(this.titulo);
		System.out.print(this.orientacao);
	}

    public void cadastrarPT() {
        Scanner scan = new Scanner(System.in);
        boolean encontrouVaga = false;
        int posicao = -1;
        
        // Procura uma posição com objeto vazio no array
        for (int i = 0; i < orientacoes.length; i++) {
            if (!orientacoes[i][0].isExist()) {
                encontrouVaga = true;
                posicao = i;
                break;
            }
        }
        
        if (encontrouVaga) {
            boolean valido = true;
            int tipo = 0;
            
            do {
                System.out.println("===================================================");
                System.out.println("\n             CADASTRO ORIENTAÇÃO - " + orientacoes[posicao][0].getId() + "\n");
                System.out.println("===================================================");
                System.out.println("                Tipos de Orientações               ");
                System.out.println("===================================================");
                System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
                System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
                System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
                System.out.println("===================================================");
                
                System.out.print("Escolha o tipo de orientação(numero): ");
                tipo = scan.nextInt();
                scan.nextLine(); // Limpar o buffer do scanner
                
                if (tipo > 0 && tipo < 7) {
                    valido = true;
                } else {
                    System.out.println("\n Tipo inexistente \n");
                    valido = false;
                }
            } while (!valido);
            
            // Salva o tipo escolhido
            orientacoes[posicao][0].setTipo(tipo);
            
            System.out.println("===================================================");
            System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
            System.out.println("===================================================");
            
            
            //---------- Inicio do cadastro-------------------------
            
            // Validação para o título em português
            
            String titulo = "";
            String orientacao = "";
            int idioma = 0;
            
            do {
               valido = true;
                System.out.print("Digite o titulo em Portugês: ");
                titulo = scan.nextLine();
                
                if (titulo.trim().isEmpty()) {
                    System.out.println("\n A orientação precisa de um título válido\n");
                    valido = false;
                    continue;
                }
                
                // Verifica se já existe um título igual
                for (int i = 0; i < orientacoes.length; i++) {
                    if (orientacoes[i][idioma].isExist() && titulo.equalsIgnoreCase(orientacoes[i][idioma].getTitulo())) {
                        System.out.println("\n Já existe uma orientação com este título");
                        valido = false;
                        break;
                    }
                }
            } while (!valido);
            
            orientacoes[posicao][idioma].setTitulo(titulo);
            
            // Validação para a orientação em português
            
            do {
                valido = true;
                System.out.println("---------------------------------------------------------");
                System.out.print("Digite a orientação: ");
                orientacao = scan.nextLine();
                
                if (orientacao.trim().isEmpty()) {
                    System.out.println("\n É preciso preencher este campo\n");
                    valido = false;
                }
            } while (!valido);
            
            // Salva os dados no objeto
            orientacoes[posicao][idioma].setOrientacao(orientacao);
            
            orientacoes[posicao][idioma].setIdioma(1); 
            orientacoes[posicao][idioma].setExist(true); 
            
        
        
        //-----------------------------------------------------------------------------------Espanhol
        
     
            
        titulo = ""; //Limpa variavel do titulo
        idioma = 1; // define idioma como 1 referente ao espanhol
        
        // Validação para o titulo em espanhol
        do {
        	valido = true;
            System.out.print("Digite o titulo em Portugês: ");
            titulo = scan.nextLine();
            
            if (titulo.trim().isEmpty()) {
                System.out.println("\n A orientação precisa de um título válido\n");
                valido = false;
                continue;
            }
            
            // Verifica se já existe um título igual
            for (int i = 0; i < orientacoes.length; i++) {
                if (orientacoes[i][idioma].isExist() && titulo.equalsIgnoreCase(orientacoes[i][idioma].getTitulo())) {
                    System.out.println("\n Já existe uma orientação com este título");
                    valido = false;
                    break;
                }
            }
        } while (!valido);
        
        orientacoes[posicao][idioma].setTitulo(titulo);
        
        // validação para a orientação em português
        orientacao = ""; // limpa variavel que recebe a orientacao
        do {
            valido = true;
            System.out.println("---------------------------------------------------------");
            System.out.print("Digite a orientação: ");
            orientacao = scan.nextLine();
            
            if (orientacao.trim().isEmpty()) {
                System.out.println("\n É preciso preencher este campo\n");
                valido = false;
            }
        } while (!valido);
        
        // Salva os dados no objeto
        orientacoes[posicao][idioma].setOrientacao(orientacao);
        orientacoes[posicao][idioma].setIdioma(1); 
        orientacoes[posicao][idioma].setExist(true); 
        
    }
        
        
        
        
    }
            
////////////////////////////////////////////////////////////////////////////////////////////
 
	public void buscarPT () {
		System.out.println("Digite o id ou o titulo que deseja buscar: ");
		String busca = scan.nextLine();
		
		for (int i = 0; i < orientacoes.length; i++) {
          if (busca.equalsIgnoreCase(orientacoes[i][0].titulo) || busca.equalsIgnoreCase(orientacoes[i][0].id)) {
            	orientacoes[i][0].print();
            	break;
            } else if (busca.equalsIgnoreCase(orientacoes[i][1].titulo) || busca.equalsIgnoreCase(orientacoes[i][0].id)) {
            	orientacoes[i][1].print();
            	break;
            } else if (busca.equalsIgnoreCase(orientacoes[i][2].titulo) || busca.equalsIgnoreCase(orientacoes[i][2].id)) {
            	orientacoes[i][2].print();
            	break;
            } else if (busca.equalsIgnoreCase(orientacoes[i][3].titulo) || busca.equalsIgnoreCase(orientacoes[i][3].id)) {
            	orientacoes[i][3].print();
            	break;
            } else if (busca.equalsIgnoreCase(orientacoes[i][4].titulo) || busca.equalsIgnoreCase(orientacoes[i][4].id)) {
            	orientacoes[i][4].print();
            	break;
            } else {
            	System.out.println("Orientação não encontrada, tente procurar na lista");
            }
		
		}
	}
	
	public void excluirPT () {
		
	}
	
	public void editarPT () {
		
	}
	
	
	
	
	

}
