import java.util.ArrayList;
import java.util.List;

public class Node {
    public String name;
    public List<Node> children;

    public Node(String name, List<Node> children) {
        this.name = name;
        this.children = children;
    }

    public boolean depthFirstSearch(String nodeName) {
        List<Node> searched = new ArrayList<Node>();
        return this.depthFirstSearch(nodeName, searched);
    }

    public Boolean depthFirstSearch(String nodeName, List<Node> searched) {
        searched.add(this);
        for (Node child : children) {
            // System.out.println("Buscando em " + child.name);
            if (child.name == nodeName)
                return true;

            if (!searched.contains(child) && child.depthFirstSearch(nodeName, searched)) {
                return true;
            }
        }
        // System.out.println("Busquei todos os nós filhos de " + name);
        return false;
    }

    public boolean hasCicle() {
        return depthFirstSearch(this.name);
    }

}