import java.util.*;
//imports necesários

class Admin extends User implements UserViewer, Role{
    
    private String username;
    private String email;
    private String roleType = "admin";
    
    @Override
    public String role(){    
        
        return this.roleType;
    }
    
    public Admin(String username, String email){
        
        super(username, email);
        this.username = username;
        this.email = email;
        role();
    }
    
    public void setUsername(String username){
        
        this.username = username;
    }
    
     public String getUsername(){
        
        return username;
    }
    
    public void setEmail(String email){
        
        this.email = email;
    }
    
    public String getEmail(){
        
        return email;
    }
    
    public String getRoleType(){
        
        return roleType;
    }
    
    @Override
    public String getUser(){    
        
       return "username: "
            + getUsername()
            + ", "
            + "email: "
            + getEmail()
            + ", "
            + "role: "
            + getRoleType();
    }
    
    @Override
    public void show(){    
        
        System.out.println(getUser());
    }
}
