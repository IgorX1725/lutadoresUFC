package lutadores;

import lutadores.enums.CategoriaFem;
import lutadores.enums.CategoriaMasc;
import lutadores.enums.Sexo;

public class Lutador {
	private String nome;
	private Sexo sexo;
	private String liberacaoMedica;
	private String arteMarcialDominante;
	private Float peso;
	private CategoriaFem categoriaFem;
	private CategoriaMasc categoriaMasc;

	public Lutador(String nome, Sexo sexo, String liberacaoMedica, String arteMarcialDominante, Float peso,
			CategoriaFem categoria) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.liberacaoMedica = liberacaoMedica;
		this.arteMarcialDominante = arteMarcialDominante;
		this.peso = peso;
		this.categoriaFem = categoria;
	}
	
	public Lutador(String nome, Sexo sexo, String liberacaoMedica, String arteMarcialDominante, Float peso,
			CategoriaMasc categoria) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.liberacaoMedica = liberacaoMedica;
		this.arteMarcialDominante = arteMarcialDominante;
		this.peso = peso;
		this.categoriaMasc = categoria;
	}
	
	public static CategoriaMasc classificarCategoriaMasc(Float peso) {
		
		return null;
	}
	
public static CategoriaFem classificarCategoriaFem(Float peso) {
		
		return null;
	}

	public String getLiberacaoMedica() {
		return liberacaoMedica;
	}

	public void setLiberacaoMedica(String liberacaoMedica) {
		this.liberacaoMedica = liberacaoMedica;
	}

	public String getArteMarcialDominante() {
		return arteMarcialDominante;
	}

	public void setArteMarcialDominante(String arteMarcialDominante) {
		this.arteMarcialDominante = arteMarcialDominante;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public CategoriaFem getCategoriaFem() {
		return categoriaFem;
	}

	public void setCategoriaFem(CategoriaFem categoriaFem) {
		this.categoriaFem = categoriaFem;
	}

	public CategoriaMasc getCategoriaMasc() {
		return categoriaMasc;
	}

	public void setCategoriaMasc(CategoriaMasc categoriaMasc) {
		this.categoriaMasc = categoriaMasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome:" +nome+"\n"
				+ "Sexo:"+sexo+"\n"
				+ "Peso:"+peso+"\n"
				+ "Liberação Médica:" + liberacaoMedica + "\n"
				+ "Arte marcial dominante:"+ arteMarcialDominante + "\n"
				+ "Categoria masculina: " + categoriaMasc + "\n"
				+ "Categoria Feminina: " + categoriaFem + "\n";
	}	
	
}
