package classesparatrab3;

public class Comunidade extends Locatario{

	String cidade; //cidade/rua em que mora
	
	public Comunidade(String nome, int idade, String cid, char s) {
		super(0, 0, 15, 2, 0, idade, nome, s);
		this.cidade = cid;
		// TODO Auto-generated constructor stub
	}
	

}
