package classesparatrab3;

public class Livro {
	
	public int ego; //Se o livro é texto, 1. Se o livro for geral, 0
	//public int superego; //Quantos desse livro a biblioteca possui, para verificar se pode ser emprestado.
	public String id; // Título
	public String persona; //Autor
	public int publish; //Data de lançamento
	public String press; //Editora
	
	public Livro(int ego, int pub, String id, String persona, String press) {//int superego
		super();
		this.ego = ego;
		//this.superego = superego;
		this.id = id;
		this.persona = persona;
		this.publish = pub;
		this.press = press;
		
	}
	
	
	
	

}
