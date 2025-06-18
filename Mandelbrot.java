import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*; 

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

                Color color = getColor(iterations); 
                mandelbrotImage.setRGB(x, y, color.getRGB()); 
            }
        }
    }

    private Color getColor(int iterations){
        if(iterations == MAX_ITERATIONS){
            return Color.BLACK; 
        }

        float hue = (float) iterations/MAX_ITERATIONS; 
        return Color.getHSBColor(hue*0.8f, 1.0f, 1.0f); 
    }

    private int calculate(double real, double imaginary){
        double real2 = 0; 
        double imaginary2 = 0; 
        int iterations = 0; 

        while(iterations < MAX_ITERATIONS){
            //z^2 + c
            double newReal = real2 * real2 - imaginary2*imaginary2+ real; 
            double newImaginary = 2*real2 *imaginary2+imaginary; 

            if(newReal * newReal + newImaginary*newImaginary > 4){
                break; 
            }

            real2 = newReal; 
            imaginary2 = newImaginary; 
            iterations++; 
        }

        return iterations; 
    }
    
    public static void main(String[] args){
        Mandelbrot mandelbrot = new Mandelbrot(); 
    }

    public void paint(Graphics g){
        g.drawImage(mandelBrotImage, 0, 0, null); 
        
    }
}