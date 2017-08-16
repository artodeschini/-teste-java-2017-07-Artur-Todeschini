package br.com.involves.ui;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import br.com.involves.bin.OperacoesImplDAO;

public class Testes {



	
	@Test
	public void testCountDistinctUf() {
		int numero = OperacoesImplDAO.getInstace("/Users/Artur/cidades.csv").countDistinct("uf");
		assertSame("O numero de ocorrencias", numero, 27);
	}
	
//	@Test
//	public void testAssertSame() {
//		int numero = OperacoesImplDAO.getInstace("/Users/Artur/cidades.csv").count();
//		//System.out.println( numero );
//		assertSame("O numero de ocorrencias", numero, 5565);
//	}
	
	@Test
	public void testeFilter() {
		OperacoesImplDAO.getInstace("/Users/Artur/cidades.csv").filter("name", "Florianópolis");
		
	}

}
