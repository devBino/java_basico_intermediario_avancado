package br.com.bino.testes;

import br.com.bino.abstracts.TesteAbstract;
import br.com.bino.annotations.TesteMap;
import br.com.bino.constants.TestesConstants;

@TesteMap(nomeTeste = TestesConstants.ANOTACAO)
public class Anotacao extends TesteAbstract {

	public Anotacao() {
		super.setNomeTeste(TestesConstants.ANOTACAO);
	}
	
	@Override
	public void teste() {
	
		System.out.println("Por enquanto, verificar anotação no inicio da classe...");
		
	}
	
}
