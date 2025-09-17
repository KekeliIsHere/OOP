import javax.swing.*;
public class GUI{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Lets Gooo");
        frame.setSize(950, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // absolute positioning

        // labels        
        JLabel question = new JLabel("What is your name?");
        question.setBounds(20, 20, 250, 25);

        JLabel label = new JLabel("");
        label.setBounds(20, 100, 250, 25);

        JLabel recommendation = new JLabel("This is a my first GUI project but I hope to become way better in the future");
        recommendation.setBounds(20, 120, 1000, 25);


        // text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 60, 150, 25);

        // button
        JButton button = new JButton("Click Me");
        button.setBounds(180, 60, 90, 25);

      
        // Add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.add(question);
        frame.add(recommendation);

        //Makes the button functional
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello," + name + " hows it going?");
        });

        //Coloring the UI
        frame.getContentPane().setBackground(java.awt.Color.DARK_GRAY);
        button.setBackground(java.awt.Color.GRAY);
        button.setForeground(java.awt.Color.BLACK);
        label.setForeground(java.awt.Color.WHITE);
        question.setForeground(java.awt.Color.WHITE);
        recommendation.setForeground(java.awt.Color.WHITE);

        frame.setVisible(true);//See the interface(Make sure you're not running in a virtual environment)
        
    }
}
