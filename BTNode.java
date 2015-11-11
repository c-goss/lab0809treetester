package lab0809treetester;

/**
 * Implementing a tree
 * @author Colin P. Goss
 */
public class BTNode<E> 
{
    private E data;
    private BTNode<E> left;
    private BTNode<E> right;
    
    /**
     * No arg constructor
     * @param newData The data for the node
     * @param newLeft link to the left node
     * @param newRight link to the right node
     */
    public BTNode(E newData, BTNode<E> newLeft, BTNode<E> newRight)
    {
        data = newData;
        left = newLeft;
        right = newRight;
    }//end constructor
    
    /**
     * Returns the data
     * @return The data
     */
    public E getData()
    {
        return data;
    }//end getData
    
    /**
     * Returns the left link
     * @return the left link
     */
    public BTNode<E> getLeft()
    {
        return left;
    }//end getLeft
    
    /**
     * Returns the right link
     * @return the right link
     */
    public BTNode<E> getRight()
    {
        return right;
    }//end getRight
    
    /**
     * Prints the tree in order from left to right.
     */
    public void inOrderPrint()
    {
        if (left != null){
            left.inOrderPrint();
        }//end left
        
        System.out.println(data);
        
        if(right != null){
            right.inOrderPrint();
        }//end right
        
    }//end inOrderPrint
    
    /**
     * Sets the data in the node
     * @param newData The new data to be passed
     */
    public void setData(E newData)
    {
        data = newData;
    }//end setData
    
    /**
     * Sets a new link to left
     * @param newLeft the new link to go left
     */
    public void setLeft(BTNode<E> newLeft)
    {
        left = newLeft;
    }//end setLeft
    
    /**
     * Sets a new link to the right
     * @param newRight the new link to the right
     */
    public void setRight(BTNode<E> newRight)
    {
        right = newRight;
    }//end setRight
    
    public E getRightMostData()
    {
        if(right == null){
            return data;
        } else {
            return right.getRightMostData();
        }//end right == null if-else
    }//end getRightMostData
    
    public BTNode<E> removeRightmost()
    {
        if (right == null){
            return left;
        } else {
            right = right.removeRightmost();
            return this;
        }//end if right == null if=-else
    }//end removeRightMost
}//end BTNode
