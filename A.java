package a;

import java.util.ArrayList;

class A {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		//Adiciona nomes em cada posi��o do ArrayList
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("Java");
		
		//Verifica se nome est� contido no ArrayList
		System.out.println(nomes.contains("Java"));
		System.out.println(nomes.contains("C#"));
		
		//Remove nome no ArrayList
		boolean removido = nomes.remove("Java");
		System.out.println(removido);
		
		//Verifica quantos elementos est�o dentro do ArrayList
		System.out.println((nomes.size()));
		
		//Converte para um array de objetos
		Object[] objetos = nomes.toArray();
		
		//Converter ArrayList para Array
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);
		String[] nomesArray2 = nomes.toArray(new String[0]);
		
		//Cria��o de nova cole��o de uma Lista de Array
		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Jap�o");
		
		//Acrescentando cole��es dentro de outro ArrayList
		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes);
		tudo.addAll(paises);
		
		//Verificando elementos agora dentro do ArrayList tudo
		System.out.println(tudo.size());
		
		//Verificar qual elemento est� contido na primeira posi��o 0
		System.out.println(nomes.get(0));
		
		//Acrescentando o elemento "php" na posi��o 0
		nomes.add(0, "php");
		
		//Ao acrescentar um novo elemento em uma posi��o que j� havia elemento, 
		//passar� adiante o elemento que era daquela posi��o
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		//Ap�s remover elemento da posi��o os outros elementos recompactam para que fiquem
		//novamente em sequ�ncia
		nomes.remove(0);
		System.out.println(nomes.get(0));
		
		//Neste caso o set troca o elemento pelo outro
		nomes.set(0, "Scala");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		
		//Verifica em qual posi��o do ArrayList o elemento est�, o primeiro que for verificado
		System.out.println(nomes.indexOf("Java"));
		//Verifica a lista do come�o ao fim, a ultima posi��o em que se encontra o elemento
		System.out.println(nomes.lastIndexOf("Java"));
		//Caso nao encontre nenhum elemento retornar� -1
		
        }
	} 
