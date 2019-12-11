package Principal;

import java.util.Scanner;

import lutadores.ListaLutadores;
import lutadores.Lutador;
import lutadores.enums.Sexo;

public class Main {

	public static void main(String[] args) {
		ListaLutadores listaLutadores = new ListaLutadores();
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while (index != 7) {
			System.out.println("digite op√ß√£o desejada:");
			System.out.println("1 - Cadastrar Lutador");
			System.out.println("2 - listar todos lutadores cadastrados");
			System.out.println("3 - filtrar lutadores por peso");
			System.out.println("4 - filtar lutadores por categoria");
			System.out.println("5 - filtrar lutadores por sexo");
			System.out.println("6 - hist√≥ria do UFC");
			System.out.println("7 - sair");
			index = sc.nextInt();
			switch (index) {
			case 1:
				System.out.println();
				System.out.println("Digite o nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Digite Peso:");
				Float peso = sc.nextFloat();
				System.out.println("Sexo: 1 - Maculino 2 - Feminino");
				Sexo sexo;
				int mascFem = sc.nextInt();
				if (mascFem == 1) {
					sexo = Sexo.MASCULINO;
				} else if (mascFem == 2) {
					sexo = Sexo.FEMININO;
				} else {
					System.out.println("Op√ß√£o incorreta, tente novamente");
					break;
				}
				System.out.println("Libera√ß√£o Medica:");
				sc.nextLine();
				String liberacaoMedica = sc.nextLine();
				System.out.println("Arte marcial Dominante:");
				String arteMarcialDominante = sc.nextLine();

				if (sexo == Sexo.MASCULINO) {
					listaLutadores.insereLutador(new Lutador(nome, sexo, liberacaoMedica, arteMarcialDominante, peso,
							Lutador.classificarCategoriaMasc(peso)));
				} else {
					listaLutadores.insereLutador(new Lutador(nome, sexo, liberacaoMedica, arteMarcialDominante, peso,
							Lutador.classificarCategoriaFem(peso)));
				}

				break;
			case 2:
				System.out.println("Lista dos lutadores cadastrados:");
				System.out.println(listaLutadores.toString());
				break;
			case 3:
				System.out.println("Digite Peso que deseja filtrar:");
				Float peso = sc.nextFloat();

				List<Lutador> lutadoresPorPeso = listaLutadores.filtroPorPeso(peso) list ;

				if (!lutadoresPorPeso.isEmpty()) {
					for (int i = 0; i < this.lutadoresPorPeso.length; i++ ) {
						System.out.println(lutadoresPorPeso[i].toString());
					}
				}else{
					System.out.println("N„o existem lutadores com este peso para filtrar");
				}

			case 4:
				System.out.println("Digite o sexo (1 = MASCULINO OU 2 = FEMININO) da categoria que deseja filtrar:");
				int sexoLutador = sc.nextInt();

				if (sexoLutador == 1) {
					sexoLutadores = Sexo.MASCULINO;
				} else (sexoLutador == 2) {
					sexoLutadores = Sexo.FEMININO;
				}
				
				if(sexoLutador == 1){
					System.out.println("Digite a categoria que deseja filtrar (1 = MOSCA, 2 = GALO, 3 = PENA, 4 = LEVE, 5 =	MEIOMEDIO, 6 = MEDIO, 7 = MEIOPESADO, 8 = PESADO):");
					int categLutador = sc.nextInt();
				}else{
					System.out.println("Digite a categoria que deseja filtrar (1 = PALHA, 2 = MOSCA, 3 = GALO, 4 = PENA):");
					int categLutador = sc.nextInt();
				}
				
				List<Lutador> lutadoresPorCategoria = listaLutadores.filtroPorCategoria(Sexo sexoLutadores, categLutador, CategoriaMasc categoriaMasc, CategoriaFem categoriaFem) list ;

				if (!lutadoresPorCategoria.isEmpty()) {
					for (int i = 0; i < this.lutadoresPorCategoria.length; i++ ) {
						System.out.println(lutadoresPorCategoria[i].toString());
					}
				}else{
					System.out.println("N„o existem lutadores deste sexo para filtrar");
				}
				
			case 5:
				System.out.println("Digite o sexo (1 = MASCULINO OU 2 = FEMININO) que deseja filtrar:");
				int sexoLutador = sc.nextInt();

				if (sexoLutador == 1) {
					sexoLutadores = Sexo.MASCULINO;
				} else (sexoLutador == 2) {
					sexoLutadores = Sexo.FEMININO;
				}
				
				List<Lutador> lutadoresPorSexo = listaLutadores.filtroPorSexo(Sexo sexoLutadores) list ;

				if (!lutadoresPorSexo.isEmpty()) {
					for (int i = 0; i < this.lutadoresPorSexo.length; i++ ) {
						System.out.println(lutadoresPorSexo[i].toString());
					}
				}else{
					System.out.println("N„o existem lutadores deste sexo para filtrar");
				}
				
			case 6:
				System.out.println("Criado em 1993 como uma organizaÁ„o profissional de artes marciais mistas (MMA), "
						+ "o UFCÆ revolucionou a ind˙stria da luta e hoje se destaca tanto como uma marca global premium de esporte quanto como uma empresa de produÁ„o de conte˙do "
						+ "e o maior  provedor de eventos Pay-Per-View (PPV) do mundo."
						+ "O UFC segue uma histÛria e uma tradiÁ„o ricas de MMA competitivo que remonta ao Pancr·cio, "
						+ "uma luta introduzida nos Jogos OlÌmpicos gregos no ano de 648 a.C. H· cerca de 80 anos, "
						+ "uma forma brasileira de MMA conhecida como Vale-Tudo despertou o interesse local pelo esporte. "
						+ "O UFC ent„o introduziu o MMA organizado e sancionado nos Estados Unidos. "
						+ "A programaÁ„o do UFC È transmitida para mais de 165 paÌses e territÛrios, "
						+ "via mais de 60 parceiros globais, para mais de 1,1 bilh„o de residÍncias em 40 lÌnguas diferentes. "
						+ "O UFC tem a maior concentraÁ„o de millennials (com idades entre 18 e 34 anos) em sua base de f„s, "
						+ "com 40% em comparaÁ„o com as principais propriedades esportivas. "
						+ "Ao longo dos anos, o UFC vem buscando constantamente os mais altos nÌveis de seguranÁa e qualidade em todos os aspectos do esporte. "
						+ "A organizaÁ„o tem procurado desfazer os estereÛtipos de gÍnero e estabelecer novos padrıes para a sa˙de e o bem-estar dos lutadores, "
						+ "e foi a primeira organizaÁ„o de esporte de combate a fornecer a seus atletas cobertura de seguro contra acidentes relacionados a treinamento."
			case 7:
				System.out.println("Encerrando a aplica√ß√£o!");
				System.exit(0);
			default:
				System.out.println("Comando incorreto, digite novamente");
				break;
			}
		}
		sc.close();
	}
}
