import java.util.ArrayList;

public class prims {
    //initialized lists and variables to be used
    ArrayList<Vertex> MST = new ArrayList<>();
    ArrayList<Edge> NeededEdges = new ArrayList<>();
    Vertex Initial;
    Integer TotalWeight=0;
    AdjListGraph grid;

    public prims(AdjListGraph g){;
        this.grid = g;
        minHeap<Vertex> minheap = new minHeap<>();
        g.printGraph();
        for (Vertex v: this.grid.getVertices()){
            minheap.insert(v);
        }
        this.Initial = minheap.getMinHeap().get(0);
        this.Initial.setDistance(0);
        goPrim(minheap);

    }

    public void goPrim(minHeap minheap){
        while(!(minheap.isEmpty())){
            Vertex extractedVertex = (Vertex) minheap.extractMin();
            this.MST.add(extractedVertex);
            for (Edge e: extractedVertex.getOutEdges()) {
                if (e.getWeight() < e.getTo().distance){
                    e.getTo().setDistance(e.getWeight());
                    int pos = minheap.getPosition(extractedVertex);
                    minheap.decreasekey(pos);
                }
            }
        }
        for (Vertex v : MST) {
            TotalWeight += v.distance;
            for (Edge e : v.getOutEdges()){
                if(e.getWeight() == v.distance){
                    NeededEdges.add(e);
                }
            }
        }
        for(Edge e: NeededEdges){
            System.out.println("From "+e.getFrom().getName() + " to " + e.getTo().getName() + " is a distance of: " + e.getWeight() + " km" + "\nThis will cost: " + e.getWeight() * 1000000 +"kr\n");
        }
        System.out.println("Totatl distance = " + TotalWeight + "\nThis will cost " + TotalWeight * 1000000 + "kr");
    }


}
