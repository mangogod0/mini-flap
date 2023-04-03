import javax.swing.*;

import java.awt.*;

import java.awt.image.BufferedImage;

import java.awt.event.*;

 

 

public class Game  extends JPanel implements Runnable, KeyListener{

 

               

                private BufferedImage back;

                private int key, lives;

         

                private String guesses;

               

               

                public Game() {

                                new Thread(this).start();             

                                this.addKeyListener(this);

                                key =-1;

                                lives=6;

                         
                                guesses = "";

                               

                }

 

               

               

                public void run()

                   {

                                try

                                {

                                                while(true)

                                                {

                                                   Thread.currentThread().sleep(5);

                            repaint();

                         }

                      }

                                                catch(Exception e)

                      {

                      }

                                }

               

 

               

               

               

                public void paint(Graphics g){

                               

                                Graphics2D twoDgraph = (Graphics2D) g;

                                if( back ==null)

                                                back=(BufferedImage)( (createImage(getWidth(), getHeight())));

                               

 

                                Graphics g2d = back.createGraphics();

               

                               

                                g2d.clearRect(0,0,getSize().width, getSize().height);

                               

                                g2d.setFont(new Font ("Times", Font.BOLD, 50));

                             

                               

                                g2d.setFont(new Font ("Lora", Font.BOLD, 100));

                               

                             

                               

                                g2d.setColor(Color.white);

                              
                                twoDgraph.drawImage(back, null, 0, 0);

 



                }

               

                public void drawCircle (Graphics g2d)

                {                             

                     

                                }             

                

               

                @Override

                public void keyTyped(KeyEvent e) {

                                // TODO Auto-generated method stub

                               

                }

 

 

                @Override

                public void keyPressed(KeyEvent e) {

                                // TODO Auto-generated method stub

                               

                                key= e.getKeyCode();

                                System.out.println(key);

                                char c= e.getKeyChar();

                                System.out.println(Character.toUpperCase(c));

                               

                                      

                                                guesses="";

                                                lives=6;

                               

                                }

                

                public void guesses (char c) {

                                boolean contains = true;

                                for (int i=0; i<guesses.length(); i++) {

                                                if (c==guesses.charAt(i)) {

                                                                contains = false;

                                                }

                                }

                                if(contains) {

                                                guesses+= c + " ";

                                                lives--;

                                               

                                }

                }

                                             


                @Override

                public void keyReleased(KeyEvent e) {

               

                               

                               

                }

               


}
