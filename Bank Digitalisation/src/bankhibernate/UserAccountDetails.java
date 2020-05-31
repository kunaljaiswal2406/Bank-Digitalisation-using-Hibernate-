/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankhibernate;

public class UserAccountDetails {

    private String id;
    private String password;
    private Long accountNo;
    private String name;
    private String contact;
    private String gender;
    private String email;
    private String address;
    private double balance;

    public UserAccountDetails() {
    }

    public UserAccountDetails(String id, String password, Long accountNo, String name, String contact, String gender, String email, String address, double balance) {
        this.id = id;
        this.password = password;
        this.accountNo = accountNo;
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
