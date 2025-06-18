import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage; 

public class Mandelbrot extends JFrame{

    public static final int WIDTH = 800; 
    public static final int HEIGHT = 800; 

    private BufferedImage mandelBrotImage;

    public Mandelbrot(){
        setTitle("Mandelbrot Set"); 
        setSize(WIDTH, HEIGHT); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setResizable(false);  
    }

    private void generateMandelbrotSet(){
        mandelBrotImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }
    
    public static void main(String[] args){
        Mandelbrot mandelbrot = new Mandelbrot(); 
    }

    public void paint(Graphics g){
        g.drawImage(); 
    }
}