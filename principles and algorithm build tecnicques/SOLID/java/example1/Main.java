import java.util.*;
//imports necesários

public class Main {
    public static void main(String[] args) throws Exception {
        
       Admin admin1 = new Admin("Leonardo Sousa", "leo@gmail.com");
       admin1.show();
       
       Customer customer1 = new Customer("Rodrigo Branas", "branas@gmail.com.br");
       customer1.show();
       
       Developer developer1 = new Developer("Fábio Akita", "akitaonrails@gmail.com.br");
       developer1.show();
    }
}