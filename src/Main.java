public class Main {
    public static void main(String[] args) {
        //initialize the Grid, with all the Vertices and Edges needed
        EnergyGrid DANNNMARK = new EnergyGrid();
        //Run our prims algorithm 
        prims prims = new prims(DANNNMARK.graph);
        //DANNNMARK.print();
    }
}
