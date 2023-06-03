/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmediaproject1;

/**
 *
 * @author macbookpro
 */
public class user {
    
    private String user;
    
    private int relation;

    public user(int relation, String user) {
        this.relation = relation;
        this.user = user;
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRelation() {
        return relation;
    }

    public void setRelation(int relation) {
        this.relation = relation;
    }
    
    public String toString() {
        String string = "";
        string += "-Relation: " + String.valueOf(relation);
        string += "-User: " + this.user + "\n";
       
        return string;
    }
    
    
}
