import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {


    private JPanel panel;
    private JTextField t1;
    private JButton plusbutton;
    private JButton minusbutton;
    private JButton multiplybutton;
    private JButton dividebutton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button0;
    private JButton buttonClear;
    private JButton dotbutton;

    public void initComponents(){
        panel.setLayout(null);
        t1.setBounds(10, 10,310, 50);
        panel.add(t1);
        a7Button.setBounds(10,70,60,50);
        panel.add(a7Button);
        a8Button.setBounds(90,70,60,50);
        panel.add(a8Button);
        a9Button.setBounds(170,70,60,50);
        panel.add(a9Button);
        plusbutton.setBounds(257, 70, 60, 50);
        panel.add((plusbutton));

        a4Button.setBounds(10,140,60,50);
        panel.add(a4Button);
        a5Button.setBounds(90,140,60,50);
        panel.add(a5Button);
        a6Button.setBounds(170,140,60,50);
        panel.add(a6Button);
        minusbutton.setBounds(257, 140, 60, 50);
        panel.add(minusbutton);

        a1Button.setBounds(10,210,60,50);
        panel.add(a1Button);
        a2Button.setBounds(90,210,60,50);
        panel.add(a2Button);
        a3Button.setBounds(170,210,60,50);
        panel.add(a3Button);
        multiplybutton.setBounds(257,210, 60, 50);
        panel.add(multiplybutton);

        button0.setBounds(10,280, 60,50);
        panel.add(button0);
        buttonClear.setBounds(90,280, 60,50);
        panel.add(buttonClear);
        dotbutton.setBounds(170,280, 60,50);
        panel.add(dotbutton);

        dividebutton.setBounds(257, 280, 60, 50);
        panel.add(dividebutton);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1text = t1.getText() + a1Button.getText();
                t1.setText(b1text);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b2text = t1.getText() + a2Button.getText();
                t1.setText(b2text);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b3text = t1.getText() + a3Button.getText();
                t1.setText(b3text);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b4text = t1.getText() + a4Button.getText();
                t1.setText(b4text);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b5text = t1.getText() + a5Button.getText();
                t1.setText(b5text);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b6text = t1.getText() + a6Button.getText();
                t1.setText(b6text);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b7text = t1.getText() + a7Button.getText();
                t1.setText(b7text);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b8text = t1.getText() + a8Button.getText();
                t1.setText(b8text);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b9text = t1.getText() + a9Button.getText();
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



    }

    public Calculator(){
        initComponents();
        setContentPane(panel);
        setSize(350,500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
