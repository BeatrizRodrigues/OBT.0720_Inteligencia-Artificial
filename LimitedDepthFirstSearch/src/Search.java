public abstract class Search {
    Node startNode;
    Node goalNode;

    public Search(Node startNode, Node goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
    }

    public abstract boolean execute();
}
