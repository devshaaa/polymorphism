
package shaina;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Polymorphism_Fruits my_fruits = new Polymorphism_Fruits ();
        Polymorphism_Food my_food = new Polymorphism_Food ();
        Polymorphism_Desert my_desert = new Polymorphism_Desert ();
        
       
        System.out.println("------------------------------------------------------------------");
        
        my_fruits.myFavorite();
        my_food.myFavorite();
        my_desert.myFavorite();
    }
    
    
}
