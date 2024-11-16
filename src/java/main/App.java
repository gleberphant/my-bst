package main;

import java.util.Random;
import java.util.random.RandomGenerator;

import node.Node;
import node.NodeTree;

public class App {


    public static void main(String args[]){

        Random random = new Random();
        

        NodeTree tree = new NodeTree();

        for(int i = 0 ; i < 10; i++){
            System.out.printf("adicionando %d : ", i);
            tree.addNode( new Node(random.nextInt(i, (i+1)*2)) );

        }
        
        tree.printTree();
    
        
    }

}
