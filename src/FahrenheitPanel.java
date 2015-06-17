import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by edgar971 on 6/16/15.
 */
public class FahrenheitPanel extends JPanel {
    private JLabel inputLabel, outputLabel, resultLabel;
    private JButton convertBtn;
    private JTextField fahrenheitField;

    //Constructor: Set up GUI items.
    public FahrenheitPanel() {
        //Labels
        inputLabel = new JLabel("Enter Fahrenheit temperature: ");
        outputLabel = new JLabel("Temperature in Celsius:");
        resultLabel = new JLabel("----");
        convertBtn = new JButton("Convert");



        //text fields that accepts 5 characters
        fahrenheitField = new JTextField(5);
        //add event listener to the text field and button
        fahrenheitField.addActionListener(new TempListener());
        convertBtn.addActionListener(new TempListener());


        //add GUI items to panel
        add(inputLabel);
        add(fahrenheitField);
        add(outputLabel);
        add(resultLabel);
        add(convertBtn);
        //set window size
        setPreferredSize(new Dimension(300,100));

        //set background color
        setBackground(Color.orange);

    }

    private class TempListener implements ActionListener {
        //Performs temp conversion when the event is called
        public void actionPerformed(ActionEvent event) {
            //temp variables
            int fahrenheitTemp, celsiusTemp;

            //get text from text box
            String text = fahrenheitField.getText();

            //convert text box input to int
            fahrenheitTemp = Integer.parseInt(text);

            //calculate the celsius
            celsiusTemp = (fahrenheitTemp-32) * 5/9;

            //output result to label
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}
