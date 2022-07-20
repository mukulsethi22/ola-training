class TreeNode{
    TreeNode left;
    TreeNode right;
    private int value;
    TreeNode(int value){
        this.value= value;
    }
    
}

class BST{
    TreeNode head;
    BST(){
        head = null; 
    }
    public TreeNode insertNode(TreeNode head,TreeNode node){
        if(head==null){
            head = node;
            return head;
        }
        if(head.value>=node.value){
            head.left = insertNode(head.left,node);
            return head;
        }else{
            head.right = insertNode(head.right,node);
            return head;
        }
    }
    public boolean searchNode(TreeNode head,TreeNode node){
        if(head==null)
        return false;
        if(head.value==node.value)
        return true;
        if(head.value>=node.value)
        return searchNode(head.left,node);
        return searchNode(head.right,node);
    }
}

public class Assgn{
    public static void main(String[] args){
        BST tree = new BST();
        TreeNode t1 = new TreeNode(10);
        tree.head = tree.insertNode(tree.head,t1);
        TreeNode t2 = new TreeNode(6);
                tree.head = tree.insertNode(tree.head,t2);
        TreeNode t3 = new TreeNode(4);
                tree.head = tree.insertNode(tree.head,t3);
        TreeNode t4 = new TreeNode(8);
                tree.head = tree.insertNode(tree.head,t4);
        TreeNode t5 = new TreeNode(12);
        tree.head = tree.insertNode(tree.head,t5);
        TreeNode t6 = new TreeNode(15);
                tree.head = tree.insertNode(tree.head,t6);
        TreeNode t7 = new TreeNode(17);
               tree.head =  tree.insertNode(tree.head,t7);
                System.out.println (tree.searchNode(tree.head,t1));       
    }
}