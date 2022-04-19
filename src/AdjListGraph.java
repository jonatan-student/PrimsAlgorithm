import java.util.ArrayList;

public class AdjListGraph {
    private ArrayList<Vertex> vertices;

    public AdjListGraph(){
        this.vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v){
        this.vertices.add(v);
    }

    public void newEdge(Vertex f, Vertex t, int w){
        if(! (this.vertices.contains(f) && this.vertices.contains(t))){
            System.out.println("Vertex does not exist");
        } else {
            Edge newEdge = new Edge(f, t, w);
        }
    }

    public void printGraph(){
        for (Vertex v: this.vertices) {
            System.out.println("the edges from vertex " + v.getName());
            for(Edge e: v.getOutEdges()){
                System.out.println(" to " + e.getTo().getName() + " weight " + e.getWeight() + "\n");
            }
        }
    }
}

class Vertex implements Comparable<Vertex>{
    private String name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String ID){
        this.name = ID;
        this.outEdges= new ArrayList<>();
    }

    @Override
    public int compareTo(Vertex o) {
        if(this.distance>o.distance){
            return 1;
        }
        if(this.distance<o.distance){
            return -1;
        }

        return 0;
    }

    public void addEdge(Edge newEdge){
        this.outEdges.add(newEdge);
    }
}

class Edge{
    private Vertex from;
    private Vertex to;
    private int weight;

    public Vertex getFrom() {
        return from;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Edge(Vertex f, Vertex t, int w){
        this.from = f;
        this.to = t;
        this.weight = w;
        f.addEdge(this);
    }
}