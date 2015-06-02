package classesparatrab3;

public class Professor extends Locatario{

	String disciplina; //disciplina que o professor está dando no semestre
	public Professor(String nome, int idade, String dis, char s) {
		super(1, 0, 60, 6, 0, idade, nome, s);
		this.disciplina = dis;
		// TODO Auto-generated constructor stub
	}
	

}
