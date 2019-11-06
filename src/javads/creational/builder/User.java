package javads.creational.builder;

public class User {
    private String id;
    private String name;
    private String email;
    private String birthday;
    private String phoneNumber;

    public User(String id, String name, String email, String birthday, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "User [id=]"+id+", name="+name+", email="+email+", birthday="+birthday+", phoneNumber="+phoneNumber+" ]";
    }

}
