package star.wars;


import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin Lambdin
 */
public class Hero extends Character {
    private int health;
    
public Hero(){
        super();
        health = 3;
}

public Hero(int x, int y, Color color, int size, String name) {
    //Fields (Variables)
    super(x,y, color, size, name);
    health = 3;

}
    //Constructor
        

    
    //Getters
 public int getHealth() {
            return health;
        }
 
    //Public Methods
    public void collect() {
        
    }
    
    public void teleport() {
        
    }
    
    //Private Methods
    private void grow() {
        
    }
    
    private void canTeleport() {
        
    }
    }
    

