package com.example.piechart;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
/**
 * PieChart.java
 * <P> Draw a Pie Chart of students grades with Java. </p>
 * Date: 2019-08-19
 * Time: 4:25 PM
 * Package: com.example.piechart
 *
 * @author Mohamad Jayyusi - https://github.com/jayyusi
 * @version 1.0
 */
public class PieChart extends JPanel {

    private int frameWidth = 500;
    private int frameHeight = 400;

    //Define starting points for drawing , pie radius, and the starting angle.
    private int xStartPoint = 100;
    private int yStartPoint = 100;
    private int startAngle = 0;
    private int radius = 100;

    private int titleXPoint = 25;
    private int titleYPoint = 25;

    //Define the number of students for each grade
    private int gradeA = 20;
    private int gradeB = 30;
    private int gradeC = 35;
    private int gradeD = 10;
    private int gradeF = 5;

    public void paint(Graphics g){

        //Title
        String title = "Pie Chart ";
        g.setFont(Font.getFont(Font.SERIF));
        g.drawString(title, titleXPoint, titleYPoint);

        //Draw Arc for Grade A
        g.setColor(Color.BLACK);
        g.fillArc(xStartPoint,yStartPoint,2*radius,2*radius,startAngle,getAngleLength(gradeA));
        startAngle+= getAngleLength(gradeA);

        //Draw Arc for Grade B
        g.setColor(Color.DARK_GRAY);
        g.fillArc(xStartPoint,yStartPoint,2*radius,2*radius,startAngle,getAngleLength(gradeB));
        startAngle+= getAngleLength(gradeB);

        //Draw Arc for Grade C
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(xStartPoint,yStartPoint,2*radius,2*radius,startAngle,getAngleLength(gradeC));
        startAngle+= getAngleLength(gradeC);

        //Draw Arc for Grade D
        g.setColor(Color.gray);
        g.fillArc(xStartPoint,yStartPoint,2*radius,2*radius,startAngle,getAngleLength(gradeD));
        startAngle+= getAngleLength(gradeD);

        //Draw Arc for Grade F
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(xStartPoint,yStartPoint,2*radius,2*radius,startAngle,getAngleLength(gradeF));
        startAngle+= getAngleLength(gradeF);

    }

    public int getAngleLength(int grade){
        int length = (int) ((grade / 100.0 ) * 360);
        return length;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }

    public static void main(String[] args) {
        PieChart PC = new PieChart();

        JFrame frame = new JFrame();
        frame.getContentPane().add(PC);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(PC.getFrameWidth(), PC.getFrameHeight());
        frame.setVisible(true);

    }
}
