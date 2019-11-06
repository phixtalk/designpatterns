package javads.creational.builder;

public class UserBuilder {
    private String id;
    private String name;
    private String email;
    private String birthday;
    private String phoneNumber;

    public UserBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public User createUser(){
        return new User(id, name, email, birthday, phoneNumber);
    }

}
