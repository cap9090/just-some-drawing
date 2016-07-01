/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anewworld;

import simplegui.SimpleGUI;
import simplegui.SGMouseListener;
import simplegui.GUIListener;
import java.awt.Color;
import simplegui.AbstractDrawable;
import simplegui.TimerListener;
        


/**
 *
 * @author Chrsitian Prajzner
 */
public class ANewWorld implements SGMouseListener, GUIListener, TimerListener {

    
    SimpleGUI sg;
    Area a = new Area();
    House [] arrayOfHouses = new House[10]; // don't worry the houses are linked i created this array for other purposes
    int iterHelp = 0;
    int iterHelp2 = 0;

    @Override
    public void reactToTimer(long l) {
        AbstractDrawable bird1 = sg.getDrawable("bird1");
        if (bird1.posX >1500)
            sg.animMoveAllRel(-1500, 0, "bird1");
        else{
            sg.animMoveAllRel(10, 0, "bird1");
            }
        sg.repaintPanel();
        AbstractDrawable bird2 = sg.getDrawable("bird2");
        if (bird2.posX >1500)
            sg.animMoveAllRel(-1500, 0, "bird2");
        else
            sg.animMoveAllRel(10, 0, "bird2");
        AbstractDrawable bird3 = sg.getDrawable("bird3");
        if (bird3.posX >1500)
            sg.animMoveAllRel(-1500, 0, "bird3");
        else
            sg.animMoveAllRel(10, 0, "bird3");
        AbstractDrawable bird4 = sg.getDrawable("bird4");
        if (bird4.posX >1500)
            sg.animMoveAllRel(-1500, 0, "bird4");
        else
            sg.animMoveAllRel(10, 0, "bird4"); 
        AbstractDrawable cloud = sg.getDrawable("cloud");
        if (cloud.posX > 1400){
            sg.animMoveAllRel(-1500, 0, "cloud");
        }
        else{
            sg.animMoveAllRel(4, 0, "cloud");}
        AbstractDrawable squirrel = sg.getDrawable("squirrel2");
        if(squirrel.posY < 170)
            sg.animMoveAllRel(0, 70, "squirrel2");
        else
            sg.animMoveAllRel(0, -3, "squirrel2");
        AbstractDrawable ship = sg.getDrawable("ship");
        if (ship.posX > 1500){
            sg.animMoveAllRel(-1700, 0, "ship");
        }
        else
            sg.animMoveAllRel(9, 0, "ship");
        AbstractDrawable sky = sg.getDrawable("sky");
        
//        if (Math.random() > 0.5)
//            sky.color = sky.color.darker();
//        else
//            sky.color = sky.color.brighter();
        AbstractDrawable current = sg.getDrawable("river current");
        if (current.posX > 1500)
            sg.animMoveAllRel(-1500, 0, "river current");
        else 
            sg.animMoveAllRel(6, 0, "river current");
        
        AbstractDrawable boat = sg.getDrawable("boat");
        if (boat.posX > 1500)
            sg.animMoveAllRel(-1500, 0, "boat");
        else 
            sg.animMoveAllRel(6, 0, "boat");  
        

        
       
        sg.repaintPanel();
            
        
            
            
    }           
    
    @Override
    public void reactToMouseClick(int x , int y) {
        House h = new House(); //i just create this instance so I have access to the fields WIDTH and HEIGHT
        if ((x+ h.WIDTH > sg.getWidth()) || (y + h.HEIGHT > sg.getHeight()) || y < 270)
            sg.print("Click on a spot farther from the edge so that the whole house can be drawn on the screen");
        else
        {
        if (iterHelp < 10){
        
        
        int x1 = x;
        int y1 = y;
        
//        for (House ho: arrayOfHouses){
//                while ((((x1 > ho.xPos) && (x1 < (ho.xPos + ho.WIDTH))) 
//                       || (((x1 + ho.WIDTH) > ho.xPos )&&((x1 + ho.WIDTH) < (ho.xPos + ho.WIDTH))))
//                        && (((y1 > ho.yPos) &&(y1 <(ho.yPos + ho.HEIGHT))) || (((y1 +ho.HEIGHT) > ho.yPos) 
//                        &&(( y1 +ho.HEIGHT) < (ho.yPos + ho.HEIGHT))))) // all this makes sure that no overlaping occurs
//                {
//                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
//                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
//                }
//            }
        
//        for (int j = 0; (arrayOfHouses[j] != null) && (j < arrayOfHouses.length); j ++){
//                while ((((x1 > arrayOfHouses[j].xPos) && (x1 < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))) 
//                       || (((x1 + arrayOfHouses[j].WIDTH) > arrayOfHouses[j].xPos )&&((x1 + arrayOfHouses[j].WIDTH) < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))))
//                        && (((y1 > arrayOfHouses[j].yPos) &&(y1 <(arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))) || (((y1 +arrayOfHouses[j].HEIGHT) >arrayOfHouses[j].yPos) 
//                        &&(( y1 +arrayOfHouses[j].HEIGHT) < (arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))))) // all this makes sure that no overlaping occurs
//                {
//                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
//                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
//                }
//            }
        
                for (int j = 0; (arrayOfHouses[j] != null) && (j < arrayOfHouses.length); j ++){
                while (((x1 > arrayOfHouses[j].xPos) && (x1 < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))) && ((y1 > arrayOfHouses[j].yPos) &&(y1 <(arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))) 
                       || ((((x1 + arrayOfHouses[j].WIDTH) > arrayOfHouses[j].xPos )&&((x1 + arrayOfHouses[j].WIDTH) < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH)))
                        && ( ((((y1 +arrayOfHouses[j].HEIGHT) >arrayOfHouses[j].yPos) && (( y1 +arrayOfHouses[j].HEIGHT) < (arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))))))) // all this makes sure that no overlaping occurs, well actually some does
                {
                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
                }
            }
        
        
        a.add(x1, y1);
        arrayOfHouses[iterHelp] = a.getHouse(iterHelp);
        arrayOfHouses[iterHelp].drawHouse(Color.red, sg);
        if (arrayOfHouses[iterHelp] == a.head){
            drawSignPost(sg, arrayOfHouses[iterHelp]);
            sg.print("First house built, connected to sign post");
        }
        iterHelp ++;
        
        }
        else{
            sg.print("10 house limit!");
            
        }

        for (int k = 0; k < iterHelp -1 ; k++){
            arrayOfHouses[k].drawConnection(Color.red, sg);        
        }
    } 
       
    }

    @Override
    public void reactToButton1()  
        {  
        if (iterHelp < 10){
        House h = new House(); //i just create this instance so I have access to the fields WIDTH and HEIGHT
        
            
        int x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
        int y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT)); 
        
        //I WOULD'VE DONE THIS CODE IF WE COULD'VE USED ARRAY LIST!
//        for (House ho: arrayOfHouses){
//                while ((((x1 > ho.xPos) && (x1 < (ho.xPos + ho.WIDTH))) 
//                       || (((x1 + ho.WIDTH) > ho.xPos )&&((x1 + ho.WIDTH) < (ho.xPos + ho.WIDTH))))
//                        && (((y1 > ho.yPos) &&(y1 <(ho.yPos + ho.HEIGHT))) || (((y1 +ho.HEIGHT) > ho.yPos) 
//                        &&(( y1 +ho.HEIGHT) < (ho.yPos + ho.HEIGHT))))) // all this makes sure that no overlaping occurs
//                {
//                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
//                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
//                }
//            }
        
//        for (int j = 0; (arrayOfHouses[j] != null) && (j < arrayOfHouses.length); j ++){
//                while ((((x1 > arrayOfHouses[j].xPos) && (x1 < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))) 
//                       || (((x1 + arrayOfHouses[j].WIDTH) > arrayOfHouses[j].xPos )&&((x1 + arrayOfHouses[j].WIDTH) < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))))
//                        && (((y1 > arrayOfHouses[j].yPos) &&(y1 <(arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))) || (((y1 +arrayOfHouses[j].HEIGHT) >arrayOfHouses[j].yPos) 
//                        &&(( y1 +arrayOfHouses[j].HEIGHT) < (arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))))) // all this makes sure that no overlaping occurs
//                {
//                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
//                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
//                }
//            }
        
                for (int j = 0; (arrayOfHouses[j] != null) && (j < arrayOfHouses.length); j ++){
                while (((x1 > arrayOfHouses[j].xPos) && (x1 < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH))) && ((y1 > arrayOfHouses[j].yPos) &&(y1 <(arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))) 
                       || ((((x1 + arrayOfHouses[j].WIDTH) > arrayOfHouses[j].xPos )&&((x1 + arrayOfHouses[j].WIDTH) < (arrayOfHouses[j].xPos + arrayOfHouses[j].WIDTH)))
                        && ( ((((y1 +arrayOfHouses[j].HEIGHT) >arrayOfHouses[j].yPos) && (( y1 +arrayOfHouses[j].HEIGHT) < (arrayOfHouses[j].yPos + arrayOfHouses[j].HEIGHT))))))
                        || (y1 < 300)) 
                        // all this makes sure that no overlaping occurs, well most overlapping
                {
                    x1 = (int) ((Math.random()) * (sg.getWidth() - h.WIDTH));
                    y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
                }
            }
                
        while (y1 <  270)
            y1 = (int) ((Math.random()) * (sg.getHeight() - h.HEIGHT));
        
        a.add(x1, y1);
        arrayOfHouses[iterHelp] = a.getHouse(iterHelp);
        arrayOfHouses[iterHelp].drawHouse(Color.red, sg);
        if (arrayOfHouses[iterHelp] == a.head){
            drawSignPost(sg, arrayOfHouses[iterHelp]);
            sg.print("First house built, connected to sign post");
        }
        iterHelp ++;
        
        }
        else{
            sg.print("10 house limit!");
        }


        for (int k = 0; k < iterHelp -1 ; k++){
            arrayOfHouses[k].drawConnection(Color.red, sg);
        }
        
        

            
        
    }
    
    @Override
    public void reactToButton2() 
    {

        if(iterHelp2 < a.size){
            if (iterHelp2 == 0){
                sg.eraseAllDrawables("postman");
                a.getHouse(iterHelp2).drawHouse(Color.green, sg);
                sg.drawFilledEllipse(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3, 15, 15, Color.orange, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3, 15, 5, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 3, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 - 7, 8, 7, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 18, 15, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 4, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 15, 6, 13, Color.blue, 1, "postman" );
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 4, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 23, 3, 9, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 32, 8, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 6, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 26, 6, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 11, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 26, 3, 10, Color.blue, 1, "postman");
                                
                                
                for(int i = 0; i< 100; i++){
            int x = a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH/20  + (int)((Math.random()) *(a.getHouse(iterHelp2).WIDTH/10));
            int y = a.getHouse(iterHelp2).yPos - (int)((Math.random()) *(a.getHouse(iterHelp2).HEIGHT/3));
            sg.drawDot(x, y, 2, Color.gray, 1  , "smoke");
            x = a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH/20 +  (int)((Math.random()) *(a.getHouse(iterHelp2).WIDTH/10));
            y = a.getHouse(iterHelp2).yPos - (int)((Math.random()) *(a.getHouse(iterHelp2).HEIGHT/3));
            sg.drawDot(x, y, 2, Color.black, 1  , "smoke");
            
            }
            }
            else
            {   sg.eraseAllDrawables("postman");
                a.getHouse(iterHelp2 -1).drawHouse(Color.red, sg);
                a.getHouse(iterHelp2).drawHouse(Color.green, sg);
                sg.drawFilledEllipse(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3, 15, 15, Color.orange, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3, 15, 5, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 3, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 - 7, 8, 7, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 18, 15, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 4, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 15, 6, 13, Color.blue, 1, "postman" );
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 4, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 23, 3, 9, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 32, 8, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 6, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 26, 6, 3, Color.blue, 1, "postman");
                sg.drawFilledBox(a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH + 11, a.getHouse(iterHelp2).yPos + a.getHouse(iterHelp2).HEIGHT - a.getHouse(iterHelp2).HEIGHT/3 + 26, 3, 10, Color.blue, 1, "postman");
                for(int i = 0; i< 100; i++){
            int x = a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH/20  + (int)((Math.random()) *(a.getHouse(iterHelp2).WIDTH/10));
            int y = a.getHouse(iterHelp2).yPos - (int)((Math.random()) *(a.getHouse(iterHelp2).HEIGHT/3));
            sg.drawDot(x, y, 2, Color.gray, 1  , "smoke");
            x = a.getHouse(iterHelp2).xPos + a.getHouse(iterHelp2).WIDTH/20 +  (int)((Math.random()) *(a.getHouse(iterHelp2).WIDTH/10));
            y = a.getHouse(iterHelp2).yPos - (int)((Math.random()) *(a.getHouse(iterHelp2).HEIGHT/3));
            sg.drawDot(x, y, 2, Color.black, 1  , "smoke");
            
            }
                
            }
            iterHelp2 ++;
        }
        else{ //in this last step it doesn't automatically jump to the first one again there is a one click interval
            a.getHouse(a.size -1).drawHouse(Color.red, sg);
            iterHelp2 = 0;
            sg.eraseAllDrawables("smoke");
            sg.eraseAllDrawables("postman");
        } 
//        for(int i = 0; i< 100; i++){
//            int x = xPos + WIDTH/20  + (int)((Math.random()) *(WIDTH/6));
//            int y = yPos - (int)((Math.random()) *(HEIGHT/3));
//            sg.drawDot(x, y, 2, Color.gray, 1  , "smoke");
//            x = xPos + WIDTH/20 +  (int)((Math.random()) *(WIDTH/6));
//            y = yPos - (int)((Math.random()) *(HEIGHT/3));
//            sg.drawDot(x, y, 2, Color.black, 1  , "smoke");
//            
//            }
        
        
    }

    @Override
    public void reactToSwitch(boolean bln) {
    }

    @Override
    public void reactToSlider(int i) {
    }
    
    ANewWorld (){
        sg = new SimpleGUI();
        sg.maximizeGUIonScreen();
        Color color = new Color (0, 100, 0);
        sg.setBackgroundColor(color);
        drawSky(sg);
        drawRiver(sg);
        drawTrees(sg);
        drawClouds(sg);
        drawBirds(sg);
        drawShip(sg);
        //drawW(sg);
        
        //drawLake(sg);
        sg.registerToGUI(this);
        sg.registerToTimer(this);
        sg.timerStart(100);
        sg.print("READ ME: Would you like to choose the postions of the houses?  Then type 'm'  || Or would you like them chosen at random?  Then type 'r'");
        if (sg.keyReadChar() == 'r'){
            sg.print("Click \"Add House Randomly\" button to add a house in a random postion.  When you've added 10 houses, click \"traverse\" to traverse through the houses");
            sg.labelButton1("Add House Randomly");
            sg.labelButton2("TRAVERSE");
        }
        else{
            sg.labelButton2("TRAVERSE");
            sg.print("Click on a spot on the screen to draw a house");
            sg.registerToMouse(this);     
        }     
        
    }
    
    public static void main(String[] args) {
        
        new ANewWorld();         
    }
    
    private static void drawRiver(SimpleGUI sg){
        
        sg.drawFilledBox(0, 300, 1500, 50, Color.blue, 1, "river");
        for (int i = 0 ; i< 20; i ++){
            int x = (int) ((Math.random()) * 1500);
            int y = (int) (((Math.random())* 45) + 300);
            sg.drawFilledBox(x, y, 5, 1, Color.white, 1, "river current");
        }
        
        Color coral = new Color (220 , 20, 60);
        sg.drawFilledEllipse(0, 310, 90, 40, Color.red, 1, "boat");
        sg.drawFilledBox(0, 310, 90, 15, Color.blue, 1, "boat");
        sg.drawFilledBox(60, 280, 10, 45, Color.ORANGE, 1  , "boat");
        sg.drawFilledBox(60, 270, 45, 20, Color.white, 1, "boat");
        sg.drawBox(60, 270, 45, 20, Color.black, 1, 1, "boat");
        sg.drawFilledBox(60, 277    , 45, 7, Color.black, 1, "boat");
        sg.drawFilledBox(80, 270, 7, 20, Color.black, 1, "boat");
        
        sg.drawFilledBox(0, 300, 50, 50, Color.green, 1, "pipe");
        sg.drawBox(0, 300, 50, 50);
        
        sg.drawFilledBox(50, 290, 30, 70, Color.green, 1, "pipe");
        sg.drawBox(50, 290, 30, 70);
    }
    
    private static void drawShip(SimpleGUI sg){
        int x = (int) ((Math.random()) * 1200);
        int y = (int) ((Math.random()) * 100) + 20;
        
        sg.drawFilledEllipse(x- 60, y + 7, 100, 50, Color.red, 1, "ship");
        sg.drawFilledEllipse(x - 50, y + 12, 100, 40, Color.orange, 1, "ship"); 
        sg.drawFilledEllipse(x- 40, y + 17, 100, 30, Color.yellow, 1, "ship");
        
        sg.drawFilledBox(x, y-30, 30, 30, Color.white, 1, "ship");
        sg.drawBox(x, y -30, 30, 30, Color.BLACK, 1, 1, "ship");
        
        sg.drawFilledBox(x+200, y + 35, 30, 35, Color.white, 1, "ship");
        sg.drawBox(x+ 200, y +35, 30, 35, Color.black, 1, 1, "ship");
        
        sg.drawFilledEllipse(x+150, y -50, 30, 100, Color.white, 1, "ship");
        sg.drawEllipse(x + 150, y-50, 30, 100, Color.black, 1, 1, "ship");
        
        sg.drawFilledEllipse(x+ 150, y + 20, 30 , 100, Color.white, 1, "ship");
        sg.drawEllipse(x+150, y + 20, 30, 100, Color.black, 1 ,1, "ship");
        
        sg.drawFilledBox(x, y, 200, 70, Color.white, 1, "ship");
        sg.drawBox(x, y, 200, 70, Color.black, 1, 1, "ship");
        int j = 15;
        for ( int k = 0; k < 7; k++, j+=25){
            sg.drawFilledEllipse(x + j, y + 15, 15, 30, Color.black, 1, "ship");
            
            Color tan = new Color(210, 200, 140);
            sg.drawFilledEllipse(x+ j + 2, y + 25, 9, 9, tan, 1, "ship");
            sg.drawEllipse(x + j + 2, y + 25, 9, 9, Color.black, 1, 1, "ship");
                    
            sg.drawFilledBox(x + j + 6, y + 30, 3, 15, tan, 1, "ship");//body
            
            sg.drawFilledBox(x + j + 2, y +33, 5, 3, tan, 1, "ship");//arm
            sg.drawDot(x + j + 4, y + 28, 1.3, Color.black ,1, "ship"); //left eye
            sg.drawDot(x + j + 8, y + 28, 1.3, Color.black, 1, "ship");
            
        }
    }
    
    private static void drawClouds(SimpleGUI sg){
        sg.drawFilledEllipse(-60, -60, 120, 120, Color.yellow, 1, "sun");
        sg.drawFilledEllipse(-60, -60, 125, 125, Color.yellow, 0.5, "sun");
        
        
        sg.drawDot(10, 10, 8, Color.black, 1, "sun");
        sg.drawDot(30, 10, 8, Color.black, 1, "sun");
        sg.drawFilledBox(0, 0, 50, 10, Color.yellow, 1, "sun");
        
        /* sun face for next 3 methods */
        sg.drawLine(10, 33, 30, 33, 3);
        sg.drawLine(10, 33, 5, 30, 3);
        sg.drawLine(30, 33, 35, 30, 3);
        
        Color moonHelp = new Color ( 0 ,0 , 110);
        sg.drawFilledEllipse(1335, 0, 100, 100, Color.white, 1, "moon");
        sg.drawFilledEllipse(1345, -5, 100, 100, moonHelp, 1, "moon");
        
        
        
        //sg.drawFilledEllipse(10, 20, 20, 20, Color.black, 1, "sun");
        
        for (int i = 0; i < (((Math.random())* 2) + 2); i++) //between 2 to 5 clouds
        {
            int x = (int) ((Math.random()) * 1500);
            int y = (int) ((Math.random()) * 200);
            double transparency = Math.random();
            if (transparency < 0.7)
                transparency = 0.7;
            if (transparency > 0.9)
                transparency = 0.9;
            sg.drawFilledEllipse(x, y, ((Math.random()) * 300) + 200, 75 + ((Math.random()) * 100), Color.white, transparency, "cloud");

        }
        
        
    }
    
    private static void drawBirds(SimpleGUI sg) // i dont use a for loop here so i can access each indivudall later
    {
        
//                for (int i = 0; i < (((Math.random())* 3) + 2); i++) //between 2 to 5 clouds
//        {
//            int x = (int) ((Math.random()) * 1500);
//            int y = (int) ((Math.random()) * 200);
//            sg.drawLine(x, y, x +4, y +4, Color.white, 1, 3, "bird1");
//            sg.drawLine(x+ 4, y +4, x, y+ 8, Color.white, 1, 3, "bird1");
//
//        }
        int x = (int) ((Math.random()) * 1500);
        int y = (int) ((Math.random()) * 200);
        sg.drawFilledEllipse(x, y, 10, 5, Color.white, 1, "bird1");
        sg.drawFilledEllipse(x + 7, y+ 2, 2, 4, Color.white, 1, "bird1");
        sg.drawFilledEllipse(x + 7, y, 2, 4, Color.white, 1, "bird1");
        //sg.drawLine(x, y, x +4, y +4, Color.white, 1, 3, "bird1");
        //sg.drawLine(x+ 4, y +4, x, y+ 8, Color.white, 1, 3, "bird1");
        x = (int) ((Math.random()) * 1500);
        y = (int) ((Math.random()) * 200);
        sg.drawFilledEllipse(x, y, 10, 5, Color.white, 1, "bird2");
        sg.drawFilledEllipse(x + 7, y+ 2, 2, 4, Color.white, 1, "bird2");
        sg.drawFilledEllipse(x + 7, y, 2, 4, Color.white, 1, "bird2");

        //sg.drawLine(x, y, x +4, y +4, Color.white, 1, 3, "bird2");
        //sg.drawLine(x+ 4, y +4, x, y+ 8, Color.white, 1, 3, "bird2");
        x = (int) ((Math.random()) * 1500);
        y = (int) ((Math.random()) * 200);
        sg.drawFilledEllipse(x, y, 10, 5, Color.white, 1, "bird3");
        sg.drawFilledEllipse(x + 7, y+ 2, 2, 4, Color.white, 1, "bird3");
        sg.drawFilledEllipse(x + 7, y, 2, 4, Color.white, 1, "bird3");

        //sg.drawLine(x, y, x +4, y +4, Color.white, 1, 3, "bird3");
        //sg.drawLine(x+ 4, y +4, x, y+ 8, Color.white, 1, 3, "bird3");
        x = (int) ((Math.random()) * 1500);
        y = (int) ((Math.random()) * 200);
        sg.drawFilledEllipse(x, y, 10, 5, Color.white, 1, "bird4");
        sg.drawFilledEllipse(x + 7, y+ 2, 2, 4, Color.white, 1, "bird4");
        sg.drawFilledEllipse(x + 7, y, 2, 4, Color.white, 1, "bird4");
                
        //sg.drawLine(x, y, x +4, y +4, Color.white, 1, 3, "bird4");
        //sg.drawLine(x+ 4, y +4, x, y+ 8, Color.white, 1, 3, "bird4");
    }
    
    private static void drawSignPost(SimpleGUI sg, House h){
      
        Color matchBackground = new Color (0,100,0);
        Color tan = new Color(210, 200, 140);
        
        int x = h.xPos + h.WIDTH;
        int y = h.yPos + h.HEIGHT - 50;
        
        sg.drawFilledBox(x, y, 70, 35, tan, 1, "signpost"); //x, y 

        sg.drawLine(x + 45, y -10, x + 80, y + 20, matchBackground, 1, 20, "signpost"); // x + 45, y -10, x + 80, y + 20
        sg.drawLine(x + 35, y +50, x + 80, y + 20, matchBackground, 1, 20, "signpost"); // x + 35, y +50, x + 80, y + 20
        
        sg.drawFilledBox(x + 25, y + 35, 10, 40, tan, 1, "signpost"); //x + 25 y + 35
        
        sg.drawText("welcom", x + 5, y + 20, Color.red, 1, "signpost"); //x + 5 y + 20
        
    }
    
    private static void drawLake(SimpleGUI sg){
        int x = (int) ((Math.random()) * (sg.getWidth() - 100));
        int y = (int) ((Math.random()) * (sg.getWidth() - 50));
        sg.drawFilledEllipse(x, y, 200, 100 , Color.blue, 1, "lake");
        //for(int x1 = x + 30, int y1 = y + 30; x1 < x+ 200 && y1 < y + 100; x1 += 20,)
//        sg.drawLine(x + 30, y + 30, x+35, y + 30, Color.white   , 1, 2, "wave");
//                sg.drawLine(x + 50, y + 50, x+55, y + 55, Color.white   , 1, 2, "wave");
//                        sg.drawLine(x + 30, y + 70, x+35, y + 75, Color.white   , 1, 2, "wave");
//                                sg.drawLine(x + 70, y + 30, x+75, y + 30, Color.white   , 1, 2, "wave");
//                                        sg.drawLine(x + 100, y + 30, x+105, y + 30, Color.white   , 1, 2, "wave");
//                                                sg.drawLine(x + 120, y + 30, x+125, y + 30, Color.white   , 1, 2, "wave");
//                                                        sg.drawLine(x + 120, y + 70, x+125, y + 75, Color.white   , 1, 2, "wave");






    }
    
    private static void drawTrees(SimpleGUI sg){
        Color choc = new Color (210, 105, 30);
        for (int j = 0; j< 3 * sg.getWidth(); j+= 50){
            sg.drawFilledBox(j+ 25, 170, 20, 100, choc, 1, "trunk");
            sg.drawFilledEllipse(j + 29, 200, 5, 10);
            sg.drawFilledEllipse(j + 35, 200, 5, 10);
            
            double random = Math.random();
            
            sg.drawFilledEllipse(j + 27, 215, 15, 10);
            sg.drawFilledBox(j + 27, 215, 15, 5, choc, 1    , "face");
//            if (random < 0.3333333) //exclamation
//            {
//                sg.drawFilledEllipse(j + 27, 215, 15, 10);
//            }
//            
//            else if (random > 0.66666666)//smile
//            {
//                sg.drawFilledEllipse(j + 27, 215, 15, 10);
//                sg.drawFilledBox(j + 27, 215, 15, 5, choc, 1    , "face");
//            }
//            else //frown
//            {
//                sg.drawFilledEllipse(j + 27, 220, 15, 10);
//                sg.drawFilledBox(j + 27, 225, 15, 5, choc, 1, "face");
//            }

            sg.drawFilledEllipse(j -15,150 , 100, 30, Color.green, 1, "canopy");
            sg.drawEllipse(j -15,150 , 100, 30);
            drawSquirrels(sg, j + 25, (int)(((Math.random()) * 50))); 
        }
//        for(int i = 0; i < 7; i ++){
//        int x = (int) ((Math.random()) * (sg.getWidth() - 50 + 200));
//        int y = (int) ((Math.random()) * (sg.getHeight() - 100 + 200));
//        sg.drawFilledBox((x+50/2) + 20, y + 20, 20, 100, Color.ORANGE, 1, "trunk");
//        sg.drawFilledEllipse(x, y, 100, 30, Color.green, 1, "canopy");
//        }
    }
    
    private static void drawSquirrels(SimpleGUI sg, int x, int y){
            //sg.drawFilledEllipse(x + 20, y, 10, 10, Color.yellow, 1, "squirrel1");
            //sg.drawFilledEllipse(x + 20, y, 5, 20, Color.yellow, 1, "squirrel1");
            Color brown = new Color (150 , 75 ,0);
            sg.drawFilledEllipse(x -10, y + 70, 7, 7, brown, 1, "squirrel2");
            sg.drawFilledEllipse(x-10, y + 77, 10, 20, brown, 1, "squirrel2");
            sg.drawFilledEllipse(x, y + 87, 8, 3, brown, 1, "squirrel2");
            sg.drawFilledEllipse(x, y + 92, 8, 3, brown, 1, "squirrel2");
            sg.drawFilledEllipse(x -17, y + 92, 15 , 5 , brown, 1, "squirrel2");
            //sg.drawLine(x - 8, y + 125, x - 14 ,y + 131 , brown, 1, 4, "squirreltail");
            
    }
    
    private static void drawSky(SimpleGUI sg){
        int k = 0;
        for (int i = 1; i <= 150; i ++, k+= 10){
            int green;
            if (i < 125){
                green = 256 - (2* i);
            }
            else
                green = 0;
            
            Color sky = new Color(0, green, 255 - i);
            sg.drawFilledBox(k, 0, 10 , 200, sky, 1, "sky");
        }
        
//        drawCastle(sg, 200, Color.black);
//        drawCastle(sg, 600, Color.gray);
//        drawCastle(sg, 1000, Color.white);
        
//        for (int i = 0; i < 3; i++){
//            drawCastle(sg, 0 + (i *540), Color.gray);
//            drawCastle(sg, 180  + (i *540), Color.gray);
//            drawCastle(sg, 360 + (i *540), Color.gray);
//        }
        drawPrism(sg, 650, 95);
        drawCastle(sg);
       


    }
    
    private static void drawCastle(SimpleGUI sg){
        
        sg.drawFilledBox(0, 130, 1500, 100, Color.gray, 1, "castle");
        Color colorGreen = new Color (0, 100, 0);
        Color colorBlue = new Color (0,0,0);
        for (int i = 0; i < 7; i ++)
        
        {
         
            colorBlue = new Color (0 ,210 - (30 * i) ,255 - (15 * i));
            sg.drawFilledEllipse(50 + (i * 200), 185, 150, 100, colorBlue, 1, "castle");
            
            sg.drawFilledBox(50 + (i * 200), 230, 150, 70, colorGreen, 1, "castle");
            
        }
        
        for (int j = 0; j < 100; j++){
            
            sg.drawFilledBox(j *50, 110, 30, 30, Color.gray, 1, "castle");
        }
        
    }
    
    private static void drawPrism(SimpleGUI sg, int x, int y){
        sg.drawLine(x, y, x + 100, y, Color.white, 1, 2, "triangle"); //bottom
        sg.drawLine(x+ 100, y, x + 50, y - Math.sqrt(7500), Color.white, 1, 2, "triangle"); //right side 
        sg.drawLine(x, y, x + 50, y - Math.sqrt(7500), Color.white, 1, 2, "triangle"); //left side
        
        sg.drawLine(x - 220, y +50, x + 50, y - ((Math.sqrt(7500))/2), Color.white , 1, 2, "triangle");
        
        for (int i = 0; i < 8; i ++){
            sg.drawLine(x + 30, y - ((Math.sqrt(7500))/2) + 7, x + 50, y - ((Math.sqrt(7500))/2) - 10 + (i * 3), Color.white, 1, 2, "triangle");
            switch (i)
            {
                case 0:
                    sg.drawLine(x + 70 + (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.red, 1, 2, "triangle");
                    break;
                case 1:
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.orange, 1, 2, "triangle");
                    break;
                case 2:                    
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.yellow, 1, 2, "triangle");
                    break;
                case 3:                    
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.green, 1, 2, "triangle");
                    break;
                case 4:
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.blue, 1, 2, "triangle");
                    break;
                case 5:
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.cyan, 1, 2, "triangle");
                    break;
                case 6:
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.magenta, 1, 2, "triangle");
                    break;
                case 7:                    
                    sg.drawLine(x + 70+ (1.3 *i), y - ((Math.sqrt(7500))/2) - 10 + (i * 3) , x + 300, y + 50, Color.pink, 1, 2, "triangle");
                    break;
            }
        }     
    }
    
    private static void drawWLeaves(SimpleGUI sg, int x1, int y1, int x2, int y2){
        int width = Math.abs(x1 - x2);
        int dx = width/50;
        
        for (int i = 1 ; i < 5; i ++){
            sg.drawLine(x1 + (i * dx), y1 + i, x2 - (i * dx), y2 + i, Color.GREEN, 1, 1, null);
            sg.drawLine(x1 + (i * dx), y1 - i, x2 - (i * dx), y2 - i, Color.GREEN, 1, 5, null);
        }
    }
    
    private static void drawW(SimpleGUI sg, int x1, int y1, int x2, int y2){
        for (int i = 0 ; i < 5; i ++){
            
        }
    }
}
    