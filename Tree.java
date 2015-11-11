package lab0809treetester;

/**
 * Generic tree
 * @author Colin P. Goss
 */
public class Tree<E extends Comparable<E>>
{
    private BTNode<E> root;
    private int numItems;
    
    /**
     * No-arg constructor
     */
    public Tree()
    {
        root = null;
        numItems = 0;
    }//end constructor
    
    /**
     * Adds a new element to the tree
     * @param element The element to be added to the tree
     */
    public void add(E element)
    {
        if (root == null) {
            root = new BTNode<E>(element, null, null);
        }else{
            BTNode<E> cursor = root;
            boolean done = false;
            
                while(!done){
                    if (element.compareTo(cursor.getData()) <= 0){//cursor.getData().compareTo(element) > 0){
                        if (cursor.getLeft() == null) {
                            cursor.setLeft(new BTNode<E>(element,null,null));
                            done = true;
                        } else {
                            cursor = cursor.getLeft();
                    } //end left is null if-else
                }else{
                    if(cursor.getRight() == null){
                        cursor.setRight(new BTNode(element, null, null));
                        done = true;
                    }else{
                        cursor = cursor.getRight();
                        }//end cursor.getRight if-else
                    }//end compareto if-else
            }//end while
        }//end root ==null if-else
        numItems++;
    }//end add
    
    /**
     * Get the number of elements in the tree
     * @return The size of the tree
     */
    public int size()
    {
        return numItems;
    }//end size
    
    /**
     * Print the tree in order
     */
    public void printTree()
    {
        if (root == null){
            System.out.println("This tree is empty");
        }else{
            root.inOrderPrint();
        }//end if-else
    }//end inOrderPrint
    
    public boolean remove(E target)
    {
        BTNode<E> cursor = root;
        BTNode<E> parentOfCursor = null;
        boolean found = false;
        
        while (cursor != null && !found){
            if (target.equals(cursor.getData())){
                found = true;
            }else{
                if(target.compareTo(cursor.getData()) <= 0){
                    parentOfCursor = cursor;
                    cursor = cursor.getLeft();
                }else{
                    parentOfCursor = cursor;
                    cursor = cursor.getRight();
                }//end target.compareTo if-else
            }//end target.equals if-else
        }//end cursor && found while
        
        if (cursor != null){
            if (cursor.getLeft() == null && cursor == root){
                root = root.getRight();
            } else if (cursor.getLeft() == null && cursor!= root){
                if (cursor == parentOfCursor.getLeft()){
                    parentOfCursor.setLeft(cursor.getRight());
                } else {
                    parentOfCursor.setRight(cursor.getRight());
                }//end cursor ==parentOfCursor.setLEft if-else
            } else{
                cursor.setData(cursor.getLeft().getRightMostData());
                cursor.setLeft(cursor.getLeft().removeRightmost());
            } //end cursor == root if-else
        }//end found if
        return found;
    }
}//end Tree
