/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Paint;
/**
 *
 * @author jordi
 */
public class Dibujo extends Applet {

    public void paint (Graphics g){
        Color cafe=new Color(128,64,0);
        Color piel=new Color(226,188,157);
        g.setColor(Color.gray);
        Font f = new Font(Font.SANS_SERIF,Font.BOLD,20);
        g.setFont(f);
        g.drawString("JORDI AUGUSTO GONZALEZ QUINTAL 5090-18-5206", 50, 25);
        g.setColor(Color.BLACK);
        //CARA
        g.setColor(cafe);
        g.fillOval(100,100, 450, 450);
        g.setColor(Color.BLACK);
        g.drawOval(100,100, 450, 450);
        //OREJAS
        g.setColor(cafe);
        g.fillOval(65,100,100,100);
        g.fillOval(485,100,100,100);
        g.setColor(Color.BLACK);
        g.drawOval(65,100,100,100);
        g.drawOval(485,100,100,100);
        //OJOS
         g.setColor(Color.WHITE);
        g.fillOval(150,150,205,205);
        g.fillOval(300,150,205,205);
        g.setColor(Color.BLACK);
        g.drawOval(150,150,205,205);
        g.drawOval(300,150,205,205);
        g.setColor(Color.WHITE);
        g.fillOval(275,183,100,140);
        //Boca
        g.setColor(piel);
        g.fillOval(200, 300, 250, 250);
        g.setColor(Color.BLACK);
        g.drawOval(200 , 300 , 250 , 250);
        //nariz
        g.drawArc(203, 400, 245, 85 , 0, -180);
        g.drawLine(325, 485, 325, 376);
        g.drawOval(287, 301, 75, 75);
        //Pupilas
        g.fillOval(240, 205, 50, 75);
        g.fillOval(360, 205, 50, 75);
    } 
    
}
