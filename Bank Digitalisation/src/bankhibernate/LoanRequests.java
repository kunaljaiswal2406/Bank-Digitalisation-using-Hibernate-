/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankhibernate;


public class LoanRequests {
    
    private long acc;
    private String name;
    private double amtreq;

    public LoanRequests(long acc, String name, double amtreq) {
        this.acc = acc;
        this.name = name;
        this.amtreq = amtreq;
    }

    public LoanRequests() {
    }

    public long getAcc() {
        return acc;
    }

    public void setAcc(long acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtreq() {
        return amtreq;
    }

    public void setAmtreq(double amtreq) {
        this.amtreq = amtreq;
    }
    
    

}
