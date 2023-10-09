public class Tree {
    private Node root;
    public class Node{
        private Node left;
        private Node right;
        private int value;
        public Node(int value){
            this.value=value;
        }
    }

    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node fifth = new Node(5);

        root =first;
        first.left = second;
        first.right =three;
        second.left = four;
        second.right = fifth;
    }

    public void preOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static  void main(String args[]){
        Tree tree = new Tree();
        tree.createBinaryTree();
        tree.preOrder(tree.root );
    }
}
