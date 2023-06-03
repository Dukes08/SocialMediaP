/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmediaproject1;

/**
 *
 * @author macbookpro
 */
public class Node <T>{
    
    private Node pNext;
    
    private T value;

    public Node(T value) {
        this.pNext = null;
        this.value = value;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    
    
    
    
}
