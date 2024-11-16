package node;

public class NodeTree {

    

    public Node current = null;
    public Node root = current;
    public int currentLevel = 0;

    public NodeTree(){
        current = root;
    }

    public void addNode(Node newNode){
        
        if(root == null){
            root = newNode;
            current = root;
            return;
        }

        if(current == null){
            current = newNode; 
            return;
        }

        // go to the lef
        if (newNode.id < current.id){
            if(current.leftNode == null){
                current.leftNode = newNode;
            }else{

            current = current.leftNode;
            addNode(newNode);
            }
        }
        // go to the right
        else{
            if(current.rightNode == null){
                current.rightNode = newNode;
            }else{

            current = current.rightNode;
            addNode(newNode);
            }
        }
        
     
        current = root;
        return;
    }

    public void printTree(){
      
        
        current = root;
        System.out.printf(" \n primeiro \n");
        printNode(root);

    }


    public void printNode(Node node){

        if(node == null){
            System.out.printf(" ultimo\n");
            return;
        }
        

        printNode(node.leftNode);
        System.out.printf("Node %d", node.id);    
        printNode(node.rightNode);
           
        

    }

    void swapRoot(){
        Node newRoot, newCurrent;
        if(current.id < root.id){

            newRoot = current;
            newCurrent = root;

            newRoot.leftNode = root.leftNode;
            newCurrent.leftNode = current.leftNode;

            newRoot.rightNode = root.rightNode;
            newCurrent.rightNode = current.rightNode;                          

        }
    }
}
