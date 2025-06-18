import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Mandelbrot extends JFrame{

    public static final int WIDTH = 800; 
    public static final int HEIGHT = 800; 

    public Mandelbrot(){
        JFrame frame = new JFrame("Mandelbrot set"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); 
        frame.setVisible(true); 
    }
    public static void main(String[] args){
        Mandelbrot mandelbrot = new Mandelbrot(); 
    }

    public void paint(Graphics g){
        g.drawImage(); 
    }
}