import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class javafirstGUI
{
    public static void main(String[] args) 
    {

        JFrame f = new JFrame("A JFrame");

        JFrame buttons = new JFrame("A JFrame");
        
        f.setSize(250, 250);//Sets size of Window
        f.setLocation(960,540);//Sets location of window at launch

        buttons.setSize(250,250);//Sets size of window that contains the buttons
        buttons.setLocation(1200,540);//Sets location of window that contains buttons
        
        final JTextArea textArea = new JTextArea(10, 40);//Creates a text area
        f.getContentPane().add(BorderLayout.CENTER, textArea);//Puts the text area the center of the box
        
        final JButton southButton = new JButton("Click Me");//Creates a button
        buttons.getContentPane().add(BorderLayout.SOUTH, southButton);//Locates the button to the bottom of the box

        final JButton eastButton = new JButton("Also Click me");//Creates an additional button
        buttons.getContentPane().add(BorderLayout.EAST, eastButton);
        
        southButton.addActionListener(new ActionListener() {//Adds action to the button
    
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);
                textArea.append("Button was clicked\n");//Text area will say "Button was clicked" when button is hit
    
            }
        });

        eastButton.addActionListener(new ActionListener() {//Adds action to the button
    
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);
                textArea.append("Other button was clicked\n");//Text area will say "Button was clicked" when button is hit
    
            }
        });
    
        f.setVisible(true);
        buttons.setVisible(true);

        //Test to see how this git push works
    
    }
}