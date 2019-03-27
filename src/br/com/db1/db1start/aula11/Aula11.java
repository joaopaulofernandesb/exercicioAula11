package br.com.db1.db1start.aula11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Aula11 {

	
//1
	public List<String> cores(){
		List<String> cores = new ArrayList<>();
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Branco");
		
		return cores;
		
	}
	
	
	//2 
	public int lista(){
		List<String> lista = new ArrayList<>();
		lista.add("Gato");
		lista.add("Cachorro");
		lista.add("Cavalo");
		
		int tamanho;
		
		tamanho = lista.size();
	    
	    return tamanho;
	}

	
	//3
	public List<String> recebeTresStrings(){
		List<String> recebeTresStrings = new ArrayList<>();
		recebeTresStrings.add("1");
		recebeTresStrings.add("2");
		recebeTresStrings.add("3");
		
		recebeTresStrings.remove(1);
		
		return recebeTresStrings;
	}
	
	//4
	
	public List<String> ordenaCores(){
		List<String> ordenaCores = new ArrayList<>();
		ordenaCores.add("Azul");
		ordenaCores.add("Vermelho");
		ordenaCores.add("Branco");
		Collections.sort(ordenaCores);	
		return ordenaCores;
		
	} 
	
	//5
	public String listaAtributo(){
		
		List<String> listaAtributo = new ArrayList<>();
		
	
		listaAtributo.add("Azul");
		listaAtributo.add("Vermelho");
		listaAtributo.add("Branco");
		
		String removido; 
		
		removido = listaAtributo.remove(2);
	
		
		return removido;
		
	
		
		
	}
	
	//6
	
       public List<String> ordenaDecrescente(){
		
		List<String> ordenaDecrescente = new ArrayList<>();
		
	
		ordenaDecrescente.add("Azul");
		ordenaDecrescente.add("Vermelho");
		ordenaDecrescente.add("Branco");
		
		
		Collections.sort(ordenaDecrescente, Collections.reverseOrder());
		return ordenaDecrescente;
		
		
	}
       
       

       

       //7  
       public List<List<Integer>> parOuImpar(List<Integer> numero) {
      		List<Integer> par = new ArrayList<>();
      		List<Integer> impar = new ArrayList<>();
      		
      		for (Integer value : numero) {
      			if(value%2 == 0) {
      				par.add(value);
      			} else {
      				impar.add(value);
      			}
      		}
      		
      		List<List<Integer>> resultado = new ArrayList<>();
      		resultado.add(par);
      		resultado.add(impar);
      		return resultado;
      	}
       
       
       public Map<String, List<Integer>> retornaParOuImpar(List<Integer> idades) {
   		Map<String, List<Integer>> retorno = new HashMap<>();
   		for (Integer value : idades) {
   			if(value%2 == 0) {
   				if (!retorno.containsKey("PAR")) {
   					retorno.put("PAR", new ArrayList<>());
   				}
   				retorno.get("PAR").add(value);
   				
   			} else {
   				if (!retorno.containsKey("IMPAR")) {
   					retorno.put("IMPAR", new ArrayList<>());
   				}
   				
   				retorno.get("IMPAR").add(value);
   			}
   		}
   		return retorno;
   	}
       
       
       
          	   
       
       
       //8 
       public List<String> listaNomes(){
    	   
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
    	   
    	   //Collections.sort(nome, Collator.getInstance());
    	   Collections.sort(nome);
    	   return nome;
       }
       
       //
       
       public Map<String, List<String>> dividirPalavrasMap(List<String> palavras) {
   		Map<String, List<String>> retorno = new HashMap<>();
   		Collections.sort(palavras);
   		
   		for(String value : palavras) {
   			String letra = value.substring(0, 1);
   			
   			if(!retorno.containsKey(letra)) {
   				retorno.put(letra, new ArrayList<>());
   			}
   			
   			retorno.get(letra).add(value);
   		}
   		
   		
   		return retorno;
   	}
       
       
   
       
     
	//9
       
       public int somaDoisNumero(){
    	   
    	   List<Integer> valor = new ArrayList<>();
    	   
    	     valor.add(1);
    	     valor.add(2);
    	     
    	     int sum = 0;
    	     for (int a: valor)
    	    	 sum = sum + a;
    	     
    	    
    	   return sum;
       }
       
       //10
       public double media() {
    	   
    	   List<Double> valor = new ArrayList<>();
    	   
    	   valor.add(10.0);
    	   valor.add(10.0);
    	   valor.add(10.0);
    	   
    	    double sum = 0.0;
    	    double resultado = 0.0;
    	     
    	    for(double media: valor)
    	    	sum = sum + media;
    	    	
    	    resultado = sum / 3;
    	    
    	    return resultado;
    	    
    	    
    	   
       }
       
       //11
       public int menorMaior() {
    	   
    	   List<Integer> mairMenor = new ArrayList<>();
    	   
    	   int numero1 = 1;
    	   int numero2 = 2;
    	   
    	   mairMenor.add(numero1);
    	   mairMenor.add(numero2);
    	   
    	   if (numero1 < numero2) {
    		   
    		   return numero1;
    	   }
    	   
    	   return numero2;
    	   
       }
       
       //12
       public int maiorMenor() {
    	   
    	   List<Integer> mairMenor = new ArrayList<>();
    	   
    	   int numero1 = 1;
    	   int numero2 = 2;
    	   
    	   mairMenor.add(numero1);
    	   mairMenor.add(numero2);
    	   
    	   if (numero2 < numero1) {
    		   
    		   return numero2;
    	   }
    	   
    	   return numero1;
    	   
       }
       
       //13
       public List<Integer> removeImpares(){
    	   
    	   List<Integer> listaImpares = new ArrayList<>();

           for (int i = 0; i < 6; i++) {
        	   listaImpares.add(i);
           }

           for (int i = 0; i < listaImpares.size(); i++) {
               if (listaImpares.get(i) % 2 != 0) {
           
                   listaImpares.remove(i);
                   
               }
               
               
               
           }
           
		return listaImpares;
           
		
       }
       
       
       //14
        public String vogais(String texto){
        	
        	String ls_vogal = "";
       
        	for (int i=0; i<texto.length(); i++) {   
        	     char
        	     ls_letra = texto.toUpperCase().charAt(i);
        	     if (ls_letra == 65 || ls_letra == 69 || ls_letra == 73 || ls_letra == 79 || ls_letra == 85)
        	     {
        	          
        	         
        	          ls_vogal += ls_letra;
        	          
        	          
        	     }
        	    
        	}
			return ls_vogal;
			
			
        	
        }


	
	
}
