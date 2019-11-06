package javads;

import javads.creational.builder.User;
import javads.creational.builder.UserBuilder;
import javads.creational.factory.OS;
import javads.creational.factory.OSFactory;

public class Main {

    public static void main(String[] args){

        //Singleton execution: Here we create a class with only one instance and acccess to it
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton);
//        System.out.println(singleton2);

        //Builder execution: We can create objects without directly instantiating the object,
        //useful for objects with multiple parameters and setting all parameters is optional
//        User user = new UserBuilder().setName("Chrisoft").setEmail("ofoefulec_fny@yahoo.com").createUser();
//        System.out.println(user.toString());

        //Factory execution: useful when we want to method to return one of several possible classes
        //that share a common super class.
        //As can be seen below, the main program depends only on the Interface and the FactorBuilder class
        OSFactory osf = new OSFactory();
        OS windows = osf.getOS("windows");
        windows.spec();
        OS android = osf.getOS("android");
        android.spec();
        OS ios = osf.getOS("ios");
        ios.spec();

        //Adapter pattern


    }

}
