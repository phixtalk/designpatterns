package javads.creational.factory;

public class OSFactory {

    OS os;

    public OS getOS(String type){
        if(type == "android"){
            os = new Android();
        }else if(type == "ios"){
            os = new IOS();
        }else{
            os = new Windows();
        }
        return os;
    }

}
