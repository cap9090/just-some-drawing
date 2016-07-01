/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anewworld;
import java.awt.Color;
import simplegui.SimpleGUI;
/**
 *
 * @author Christian Prajzner
 */
public class House {
    
    final int WIDTH = 100;
    final int HEIGHT = 100; 
    House next;
    int xPos;
    int yPos;
    
    
    public House(int x, int y){
        next = null;
        xPos = x;
        yPos = y;
    }
    
    public House(){
        next = null;
        
    }
    
    public void drawHouse(Color c, SimpleGUI sg){
        Color color = new Color (0, 100, 0);
        sg.setBackgroundColor(color);
        sg.drawFilledBox(xPos, yPos + (HEIGHT/4), WIDTH, 3*(HEIGHT/4), c, 1, "house");
        sg.drawFilledBox(xPos + (WIDTH/2), yPos + (5*(HEIGHT)/8), WIDTH/4, 3*HEIGHT/8, Color.black, 1, "door");
        //sg.drawFilledBox(xPos, yPos, WIDTH, HEIGHT/4, color , 0, "room for chimney");
        sg.drawFilledBox(xPos, yPos, WIDTH/4, HEIGHT/4, Color.black , 1, "chimney");
        sg.drawFilledBox(xPos + WIDTH/5.5, yPos + (HEIGHT/2.5), WIDTH/5, HEIGHT/5, Color.black, 1, "window");
        sg.drawLine(xPos + WIDTH/5.5, yPos + HEIGHT/2.5, xPos + WIDTH/5.5 + WIDTH/5, HEIGHT/2.5 + yPos, Color.yellow, 1, 1, "window frame");
        sg.drawLine(xPos + WIDTH/5.5, yPos + HEIGHT/2.5, xPos + WIDTH/5.5, yPos + HEIGHT/2.5 + HEIGHT/5, Color.yellow  , 1, 1, "window frame");
        sg.drawLine(xPos + WIDTH/5.5, yPos + HEIGHT/2.5 + HEIGHT/5, xPos + WIDTH/5.5 + WIDTH/5, yPos + HEIGHT/2.5 + HEIGHT/5, Color.yellow, 1, 1, "window frame");
        sg.drawLine(xPos + WIDTH/5.5 + WIDTH/5, yPos + HEIGHT/2.5, xPos + WIDTH/5.5 + WIDTH/5, yPos + HEIGHT/2.5 + HEIGHT/5, Color.yellow, 1, 1, "window frame");
        sg.drawLine(xPos + WIDTH/5 + WIDTH/12 , yPos + HEIGHT/2.5 , xPos + WIDTH/5 + WIDTH/12, yPos + HEIGHT/2.5 + HEIGHT/5, Color.yellow, 1, 1, "window frame");
        sg.drawLine(xPos + WIDTH/5.5, yPos + HEIGHT/2.5 + HEIGHT/10, xPos + WIDTH/5.5 + WIDTH/5, yPos + HEIGHT/2.5 + HEIGHT/10, Color.yellow, 1, 1 , "window frame");
        
        Color roof = new Color(218, 165, 32);
        sg.drawLine(xPos, yPos + HEIGHT/4, xPos + WIDTH/2, yPos, roof, 1, 10, "roof");
        sg.drawLine(xPos + WIDTH/2, yPos, xPos + WIDTH, yPos + HEIGHT/4, roof, 1, 10, "roof");
        sg.drawFilledBox(xPos + 20, yPos + HEIGHT/5 -10  , WIDTH -40, HEIGHT/5 - 5, roof, 1, "roof");
        sg.drawLine(xPos + WIDTH/2 - 9, yPos + 7, xPos + WIDTH/2+7, yPos + 7, roof, 1, 9 , "roof");
        sg.drawLine(xPos + 2, yPos + HEIGHT/4 -2 , xPos + 20, yPos + HEIGHT/4 -2 , roof, 1, 4, "roof");
        sg.drawLine(xPos + WIDTH -26, yPos + HEIGHT/4 -2 , xPos + WIDTH -8, yPos + HEIGHT/4 -2 , roof, 1, 4, "roof");
        //sg.drawLine(xPos +5 , yPos + WIDTH/4 + 4, xPos + WIDTH -4, yPos + WIDTH/4 +4 , Color.red  , 1, 9, "roof");

        
        
//            for(int i = 0; i< 100; i++){
//            int x = xPos + WIDTH/20  + (int)((Math.random()) *(WIDTH/6));
//            int y = yPos - (int)((Math.random()) *(HEIGHT/3));
//            sg.drawDot(x, y, 2, Color.gray, 1  , "smoke");
//            x = xPos + WIDTH/20 +  (int)((Math.random()) *(WIDTH/6));
//            y = yPos - (int)((Math.random()) *(HEIGHT/3));
//            sg.drawDot(x, y, 2, Color.black, 1  , "smoke");
//            
//            }

        
        
        
//        if (next != null){
//            sg.drawLine(xPos + WIDTH, yPos + HEIGHT, next.xPos, next.yPos, c, 1, 1, null);
//        }
        
    }
    
    public void drawConnection(Color c, SimpleGUI sg){
        if (next != null){
            sg.drawLine(xPos + WIDTH, yPos + HEIGHT, next.xPos, next.yPos + (HEIGHT/4), c, 0.2, 1, "line");
            sg.print("new house built at " + next + ", connected to house at " + this);
        }
        else{
            
            sg.print("First house built, connected to sign post");
        }
    }
    
    @Override
    public String toString(){
        return "(" + xPos + ", " + yPos + ")";
    }
}
