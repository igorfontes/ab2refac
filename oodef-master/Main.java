import geral.Menu;
import patterns.Singleton;
 
public class Main{
    public static void main(String[] args){

        Menu menu = Singleton.getInstance();
        menu.callMenu();

    }
    
}