package a;

import java.util.ArrayList;

class A {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		//Adiciona nomes em cada posição do ArrayList
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("Java");
		
		//Verifica se nome está contido no ArrayList
		System.out.println(nomes.contains("Java"));
		System.out.println(nomes.contains("C#"));
		
		//Remove nome no ArrayList
		boolean removido = nomes.remove("Java");
		System.out.println(removido);
		
		//Verifica quantos elementos estão dentro do ArrayList
		System.out.println((nomes.size()));
		
		//Converte para um array de objetos
		Object[] objetos = nomes.toArray();
		
		//Converter ArrayList para Array
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);
		String[] nomesArray2 = nomes.toArray(new String[0]);
		
		//Criação de nova coleção de uma Lista de Array
		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Japão");
		
		//Acrescentando coleções dentro de outro ArrayList
		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes);
		tudo.addAll(paises);
		
		//Verificando elementos agora dentro do ArrayList tudo
		System.out.println(tudo.size());
		
		//Verificar qual elemento está contido na primeira posição 0
		System.out.println(nomes.get(0));
		
		//Acrescentando o elemento "php" na posição 0
		nomes.add(0, "php");
		
		//Ao acrescentar um novo elemento em uma posição que já havia elemento, 
		//passará adiante o elemento que era daquela posição
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		//Após remover elemento da posição os outros elementos recompactam para que fiquem
		//novamente em sequência
		nomes.remove(0);
		System.out.println(nomes.get(0));
		
		//Neste caso o set troca o elemento pelo outro
		nomes.set(0, "Scala");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		//Verifica em qual posição do ArrayList o elemento está, o primeiro que for verificado
		System.out.println(nomes.indexOf("Java"));
		//Verifica a lista do começo ao fim, a ultima posição em que se encontra o elemento
		System.out.println(nomes.lastIndexOf("Java"));
		//Caso nao encontre nenhum elemento retornará -1
		
        }
	} 
