
public class Aluno {

	private String nome;
	private String matricula;
	private Endereco contato;
	
	public String getMatricula(){
		return matricula;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno){
			Aluno aluno = (Aluno) obj; //<-- isso é um cast!
			return this.matricula.equals(aluno.getMatricula()) && 
					contato.equals(aluno.contato);
			
		}else{
			return false;
		}

	}
	
}
