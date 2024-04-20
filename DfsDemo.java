public class DfsDemo {
    public static void main(String[] args) {
        Graph myGraph = new Graph(5); // graph is created with 5 nodes
        int a[][] = {{0,1,0,1,1}, {1,0,1,1,0},{0,1,0,1,1}, {1,1,1,0,0},{1,0,1,0,0}};
        myGraph.createAdjList(a);
        myGraph.dfs(0); // Strating node dfs is 0 
    }
}
