import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{


    JFrame frame;
    private JPanel panel;
    private JTextField t1;
    private JButton plusbutton;
    private JButton minusbutton;
    private JButton multiplybutton;
    private JButton dividebutton;
    private double num1;
    private double num2;
    private char operator;


    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonClear;
    private JButton equalbutton;

    public void initComponents(){
        panel.setLayout(null);
        t1.setBounds(10, 10,310, 50);
        panel.add(t1);
        button7.setBounds(10,70,60,50);
        panel.add(button7);
        button8.setBounds(90,70,60,50);
        panel.add(button8);
        button9.setBounds(170,70,60,50);
        panel.add(button9);
        plusbutton.setBounds(257, 70, 60, 50);
        panel.add((plusbutton));

        button4.setBounds(10,140,60,50);
        panel.add(button4);
        button5.setBounds(90,140,60,50);
        panel.add(button5);
        button6.setBounds(170,140,60,50);
        panel.add(button6);
        minusbutton.setBounds(257, 140, 60, 50);
        panel.add(minusbutton);

        button1.setBounds(10,210,60,50);
        panel.add(button1);
        button2.setBounds(90,210,60,50);
        panel.add(button2);
        button3.setBounds(170,210,60,50);
        panel.add(button3);
        multiplybutton.setBounds(257,210, 60, 50);
        panel.add(multiplybutton);

        button0.setBounds(10,280, 60,50);
        panel.add(button0);
        buttonClear.setBounds(90,280, 60,50);
        panel.add(buttonClear);
        equalbutton.setBounds(170,280, 60,50);
        panel.add(equalbutton);

        dividebutton.setBounds(257, 280, 60, 50);
        panel.add(dividebutton);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1text = t1.getText() + button1.getText();
                t1.setText(b1text);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b2text = t1.getText() + button2.getText();
                t1.setText(b2text);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b3text = t1.getText() + button3.getText();
                t1.setText(b3text);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b4text = t1.getText() + button4.getText();
                t1.setText(b4text);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b5text = t1.getText() + button5.getText();
                t1.setText(b5text);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b6text = t1.getText() + button6.getText();
                t1.setText(b6text);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b7text = t1.getText() + button7.getText();
                t1.setText(b7text);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b8text = t1.getText() + button8.getText();
                t1.setText(b8text);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b9text = t1.getText() + button9.getText();
                t1.setText(b9text);
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b0text = t1.getText() + button0.getText();
                t1.setText(b0text);
            }
        });


        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(t1.getText());
                t1.setText("");
                operator = '+';
            }
        });

        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(t1.getText());
                t1.setText("");
                operator = '-';
            }
        });

        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(t1.getText());
                t1.setText("");
                operator = '*';
            }
        });

        dividebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(t1.getText());
                t1.setText("");
                operator = '/';
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
            }
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (operator == '+') {
                    num2 = num1 + Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(num2));
                    num1 = 0;
                } else if (operator == '-') {
                    num2 = num1 - Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(num2));
                    num1 = 0;

                }
                else if (operator == '*') {
                    num2 = num1 * Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(num2));
                    num1 = 0;

                }
                else if (operator == '/') {
                    num2 = num1 / Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(num2));
                    num1 = 0;

                }
                else{}

            }
        });





    }

    public Calculator(){
        frame = new JFrame("Calculator");
        initComponents();
        setContentPane(panel);
        setSize(350,500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
    }


}
