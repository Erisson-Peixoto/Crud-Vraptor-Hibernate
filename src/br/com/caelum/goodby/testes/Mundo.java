package br.com.caelum.goodby.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {

	public String  boasVindas(){
		return "Ola mundo!!!";
	}
	
	public List<String> paises(){
		List<String> lista = new ArrayList<String>();
		lista.add("Brasil");
		lista.add("Itália");
		lista.add("Espanha");
		lista.add("Uruguai");
		return lista;
	}

}
