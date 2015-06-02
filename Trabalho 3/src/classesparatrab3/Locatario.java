package classesparatrab3;


public class Locatario {
	public int DeiGratia; //Se a pessoa pode emprestar qualquer livro ou não. 1 se sim, 0 se não
	public long DiesIrae; //Dias de Suspensão/atraso 
	public long SineMora; //Dias Máximos para a Locação
	public int VoxDei; //Quantos Livros a pessoa pode emprestar
	public int VoxHomini; //Quantos Livros a pessoa tem emprestado
	public int idade;
	public String nome;
	public char sexo;
	
	public Locatario(int deiGratia, long diesIrae, long sineMora, int voxDei,
			int voxHomini, int idade, String nome, char s) {
		super();
		DeiGratia = deiGratia;
		DiesIrae = diesIrae;
		SineMora = sineMora;
		VoxDei = voxDei;
		VoxHomini = voxHomini;
		this.idade = idade;
		this.nome = nome;
		this.sexo = s;
	}
	
	public void empresta(){
		
	}
	
	public void devolve(){
		
	}
	
	
	
	

}
