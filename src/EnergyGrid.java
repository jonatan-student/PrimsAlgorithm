public class EnergyGrid {
    AdjListGraph graph = new AdjListGraph();
    public EnergyGrid(){
        fillGrid(graph);
    }

    public void fillGrid(AdjListGraph graph){
        Vertex Eskildstrup = new Vertex("Eskildstrup"); Vertex Haslev = new Vertex("Haslev");           Vertex Holbaek = new Vertex("Holbaek");
        Vertex Jaegerspris = new Vertex("Jaegerspris"); Vertex Kalundborg = new Vertex("Kalundborg");   Vertex Korsor = new Vertex("Korsor");
        Vertex Koge = new Vertex("Koge");               Vertex Maribo = new Vertex("Maribo");           Vertex Naestved = new Vertex("Naestved");
        Vertex Ringsted = new Vertex("Ringsted");       Vertex Slagelse = new Vertex("Slagelse");       Vertex NykobingF = new Vertex("Nykobing F");
        Vertex Vordingborg = new Vertex("Vordingborg"); Vertex Roskilde = new Vertex("Roskilde");       Vertex Soro = new Vertex("Soro");
        Vertex Nakskov = new Vertex("Nakskov");

        graph.addVertex(Eskildstrup); graph.addVertex(Haslev);    graph.addVertex(Holbaek);     graph.addVertex(Jaegerspris);
        graph.addVertex(Korsor);      graph.addVertex(Koge);      graph.addVertex(Maribo);      graph.addVertex(Naestved);
        graph.addVertex(Slagelse);    graph.addVertex(NykobingF); graph.addVertex(Vordingborg); graph.addVertex(Roskilde);
        graph.addVertex(Soro);        graph.addVertex(Nakskov);   graph.addVertex(Kalundborg);  graph.addVertex(Ringsted);

        graph.newEdge(Eskildstrup, Maribo, 28);   graph.newEdge(Eskildstrup, NykobingF, 13); graph.newEdge(Eskildstrup, Vordingborg, 24);
        graph.newEdge(Haslev, Korsor, 60);        graph.newEdge(Haslev, Koge, 24);           graph.newEdge(Haslev, Naestved, 25);
        graph.newEdge(Haslev, Ringsted, 19);      graph.newEdge(Haslev, Roskilde, 47);       graph.newEdge(Haslev, Slagelse, 48);
        graph.newEdge(Haslev, Soro, 34);          graph.newEdge(Haslev, Vordingborg, 40);    graph.newEdge(Holbaek, Jaegerspris, 34);
        graph.newEdge(Holbaek, Kalundborg, 44);   graph.newEdge(Holbaek, Korsor, 66);        graph.newEdge(Holbaek, Ringsted, 36);
        graph.newEdge(Holbaek, Roskilde, 32);     graph.newEdge(Holbaek, Slagelse, 46);      graph.newEdge(Holbaek, Soro, 34);
        graph.newEdge(Jaegerspris, Korsor,95);    graph.newEdge(Jaegerspris, Koge, 58);      graph.newEdge(Jaegerspris, Ringsted, 56);
        graph.newEdge(Jaegerspris, Roskilde, 33); graph.newEdge(Jaegerspris, Slagelse, 74);  graph.newEdge(Jaegerspris, Soro, 63);
        graph.newEdge(Kalundborg, Ringsted, 62);  graph.newEdge(Kalundborg, Roskilde, 70);   graph.newEdge(Kalundborg, Slagelse, 39);
        graph.newEdge(Kalundborg, Soro, 51);      graph.newEdge(Korsor, Naestved, 45);       graph.newEdge(Korsor, Slagelse, 20);
        graph.newEdge(Koge, Naestved, 45);        graph.newEdge(Koge, Ringsted, 28);         graph.newEdge(Koge, Roskilde, 25);
        graph.newEdge(Koge, Vordingborg, 60);     graph.newEdge(Maribo, Nakskov, 27);        graph.newEdge(Maribo, NykobingF, 26);
        graph.newEdge(Naestved, Roskilde, 57);    graph.newEdge(Naestved, Ringsted, 26);     graph.newEdge(Naestved, Slagelse, 37);
        graph.newEdge(Naestved, Soro, 32);        graph.newEdge(Naestved, Vordingborg, 28);  graph.newEdge(Ringsted, Roskilde, 31);
        graph.newEdge(Ringsted, Soro, 15);        graph.newEdge(Ringsted, Vordingborg, 58);  graph.newEdge(Slagelse, Soro, 14);
    };

    public void print(){
        graph.printGraph();
    }
}
