import javax.swing.*;
public class GUI{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Lets Gooo");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // absolute positioning

        // text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 25);

        // button
        JButton button = new JButton("Click Me");
        button.setBounds(180, 20, 90, 25);

        // label
        JLabel label = new JLabel("What is your name?");
        label.setBounds(20, 60, 250, 25);

        // Add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        //Makes the button functional
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello," + name + " hows it going?");
        });

        //Coloring the UI
        frame.getContentPane().setBackground(java.awt.Color.DARK_GRAY);
        button.setBackground(java.awt.Color.RED);
        button.setForeground(java.awt.Color.BLACK);
        label.setForeground(java.awt.Color.WHITE);

        frame.setVisible(true);//See the interface(Make sure you're not running in a virtual environment)
        
    }
}
