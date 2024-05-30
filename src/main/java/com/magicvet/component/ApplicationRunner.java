package main.java.com.magicvet.component;

public class ApplicationRunner {

    private final EnityRegister register = new EnityRegister();
    public void run(){
        if (Authenticator.auth()){
            register.registerClients();
        }
    }

}
