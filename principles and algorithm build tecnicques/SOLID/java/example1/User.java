import java.util.*;
//imports necesários

abstract class User {

    private String username;
    private String email;  
    
    public User(String username, String email){
        
        this.username = username;
        this.email = email;
    }
    
    abstract String getUser();
}