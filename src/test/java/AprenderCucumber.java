import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

public class AprenderCucumber {

	@Dado("^que 	criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("passou");
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {
		System.out.println("passou");
	}

	@Entao("^a especificacao deve finalizar com sucesso\\.$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
		System.out.println("passou");
	}
	
	@Entao("^esta faltando outro passo qualquer$")
	public void estaFaltandoOutroPassoQualquer() throws Throwable {
		System.out.println("passou o outro passo");
	}

}
