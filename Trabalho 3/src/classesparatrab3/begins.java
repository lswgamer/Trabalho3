package classesparatrab3;


import java.text.SimpleDateFormat;
import java.util.Date;

public class begins { 
	
	SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	public String locatario;
	public String livro;
	public Date retirada;
	public begins(String locatario, String livro, Date retirada) {
		super();
		this.locatario = locatario;
		this.livro = livro;
		this.retirada = retirada;
	}


}
