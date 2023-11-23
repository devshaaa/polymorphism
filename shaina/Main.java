
package shaina;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Polymorphism_Fruits my_fruits = new Polymorphism_Fruits ("Strawberry");
        Polymorphism_Food my_food = new Polymorphism_Food ("Burger");
        Polymorphism_Desert my_desert = new Polymorphism_Desert ("Spaghetti");
        
        my_fruit.kaon();
        my_food.lami();
        my_desert.special();
        
        System.out.println("------------------------------------------------------------------");
        
        my_fruit.myFavorite();
        my_food.myFavorite();
        my_desert.myFavorite();
    }
    
    
}
