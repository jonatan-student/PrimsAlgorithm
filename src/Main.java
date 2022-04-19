public class Main {
    public static void main(String[] args) {
        AdjListGraph graph = new AdjListGraph();
        Vertex Eskildstrup = new Vertex("Eskildstrup");
        Vertex Haslev = new Vertex("Haslev");
        Vertex Holbaek = new Vertex("Holbaek");
        Vertex Jaegerspris = new Vertex("Jaegerspris");
        Vertex Kalundborg = new Vertex("Kalundborg");
        Vertex Korsor = new Vertex("Korsor");
        Vertex Koge = new Vertex("Koge");
        Vertex Maribo = new Vertex("Maribo");
        Vertex Naestved = new Vertex("naestved");
        Vertex Ringsted = new Vertex("Ringsted");
        Vertex Slagelse = new Vertex("Slagelse");
        Vertex NykobingF = new Vertex("Nykobing F");
        graph.newEdge(Eskildstrup, Maribo, 28);
        graph.newEdge(Eskildstrup, NykobingF, 13);

    }
}
