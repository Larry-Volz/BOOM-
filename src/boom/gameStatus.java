/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boom;

/**
 *
 * @author larryvolz
 */
public class gameStatus {
    
    public static boolean gameIsLive;
    
    public static void startGame() {
        
     gameIsLive = true;
   
    } 
 
    public static void endGame() {
        
         gameIsLive = false;
    }
    
    public static boolean getGame(){
        return gameIsLive;
    }
}  


