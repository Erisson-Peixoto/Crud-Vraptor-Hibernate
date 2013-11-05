package br.com.caelum.goodbuy.infra;

import static org.junit.Assert.*;

import org.junit.Test;

public class CriadorDeSessionTeste {

	@Test
	public void testaConexao(){ 
		CriadorDeSessionFactory factory = new CriadorDeSessionFactory();
		assertNotNull(factory);
	}
	
	
}
