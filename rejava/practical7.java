import javax.swing.*;
import java.awt.*;

class Test extends JFrame {

    public Test() {
        Container c = getContentPane();
        FlowLayout layout = new FlowLayout();
        c.setLayout(layout);

        JLabel label1 = new JLabel("First Name");
        JLabel label2 = new JLabel("Last Name");
        JLabel label3 = new JLabel("Address");

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        JTextArea textArea = new JTextArea(3, 10);

        JButton button1 = new JButton("Submit");
        JButton button2 = new JButton("Clear");

        c.add(label1);
        c.add(textField1);
        c.add(label2);
        c.add(textField2);
        c.add(label3);
        c.add(textArea);
        c.add(button1);
        c.add(button2);
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.setSize(300, 300);
        t.setTitle("My Swing App");
        t.setVisible(true);
    }
}
