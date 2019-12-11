package lutadores;

import java.util.ArrayList;
import java.util.List;

public class ListaLutadores {

	private List<Lutador> listaDeLutadores;

	public ListaLutadores() {
		this.listaDeLutadores = new ArrayList<Lutador>();
	}

	public List<Lutador> getListaDeLutadores() {
		return listaDeLutadores;
	}

	public void insereLutador(Lutador lutador) {
		listaDeLutadores.add(lutador);
	}

	public List<Lutador> filtroPorPeso(peso) {
		List<Lutador> lutadoresPorPeso = new ArrayList<Lutador>();
		
		if (listaDeLutadores != null && !listaDeLutadores.isEmpty()) {
			for (int i = 0; i < this.listaDeLutadores.length; i++ ) {
				if (this.listaDeLutadores[i].peso == peso){
					lutadoresPorPeso.add(listaDeLutadores);
				}
		    }
		}

		return lutadoresPorPeso;
	}

	public List<Lutador> filtroPorCategoria(Sexo sexoLutadores, categLutador, CategoriaMasc categoriaMasc, CategoriaFem categoriaFem) {
		List<Lutador> lutadoresPorCategoria = new ArrayList<Lutador>();
		
		if(sexoLutadores ==  Sexo.MASCULINO){
			if(categLutador == 1){
				categoriaMasc = CategoriaMasc.MOSCA;
			}else if(categLutador == 2){
				categoriaMasc = CategoriaMasc.GALO;
			}else if(categLutador == 3){
				categoriaMasc = CategoriaMasc.PENA;
			}else if(categLutador == 4){
				categoriaMasc = CategoriaMasc.LEVE;
			}else if(categLutador == 5){
				categoriaMasc = CategoriaMasc.MEIOMEDIO;
			}else if(categLutador == 6){
				categoriaMasc = CategoriaMasc.MEDIO;
			}else if(categLutador == 7){
				categoriaMasc = CategoriaMasc.MEIOPESADO;
			}else{
				categoriaMasc = CategoriaMasc.PESADO;
			}
		}else{
			if(categLutador == 1){
				categoriaFem = CategoriaFem.PALHA;
			}else if(categLutador == 2){
				categoriaFem = CategoriaFem.MOSCA;
			}else if(categLutador == 3){
				categoriaFem = CategoriaFem.GALO;
			}else{
				categoriaFem = CategoriaFem.PENA;
			}
		}
		
		if (listaDeLutadores != null && !listaDeLutadores.isEmpty()) {
			for (int i = 0; i < this.listaDeLutadores.length; i++ ) {
				if (this.listaDeLutadores[i].categoria == (sexoLutadores ==  Sexo.MASCULINO ? categoriaMasc : categoriaFem)){
					lutadoresPorCategoria.add(listaDeLutadores);
				}
		    }
		}

		return lutadoresPorCategoria;
	}

	public List<Lutador> filtroPorSexo(Sexo sexoLutador){
		List<Lutador> lutadoresPorSexo = new ArrayList<Lutador>();
		
		if (listaDeLutadores != null && !listaDeLutadores.isEmpty()) {
			for (int i = 0; i < this.listaDeLutadores.length; i++ ) {
				if (this.listaDeLutadores[i].sexo == sexoLutador){
					lutadoresPorSexo.add(listaDeLutadores);
				}
		    }
		}
		
		return lutadoresPorSexo;
}

	@Override
	public String toString() {
		String stringText = "";

		for (Lutador lutador : listaDeLutadores) {
			stringText += lutador.toString() + "\n";
		}
		return stringText;
	}

}
