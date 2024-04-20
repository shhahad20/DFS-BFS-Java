public class Graph {
    int size;
    Node adjList[]; // adjList is an array of Node objects representing the adjacency list for each vertex in the graph.
    int mark[]; // mark is an array of integers used for marking vertices during traversal.
    public Graph(int n){
        size = n;
        adjList = new Node[size];
        mark = new int[size];
    }

public void createAdjList(int a[][]){ // 2D array a as a parameter.
    Node p;
    int i;
    int k;
    for( i = 0; i< size; i ++){
        p = adjList[i] = new Node(i); // create first node
        for(k=0; k< size; k++){
            if(a[i][k] == 1){
                p.next = new Node(k); // create next node
                p = p.next;
            }
        }
    }
}
public void dfs(int head){
    Node w;
    int v;
    mark[head] = 1;
    System.out.print(head + " ");
    w = adjList[head];
    while(w !=null){
        v = w.label;
        if(mark[v] == 0){
            dfs(v);
        }
        w = w.next;
    }
}
}
