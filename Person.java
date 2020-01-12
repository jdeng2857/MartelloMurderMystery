import java.awt.Image;

import javax.swing.*;

public class Person extends JLabel{
    public int xpos;
    public int ypos;
    public String name;
    public Person(){
        this("", 0 ,0);
    }
    public Person(String n, int x, int y){
        name = n;
        xpos = x;
        ypos = y;
        /*switch(name){
            case "Veronica":
                Image icon1 = new ImageIcon(this.getClass().getResource("red.png")).getImage();
                this.setIcon(new ImageIcon(icon1));
                break;

            case "Jason":
                Image icon2 = new ImageIcon(this.getClass().getResource("/blue.png")).getImage();
                this.setIcon(new ImageIcon(icon2));
                break;

            case "Thomas":
                Image icon3 = new ImageIcon(this.getClass().getResource("yellow.png")).getImage();
                this.setIcon(new ImageIcon(icon3));

            case "Rob":
                Image icon4 = new ImageIcon(this.getClass().getResource("green.png")).getImage();
                this.setIcon(new ImageIcon(icon4));

            case "Kristian":
                Image icon5 = new ImageIcon(this.getClass().getResource("orange.png")).getImage();
                this.setIcon(new ImageIcon(icon5));

            case "MarcAndre":
                Image icon6 = new ImageIcon(this.getClass().getResource("purple.png")).getImage();
                this.setIcon(new ImageIcon(icon6));

            case "Dave":
                Image icon7 = new ImageIcon(this.getClass().getResource("brown.png")).getImage();
                this.setIcon(new ImageIcon(icon7));

            case "Salina":
                Image icon8 = new ImageIcon(this.getClass().getResource("pink.png")).getImage();
                this.setIcon(new ImageIcon(icon8));

            case "Harrison":
                Image icon9 = new ImageIcon(this.getClass().getResource("black.png")).getImage();
                this.setIcon(new ImageIcon(icon9));
        }*/
    }
}
