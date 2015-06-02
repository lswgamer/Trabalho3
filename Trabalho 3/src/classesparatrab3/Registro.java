//Pedro Regattieri Rocha 8531702

package classesparatrab3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Registro {
	static int option = -1;
	static int age;
	static long dias;
	private static String s;
	private static String n;
	private static String g;
	private static int aux;
	private static char c;
	private static SimpleDateFormat formato = new SimpleDateFormat("dd MM aaaa");
	public static Date hoje;
	static ArrayList<Locatario> usuarios = new ArrayList<Locatario>();
	static ArrayList<Livro> livros = new ArrayList<Livro>();
	static ArrayList<begins> emprestimos = new ArrayList<begins>();
	
	//Lista de livros cadastrados, usuários cadastrados e empréstimos.
	public static void main(String [ ] args) throws IOException
	{
		String comma = ",";
        BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("registro.csv"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        while ((s = br.readLine()) !=null){
             String[] b = s.split(comma);
             if (b[0].equals("1")){
            	 if(b[1].equals("1")){
            		 Aluno a = new Aluno(b[2], Integer.parseInt(b[4]), b[3], b[5].charAt(0)); 
          			  usuarios.add(a);
            	 }
            	 else if(b[1].equals("2")){
            		 Professor a = new Professor(b[2], Integer.parseInt(b[4]), b[3], b[5].charAt(0)); 
          			  usuarios.add(a);
            	 }
            	 else if(b[1].equals("3")){
            		 Comunidade a = new Comunidade(b[2], Integer.parseInt(b[4]), b[3], b[5].charAt(0)); 
          			  usuarios.add(a);
            	 }
             }
             if (b[0].equals("2")){
            	 Livro l = new Livro(Integer.parseInt(b[1]), Integer.parseInt(b[5]), b[2], b[3], b[4]);
            	 livros.add(l);

             }
             if (b[0].equals("3")){
            	 try {
					hoje = formato.parse(b[3]);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	 begins e = new begins(b[1], b[2], hoje);
            	 emprestimos.add(e);
             }
             
        }
        br.close();
		System.out.println("Insira a data atual no estilo dd MM aaaa \n");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = bufferRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			hoje = formato.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    while(option != 0){  
	    	System.out.println("O que você deseja fazer?\n Pressione 1 para cadastrar um novo usuário \n Pressione 2 para cadastrar um novo livro \n Pressione 3 para registrar um empréstimo \n Pressione 4 para registrar uma devolução \n Pressione 5 para imprimir dados \n");
			try {
				option = bufferRead.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  if (option == 1){ // Cadastra um usuário. 1 é Aluno, 2 é professor 3 é comunidade
	    		  System.out.println("Qual tipo de usuario sera cadastrado? \n Pressione 1 para Estudante \n Pressione 2 para Professor \n e 3 para Comunidade");
	    		  
	    		  try {
	    			  option = bufferRead.read();
	    			System.out.println("Insira o nome do usuário\n");
					n = bufferRead.readLine();
					System.out.println("Insira a idade do usuário\n");
					age = bufferRead.read();
					System.out.println("Insira o sexo do usuário\n");
					aux = bufferRead.read();
					c = (char)aux;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		  
	    		  if(option == 1){
	    			  System.out.println("Insira o código de identificação universitário do usuário\n");
	    			  try {
						s = bufferRead.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			  Aluno a = new Aluno(n, age, s, c); 
	    			  usuarios.add(a);
	    		  }
	    		  if (option == 2){
	    			  System.out.println("Insira a disciplina que o usuário está lecionando este semestre\n");
	    			  try {
						s = bufferRead.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			  Professor a = new Professor(n, age, s, c); 
	    			  usuarios.add(a);
	    		  }
	    		  if (option == 3){
	    			  System.out.println("Insira o endereço do usuário\n");
	    			  try {
						s = bufferRead.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			  Comunidade a = new Comunidade(n, age, s, c); 
	    			  usuarios.add(a);
	    			  
	    		  }
	    	  }
	    	  if (option == 2){ // Cadastra um livro
	    		  System.out.println("Insira o titulo do livro\n");
					try {
						n = bufferRead.readLine();
						System.out.println("Insira o autor do livro\n");
						s = bufferRead.readLine();
						System.out.println("Insira a editora do livro\n");
						g = bufferRead.readLine();
						System.out.println("Insira a data de lançamento do livro\n");
						age = bufferRead.read();
						System.out.println("Insira o tipo do livro: 1 para texto, 0 para geral\n");
						aux = bufferRead.read();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Livro l = new Livro (aux, age, n, s, g);
					livros.add(l);
	    	  }
	    	  if (option == 3){ // Registra um empréstimo
	    		  System.out.println("Insira o nome do locatário\n");
	    		  try {
					n = bufferRead.readLine();
					System.out.println("Insira o titulo do livro\n");
					s = bufferRead.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		  for(Locatario u : usuarios){
	    			 if((u.nome.equals(n)) && (u.VoxHomini < u.VoxDei)){
	    				 if (u.DeiGratia == 1){
	    					 begins e = new begins(n, s, hoje);
	    		    		  emprestimos.add(e);
	    		    		  u.VoxHomini++;
	    				 }
	    				 else{
	    					 for(Livro l : livros){
	    		    			  if (l.id.equals(s)){
	    		    				  if(l.ego == 0){
	    		    					  begins e = new begins(n, s, hoje);
	    		    		    		  emprestimos.add(e);
	    		    		    		  u.VoxHomini++;
	    		    				  }
	    		    			  }
	    		    		  }
	    				 }
	    			 }
	    		  }
	    		  
	    		  
	    	  }
	    	  if (option == 4){ // Registra uma devolução e vê se foi entregue no prazo ou se ocorreu um atraso
	    		  System.out.println("Insira o nome do usuário que está devolvendo o livro\n");
	    		  try {
					n = bufferRead.readLine();
					System.out.println("Insira o titulo do livro sendo devolvido\n");
					s = bufferRead.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		  aux = 0;
	    		  for(begins p : emprestimos){
	    			  if(p.locatario.equals(n)){
	    				  if(p.livro.equals(s)){
	    					  Date before = p.retirada;
	    					  long diff = hoje.getTime() - before.getTime();
	    					  dias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	    					  for(Locatario u : usuarios){
	    		    			  if(u.nome.equals(p.locatario)){
	    		    				  u.VoxHomini--;
	    		    				  if(dias > u.SineMora){
	    		    					  u.DiesIrae = u.SineMora - dias;
	    		    				  }
	    		    			  }
	    		    		  }
	    					  emprestimos.remove(aux);
	    				  }
	    			  }
	    			  aux++;
	    		  }
	    	  }
	    	  if (option == 5){ //Lista todos os livros, usuários e empréstimos pendentes
	    		  for(Locatario u : usuarios){
	    			  System.out.println("Usuário:" + u.nome + "Sexo:" + u.sexo + "Idade:" + u.idade + "\n");
	    		  }
	    		  for(Livro l : livros){
	    			  System.out.println("Livro:" + l.id + "Autor:" + l.persona + "Editora:" + l.press + "Lançamento:" + l.publish + "\n");
	    		  }
	    		  for(begins p : emprestimos){
	    			  System.out.println("Usuário:" + p.locatario + "Livro:" + p.livro + "Data:" + p.retirada + "\n");
	    		  }
	    	  }
	      }
	    }
	}

