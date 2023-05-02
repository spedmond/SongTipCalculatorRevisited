import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TipCalculatorGUI extends JFrame implements ActionListener, KeyListener {
    private JTextArea peopleInput;
    private JPanel panel1;
    private JButton peopleSubtract;
    private JButton percentAdd;
    private JTextArea billInput;
    private JButton percentSubtract;
    private JTextArea tipOutput;
    private JTextArea totalOutput;
    private JButton peopleAdd;
    private JTextArea tipInput;

    public TipCalculatorGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel1);
        setTitle("Tip Calculator");
        setSize(300, 400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        peopleSubtract.addActionListener(this);
        peopleAdd.addActionListener(this);
        percentSubtract.addActionListener(this);
        percentAdd.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("- %")) {
                if (!tipInput.getText().equals("0")) {
                    tipInput.setText(Integer.parseInt(tipInput.getText())-1 + "");
                }
            }
            if (text.equals("+ %")) {
                if (!tipInput.getText().equals("100")) {
                    tipInput.setText(Integer.parseInt(tipInput.getText())+1 + "");
                }
            }

            if (text.equals("-")) {
                if (!peopleInput.getText().equals("0")) {
                    peopleInput.setText(Integer.parseInt(peopleInput.getText())-1 + "");
                }
            }
            if (text.equals("+")) {
                peopleInput.setText(Integer.parseInt(peopleInput.getText())+1 + "");
            }
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e){}

    public void keyReleased(KeyEvent e){}


}
