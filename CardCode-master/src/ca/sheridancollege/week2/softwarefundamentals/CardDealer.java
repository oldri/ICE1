/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */

 //Oldri Kecaj 991666875
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card threeHearts = new Card("Hearts", 3);
        System.out.println(threeHearts); //Printing Card from edit
        Card kingSpade = new Card("Spade", 12);
    }
}
