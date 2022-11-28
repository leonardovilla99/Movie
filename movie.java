import javax.swing.*;
import java.awt.event.*;

/**
 * movie
 */
public class movie extends JFrame{
    // Object
    public JPanel panel;
    public JTextField children, adult, childrenPrice, adultPrice;
    public JLabel childrenText, childrenPriceText, adultText, adultPriceText;
    public JButton calculate;

    public static void main(String[] args) {
        new movie();
    }

    public movie(){
        setTitle("Movie");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        moviePanel();
        add(panel);
    }

    public void moviePanel(){
        panel = new JPanel();
        childrenText = new JLabel("How many Children are attending the show?");
        children = new JTextField(3);
        childrenPriceText = new JLabel("How much is it for one child ticket?");
        childrenPrice = new JTextField(5);
        adultPriceText = new JLabel("How much is it for one adult ticket?");
        adultPrice = new JTextField(5);
        adultText = new JLabel("How many Adults are attending the show?");
        adult = new JTextField(3);
        calculate = new JButton("Calculate");
        calculate.addActionListener(new Listener());
        panel.add(childrenText);
        panel.add(children);
        panel.add(childrenPriceText);
        panel.add(childrenPrice);
        panel.add(adultPriceText);
        panel.add(adultPrice);
        panel.add(adultText);
        panel.add(adult);
        panel.add(calculate);
    }

    // Action listener
    private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            String cPrice = childrenPrice.getText();
            double CHILD = Double.parseDouble(cPrice);
            String aPrice = adultPrice.getText();
            double ADULT = Double.parseDouble(aPrice);
            String c = children.getText();
            String a = adult.getText();
            int Children = Integer.parseInt(c);
            int Adult = Integer.parseInt(a);
            double cGross = Children * CHILD;
            double aGross = Adult * ADULT;
            double gross = cGross + aGross;
            double chinet = cGross * 0.20;
            double adunet = aGross * 0.20;
            double TOTAL = chinet + adunet;
            JOptionPane.showMessageDialog(null, TOTAL);
		}
		
	}
}