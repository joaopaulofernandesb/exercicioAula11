package br.com.db1.db1start.aula11.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


import br.com.db1.db1start.aula11.Aula11; 

public class Aula11Test {
	

	//1
	@Test 
	public void retornaNomeDasCores() {
		
		Aula11 retorna = new Aula11();
		List<String> cores = retorna.cores();
		
		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Vermelho", cores.get(1));
		Assert.assertEquals("Branco", cores.get(2));
	}
	
	//2 
	
	@Test
	public void lista() {
		Aula11 retorna = new Aula11();
		int resultado = retorna.lista();
		Assert.assertEquals(3,resultado,0);
		
		
	}
	
	
	
	//3
	@Test
	public void remove() {
		Aula11 retorna = new Aula11();
		List<String> resultado = retorna.recebeTresStrings();
		Assert.assertEquals("1", resultado.get(0));
		Assert.assertEquals("3",resultado.get(1));
		
	}
	
	
	//4
	
	@Test
	public void ordenaCores() {
		
		Aula11 ordena = new Aula11();
		List<String> resultado = ordena.ordenaCores();
		Assert.assertEquals("Azul", resultado.get(0));
		Assert.assertEquals("Branco", resultado.get(1));
		Assert.assertEquals("Vermelho", resultado.get(2));
		
		
	}
	
	//5
	@Test
	public void removeList() {
		Aula11 retorna = new Aula11();
		String resultado = retorna.listaAtributo();
		Assert.assertEquals("Branco", resultado);
		
		
		
	}
	//6
	
	@Test
	public void ordemDecrecenteCores() {
		Aula11 retorna = new Aula11();
		List<String> resultado = retorna.ordenaDecrescente();
		Assert.assertEquals("Vermelho", resultado.get(0));
		Assert.assertEquals("Branco", resultado.get(1));
		Assert.assertEquals("Azul", resultado.get(2));
	}
	
	
	//7
	
	@Test
	public void deveRetornarParOuImpar() {
		Aula11 lista = new Aula11();
		
		List<Integer> numero = new ArrayList<>();
		numero.add(2);
		numero.add(4);
		numero.add(3);
		
		List<List<Integer>> retorno = lista.parOuImpar(numero);
		
		Assert.assertEquals(2, retorno.size());
		
		List<Integer> par = retorno.get(0);
		List<Integer> impar = retorno.get(1);
		
		Assert.assertEquals(2, par.size());
		Assert.assertEquals(1, impar.size());
		
		Assert.assertEquals(2, par.get(0), 0);
		Assert.assertEquals(4, par.get(1), 0);
		
		Assert.assertEquals(3, impar.get(0), 0);
		
	}
	
	
	
	@Test
	public void deveRetornarParOuImparMap() {
		Aula11 aula11 = new Aula11();
		List<Integer> numero = new ArrayList<>();
		
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		
		
		Map<String, List<Integer>> retorno = aula11.retornaParOuImpar(numero); 
		
		Assert.assertEquals(2, retorno.size());
		Assert.assertEquals(1, retorno.get("IMPAR").get(0),0);
		Assert.assertEquals(2, retorno.get("PAR").get(0),0);
		Assert.assertEquals(3, retorno.get("IMPAR").get(1),0);
		Assert.assertEquals(4, retorno.get("PAR").get(1),0);
	}
	
	
	
	
	
	//8
	@Test
	public void ordenaNomes() {
		Aula11 retorna = new Aula11();
		List<String> resultado = retorna.listaNomes();
		Assert.assertEquals("ANA",resultado.get(0));
		Assert.assertEquals("ANA LAURA",resultado.get(1));
		Assert.assertEquals("CLECIO",resultado.get(2));
		Assert.assertEquals("JOALDO",resultado.get(3));
		Assert.assertEquals("JOSE",resultado.get(4));
		Assert.assertEquals("JOSÉ",resultado.get(5));
		Assert.assertEquals("JOSÉ",resultado.get(6));
		Assert.assertEquals("MARCOS",resultado.get(7));
		Assert.assertEquals("MARIA",resultado.get(8));
		Assert.assertEquals("ROBERVAL",resultado.get(9));
		Assert.assertEquals("RODOLFO",resultado.get(10));
		Assert.assertEquals("RODOLPHO",resultado.get(11));
		Assert.assertEquals("VAGNER",resultado.get(12));
		Assert.assertEquals("WAGNER",resultado.get(13));
	}
	
	//8 
	
	@Test
	public void deveRetornarListaSeparadaMap() {
		Aula11 aula11 = new Aula11();
		List<String> nome = new ArrayList<>();
		
	   nome.add("ANA");
 	   nome.add("ANA LAURA");
 	   nome.add("JOSE");
 	   nome.add("WAGNER");
 	   nome.add("RODOLFO");
 	   nome.add("ROBERVAL");
 	   nome.add("RODOLPHO");
 	   nome.add("VAGNER");
 	   nome.add("JOSÉ");
 	   nome.add("JOALDO");
 	   nome.add("CLECIO");
 	   nome.add("JOSÉ");
 	   nome.add("MARIA");
 	   nome.add("MARCOS");

		
		Map<String, List<String>> retorno = aula11.dividirPalavrasMap(nome); 
		
		Assert.assertEquals(7, retorno.size());
		Assert.assertEquals("ANA", retorno.get("A").get(0));
		Assert.assertEquals("ANA LAURA", retorno.get("A").get(1));
		Assert.assertEquals("CLECIO", retorno.get("C").get(0));
		Assert.assertEquals("JOALDO", retorno.get("J").get(0));
		Assert.assertEquals("JOSE", retorno.get("J").get(1));
		Assert.assertEquals("JOSÉ", retorno.get("J").get(2));
		Assert.assertEquals("JOSÉ", retorno.get("J").get(3));
		Assert.assertEquals("MARCOS", retorno.get("M").get(0));
		Assert.assertEquals("MARIA", retorno.get("M").get(1));
		Assert.assertEquals("ROBERVAL", retorno.get("R").get(0));
		Assert.assertEquals("RODOLFO", retorno.get("R").get(1));
		Assert.assertEquals("RODOLPHO", retorno.get("R").get(2));
		Assert.assertEquals("VAGNER", retorno.get("V").get(0));
		Assert.assertEquals("WAGNER", retorno.get("W").get(0));
		
		
		
	}
	
	
	
	//9
	@Test
	public void retornaSoma() {
		Aula11 valor = new Aula11();
		int reusltado = valor.somaDoisNumero();
		Assert.assertEquals(3,reusltado,0);
		
	}
	
	//10
	@Test
	
	public void retornaMedia() {
		
		Aula11 media = new Aula11();
		double resultado = media.media();
		Assert.assertEquals(10.0,resultado,0);
		
		
		
		
	}
	//11
	@Test
	public void retornaMenorMaior() {
		Aula11 menor = new Aula11();
		int resultado = menor.menorMaior();
		Assert.assertEquals(1,resultado,2);
	}
	//12
	@Test
	public void retornaMaiorMenor() {
		Aula11 menor = new Aula11();
		int resultado = menor.maiorMenor();
		Assert.assertEquals(2,resultado,1);
	}
	
	//13
	@Test
	public void removeImparesdaLista() {
		Aula11 remove = new Aula11();
		List<Integer> resultado = remove.removeImpares();
		Assert.assertEquals(0,resultado.get(0),0);
		Assert.assertEquals(2,resultado.get(1),0);
		Assert.assertEquals(4,resultado.get(2),0);
		
		
		
		
		
	}
	
	@Test
	public void retornaTodasAsVogais() {
		Aula11 imprime = new Aula11();
		String resultado = imprime.vogais("JOAO");
		Assert.assertEquals("OAO",resultado);
	}
	
	
}
