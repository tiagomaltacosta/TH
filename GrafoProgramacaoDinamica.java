package AtividadeGlender;
import java.util.*;

class GrafoDinamico{
	private int numvertices;
	private LinkedList<Integer>[] adjacentes; //array para pegar os adjacentes
	
	public GrafoDinamico(int numvertices)
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

public int ColoracaoGrafo() {

	int[] cores = new int [numvertices];
	Arrays.fill(cores, -1);
	
	int numcores = 0;
	
	for(int vertice = 0; vertice < numvertices; vertice++)
	{
		HashSet<Integer> coresVizinhas = new HashSet<>();
		
		for(int vizinho: adjacentes[vertice])
		{
			if(cores[vizinho] != -1)
			{
				coresVizinhas.add(cores[vizinho]);
			}
		}
		
		int cordisponivel = 0;
		
		while (coresVizinhas.contains(cordisponivel))
		{
			cordisponivel++;
		}
		
		if(cordisponivel == numcores)
		{
			numcores++;
		}
        cores[vertice] = cordisponivel;

	}
    return numcores;

	
}	
 
}
public class ColoracaoDinamica {

	public static void main(String[] args) {

	GrafoDinamico grafo = new GrafoDinamico(3); 
		
		grafo.AdicionarAresta(0, 1);
		grafo.AdicionarAresta(0, 2);
		grafo.AdicionarAresta(1, 2);
		
		
		int numcores = grafo.ColoracaoGrafo();
		System.out.println("Número mínimo de cores necessárias: " + numcores);
	}
	}


