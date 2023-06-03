/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmediaproject1;

/**
 *
 * @author macbookpro
 */
public class Userst {
    
    private String users;
    private singleLinkedList<user> usersList;
    
    public Userst(String users) {
        this.users = users;
//        this.usersList = new singleLinkedList<user>;
    }

    public Userst(String users, singleLinkedList<user> usersList) {
        this.users = users;
        this.usersList = usersList;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public singleLinkedList<user> getUsersList() {
        return usersList;
    }

    public void setUsersList(singleLinkedList<user> usersList) {
        this.usersList = usersList;
    }
    
    public void addProduct(int relation, String user) {
        if (relation >= 1) {
            user newUser = new user(relation, user);
            this.usersList.addLast(newUser);
        } else {
            user newuser = new user(user);
            this.usersList.addLast(newuser);
        }
    }
    
      public String toString() {
        String string = "";
        string += "Usuarios" + this.users + "\n\n" + usersList.toString() + "----------------------------------------------\n";
        return string;
    }
    
    
    
}
