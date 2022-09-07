import java.util.List;

public class Graph {
    String name;
    List<Node> nodes;

    public Graph(String name, List<Node> nodes) {
        this.name = name;
        this.nodes = nodes;
    }

    public Boolean hasCicle() {
        for (Node node : nodes) {
            if (node.hasCicle()) {
                System.out.println("O grafo "+ name +" é cíclico porque o nó " + node.name
                        + " consegue chegar em si mesmo a partir de seus filhos");
                return true;
            }
        }
        System.out.println("O grafo " + name + " não possui nenhum ciclo");
        return false;

    }

}