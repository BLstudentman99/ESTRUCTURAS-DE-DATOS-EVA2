package eva2_7_grafo;
import java.util.*;

public class Grafo {
    // Mapea un Vertice (origen) a una lista de sus Vertices vecinos (destino)
    private Map<Vertice, List<Vertice>> adj = new HashMap<>();

    public void agregarVertice(Vertice v) {
        // Añade el vértice si no existe, con una lista de adyacencia vacía
        adj.putIfAbsent(v, new ArrayList<>());
    }

    public void agregarArista(Vertice v1, Vertice v2) {
        // Asegura que ambos vértices existan en el mapa
        if (adj.containsKey(v1) && adj.containsKey(v2)) {
            // Conexión bidireccional (grafo no dirigido)
            adj.get(v1).add(v2);
            adj.get(v2).add(v1); 
        }
    }
    
    // PanelGrafo con acceso a los datos
    public Map<Vertice, List<Vertice>> getAdjacencyList() {
        return adj;
    }
}
    
