/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankhibernate;

public class ManagerLoginh {

    private String id;
    private String password;

    public ManagerLoginh() {
    }

    public ManagerLoginh(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
