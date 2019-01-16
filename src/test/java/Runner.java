import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Notacao para exibicao da saida do console de forma estruturada e modelo cucumber
		plugin = "pretty",
		// Notacao para tirar as informacoes coloridas em destaques na saida do console
		monochrome = true ,
		//Notacao da descricao dos cenarios utilizando Camelcase separado por letra maiuscula ou underline que e o Underscore
		snippets = SnippetType.CAMELCASE ,
		//Notacao para validar a estrutura dos casos de testes com base nos verbos utilizados para arquitetura do desenvolvimento e utilizando na hora de organizar os casos de testes e retirado apos a implementacao das logicas dos scripts
		dryRun = false ,
		//Notacao para sinalizar com erro quando estiver true qualquer alteracao ou inclusao na feature 
		strict = false
		)
public class Runner {

}
