import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        // PRIMEIRO GRAFO
        Node a = new Node("A", new ArrayList<Node>());
        Node b = new Node("B", new ArrayList<Node>());
        Node c = new Node("C", new ArrayList<Node>());
        Node d = new Node("D", new ArrayList<Node>());

        a.children.addAll(Arrays.asList(b));
        b.children.addAll(Arrays.asList(c));
        c.children.addAll(Arrays.asList(d));
        d.children.addAll(Arrays.asList(a));

        Graph firstGraph = new Graph("Círculo", Arrays.asList(a, b, c, d));


        // SEGUNDO GRAFO
        Node e = new Node("E", new ArrayList<Node>());
        Node f = new Node("F", new ArrayList<Node>());
        Node g = new Node("G", new ArrayList<Node>());
        Node h = new Node("H", new ArrayList<Node>());
        Node i = new Node("I", new ArrayList<Node>());
        Node j = new Node("J", new ArrayList<Node>());

        e.children.addAll(Arrays.asList(f, g));
        f.children.addAll(Arrays.asList(h, i));
        g.children.addAll(Arrays.asList(j));
        // h.children.addAll(Arrays.asList(h));
        

        Graph secondGraph = new Graph("Árvore", Arrays.asList(e,f,g,h,i,j));

        firstGraph.hasCicle();
        secondGraph.hasCicle();
    }
}
