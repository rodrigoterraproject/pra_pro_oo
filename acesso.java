public class acesso {
	private String emai;
	private String cpfcnpj;
  execution (void acesso.validaemail(String email));
  execution (void acesso.validaCPFCNPJ(String cpfcnpj));
	//...segue o codigo
  execution (void Pessoa.log(String email, String cpfcnpj));
}
