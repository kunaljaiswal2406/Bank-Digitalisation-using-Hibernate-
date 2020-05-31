package hbm;

public class NewUserDetails {

    private String name;
    private long contact;
    private String gender;
    private String email;
    private String address;

    public NewUserDetails() {
    }

    public NewUserDetails(String name, long contact, String gender, String email, String address) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
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

}
