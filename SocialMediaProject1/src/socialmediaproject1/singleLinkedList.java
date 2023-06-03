/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmediaproject1;

/**
 *
 * @author macbookpro
 */
public class singleLinkedList <T> {
    
    private Node<T> pFirst;
    private Node<T> pLast;
    private int size;

    public singleLinkedList() {
    }

    public singleLinkedList(Node<T> pFirst, Node<T> pLast, int size) {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.pFirst == null;
    
    }
    
    public void addFirst(T data){
        Node<T> n = new Node(data);
        if (isEmpty()) {
            this.pFirst = n;
            this.pLast = n;
            this.pFirst.setpNext(this.pLast);
            this.pLast.setpNext(null);
        } else {
            n.setpNext(this.pFirst);
            this.pFirst = n;
        }      
    }
    
    public void addLast(T value){
        Node<T> n = new Node(value);
        if (isEmpty()) {
            this.pFirst = n;
            this.pLast = n;
            this.pFirst.setpNext(this.pLast);
            this.pLast.setpNext(null);
        } else {
            this.pLast.setpNext(n);
            this.pLast = n; 
        }
    }
    
    

    
}
