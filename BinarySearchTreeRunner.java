class BinarySearchTreeRunner{
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertTreeNode(10);
        bst.insertTreeNode(40);
        bst.insertTreeNode(9);
        bst.insertTreeNode(50);
        bst.insertTreeNode(5);
        bst.insertTreeNode(60);
        bst.preorder();
    }
}
class BinarySearchTree{
    TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public void printRightMostNodes(){
        printRightMostNodesRec(root);
    }

    private void printRightMostNodesRec(TreeNode root) {
        if (root.right == null)
        return;
        printRightMostNodesRec(root.right);
        System.out.println(root.data);
    }

    public void printRightMostNode(){
        printRightMostNodeRec(root);
    }


    private void printRightMostNodeRec(TreeNode root) {
        if (root.right == null)
        System.out.println(root.data);
        else
        printRightMostNodeRec(root.right);

    }

    public void printLeftMostNode(){
        printLeftMostNodesRecursion(root);

    }

    private void printLeftMostNodesRecursion(TreeNode root) {
        if (root == null)
            return;
            printLeftMostNodesRecursion(root.left);
            System.out.println(root.data);
        
    }
    public void insertTreeNode(int data){
        root = insertRec(root,data);
    }
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null){
            root = new TreeNode(data);
        }
        else if (data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    //lpr
    private void inorderRec(TreeNode root) {
        if (root == null)
        return;

        inorderRec(root.left);
        System.out.println(root.data);
        inorderRec(root.right);
    }

    public void postorder(){
        postorderRec(root);
    }

    // LRP
    private void postorderRec(TreeNode root) {
        if (root == null)
        return;
        
        postorderRec(root.left);
        postorderRec(root.right);
        System.out.println(root.data);
    }

    public void preorder(){
        preorderRec(root);
    }
    //PLR
    private void preorderRec(TreeNode root) {
        if (root == null)
        return;

        System.out.println(root.data);
        preorderRec(root.left);
        preorderRec(root.right);
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }
}