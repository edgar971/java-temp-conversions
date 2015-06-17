import javax.swing.*;

/**
 * Created by edgar971 on 6/16/15.
 */
public class Fahrenheit {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fahrenheit Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FahrenheitPanel calculatorPanel = new FahrenheitPanel();

        frame.getContentPane().add(calculatorPanel);
        frame.pack();
        frame.setVisible(true);

    }

}
