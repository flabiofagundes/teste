
public class Endereco {

	private String rua;
	private String tel;
	
	//gets. construtor;
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Endereco){
			Endereco outroEndereco = (Endereco)obj;

			return this.getTel().equals(outroEndereco.getTel());
		}else{
			return false;
		}

	}
}
