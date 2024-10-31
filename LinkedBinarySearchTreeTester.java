public class LinkedBinarySearchTreeTester{
  public static void main(String[] args){

    /* adding elements 5, 7, 3, 4, 6, and 8 should result in the following tree:
        5
      /  \
     3    7
      \  / \
      4 6   8
    */

    LinkedBinarySearchTree<Integer> tree = createTree();
    System.out.print(tree);
    System.out.println("# of nodes:"+tree.size());
    System.out.println();
    System.out.println("Inorder traversal:");
    System.out.println(tree.inOrder());

    tree.removeElement(3);
    System.out.println("after remove 3:");
    System.out.print(tree);
    System.out.println("# of nodes:"+tree.size());
    System.out.println();

    tree = createTree();
    tree.removeElement(5);
    System.out.println("after remove 5:");
    System.out.print(tree);
    System.out.println("# of nodes:"+tree.size());
    System.out.println();

    tree = createTree();
    tree.removeElement(7);
    System.out.println("after remove 7:");
    System.out.print(tree);
    System.out.println("# of nodes:"+tree.size());
    System.out.println();

    //test cases
    tree = createTree();
    System.out.println("test: find(5)");
    System.out.println("expect:\t5");
    System.out.println("got:\t"+tree.find(5));
    System.out.println("test: find(3)");
    System.out.println("expect:\t3");
    System.out.println("got:\t"+tree.find(3));

    System.out.println("test: find(4)");
    System.out.println("expect:\t4");
    System.out.println("got:\t"+tree.find(4));

    System.out.println("test: find(9)");
    System.out.println("expect:\tnull");
    System.out.println("got:\t"+tree.find(9));
  }

  private static LinkedBinarySearchTree<Integer> createTree(){
    LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<Integer>();
    tree.addElement(4);
    tree.addElement(3);
    tree.addElement(7);
    tree.addElement(1);
    tree.addElement(2);
    tree.addElement(5);
    tree.addElement(8);
    tree.addElement(6);
    tree.addElement(9);
    return tree;
  }
}
