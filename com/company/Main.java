package com.company;


//could use Junit for a test, but here for this small program,
// I think we can just use this main function as a test case.
public class Main {
    public static void main(String[] args){
        if(test1() == true){
            System.out.println("test 1 passed.");
        }
        else{
            System.out.println("test 1 failed");
        }

        if(test2() == true){
            System.out.println("test 2 passed.");
        }
        else{
            System.out.println("test 2 failed");
        }

        return;
    }

    //test case 1
    public static boolean test1(){
        ShoppingCart shoppingCart = new ShoppingCart();

        for(int i = 0; i < 8; i++) {
            shoppingCart.add(TicketEnum.OperaHouseTour);
        }

        for(int i = 0; i < 7; i++){
            shoppingCart.add(TicketEnum.SydneyBridgeClimb);
        }

        for(int i = 0; i < 4; i++){
            shoppingCart.add(TicketEnum.SydneySkyTower);
        }

        if(shoppingCart.total().equals("2416.00")){
            return true;
        }
        else{
            //System.out.println(shoppingCart.total());
            return false;
        }
    }

    //test case 2
    public static boolean test2(){
        ShoppingCart shoppingCart = new ShoppingCart();

        for(int i = 0; i < 18; i++) {
            shoppingCart.add(TicketEnum.OperaHouseTour);
        }

        for(int i = 0; i < 26; i++){
            shoppingCart.add(TicketEnum.SydneyBridgeClimb);
        }

        for(int i = 0; i < 30; i++){
            shoppingCart.add(TicketEnum.SydneySkyTower);
        }

        if(shoppingCart.total().equals("6248.00")){
            return true;
        }
        else{
            //System.out.println(shoppingCart.total());
            return false;
        }
    }
}
