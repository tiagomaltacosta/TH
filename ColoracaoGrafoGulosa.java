package AtividadeGlender;
import java.util.*;

class Grafo{
	private int numvertices;
	private LinkedList<Integer>[] adjacentes;
	
	public Grafo(int numvertices)
	{
		this.numvertices = numvertices;
		adjacentes = new LinkedList[numvertices];
		
		for(int i = 0; i < numvertices; i++) {
			adjacentes[i] = new LinkedList<>();
		}
	}

public void AdicionarAresta(int v, int w)
{
	   adjacentes[v].add(w);
	   adjacentes[w].add(v);
	   
}

public void ColoracaoGrafo() {
	
	String[] cores = new String[numvertices];
	Arrays.fill(cores, "");
	
	 List<String> coresDisponiveis = Arrays.asList("Azul", "Verde", "Vermelho","Amarelo");

	
     for (int vertice = 0; vertice < numvertices; vertice++) {
         HashSet<String> coresVizinhas = new HashSet<>();
         for (int vizinho : adjacentes[vertice]) {
             if (!cores[vizinho].equals("")) {
                 coresVizinhas.add(cores[vizinho]);
             }
         }

         String corDisponivel = "";
         for (String cor : coresDisponiveis) {
             if (!coresVizinhas.contains(cor)) {
                 corDisponivel = cor;
                 break;
             }
         }

         cores[vertice] = corDisponivel;
     }
	
	//Imprimir as cores dos Vertices
	
	for(int i = 0; i < numvertices; i++)
	{
		System.out.println("Vértice " + i + " tem cor " + cores[i]);
	}
}	
 
}

//A classe guloso trata apenas de executar a adição de Arestas
public class Guloso {

	public static void main(String[] args) {
		
		Grafo grafo = new Grafo(3); 
		
		grafo.AdicionarAresta(0, 1);
		grafo.AdicionarAresta(0, 2);
		grafo.AdicionarAresta(1, 2);
		
		
		grafo.ColoracaoGrafo();
	}

}

