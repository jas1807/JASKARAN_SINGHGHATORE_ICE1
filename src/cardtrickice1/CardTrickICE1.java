/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//name: jaskaran singh ghatore
//studentid: 991664487

package cardtrickice1;
import cardtrickice1.Card;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuits(Card.SUITS[1]);
        
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0; i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.random()*12) + 1);//use a method to generate random *13
            c1.setSuits(Card.SUITS[(int) (Math.floor(Math.random()*4))]);//random method suit 
            magicHand[i] = c1;
            
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuits());
            
            }
        
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        
        
       System.out.println("please choose the suit: "  + "\n" + "1: diamonds" + "\n" + "2: clubs" + "\n" + "3: Spades"+"\n" + "4: hearts" );
        int userSuit = input.nextInt();
        
        System.out.println("please choose the value (1 to 13)");
       int userValue = input.nextInt();
       
        String response = "card not found";
        
        for(int i=0; i < 7; i++){
        
        //step 3: match with array
       
      if(magicHand[i].getSuits().equals( magicHand[userSuit -1].getSuits()) && userValue == magicHand[i].getValue()) {
      
      response = "card found";
    System.out.println(response);
    System.exit(0);
      }
        }
     
      System.out.println(response);
      
      
      
  
        
        
        
        
        
        
        
          }
       
        }
        
