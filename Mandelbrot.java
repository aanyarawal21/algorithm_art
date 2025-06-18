import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage; 

public class Mandelbrot extends JFrame{

    public static final int WIDTH = 800; 
    public static final int HEIGHT = 800; 

    private int MAX_ITERATIONS = 100; 

    private BufferedImage mandelBrotImage;

    public Mandelbrot(){
        setTitle("Mandelbrot Set"); 
        setSize(WIDTH, HEIGHT); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setResizable(false);  

        generateMandelbrotSet();
        setLocationRelativeTo(null);
        setVisible(true); 
    }

    private void generateMandelbrotSet(){
        mandelBrotImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        double xMin = -2.5, xMax = 1.5; 
        double yMin = -2.0, yMax = 2.0; 

        for(int x = 0; x< WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                double real = xMin + (xMax - xMin)*x/WIDTH; 
                double imaginary = yMin + (yMax - yMin)*y/HEIGHT; 

                int iterations = calculate(real, imaginary); 
            }
        }
    }

    private int calculate(double real, double imaginary){
        double real2 = 0; 
        double imaginary2 = 0; 
        int iterations = 0; 

        while(iterations < MAX_ITERATIONS){
            //z^2 + c
            
        }

    }
    
    public static void main(String[] args){
        Mandelbrot mandelbrot = new Mandelbrot(); 
    }

    public void paint(Graphics g){
        g.drawImage(); 
    }
}