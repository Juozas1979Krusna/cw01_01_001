
// Java program to create a blank text
// field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;
import        javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;
    class cw01_01_001 extends JFrame implements ActionListener {

        // JTextField
        static JTextField t01;
        static JTextField t02;
        static JTextField t03;
        static JTextField t04;

        // JFrame
        static JFrame f;

        // JButton
        static JButton b01;

        // label to display text
        static JLabel l01;
        static JLabel l02;
        static JLabel l03;

        // default constructor
        cw01_01_001()
        {
        }

        // main class
        public static void main(String[] args)
        {
            // create a new frame to store text field and button
            f = new JFrame("cw01_01_001");

            // create a label to display text
            l01 = new JLabel("Vards");
            l02 = new JLabel("Uzvards");
            l03 = new JLabel("Vecums");
            t01 = new JTextField(16);
            t02 = new JTextField(16);
            t03 = new JTextField(16);
            t04 = new JTextField(20);

            // create a new button
            b01 = new JButton("Atbilde");

            // create a object of the text class
            cw01_01_001 te = new cw01_01_001();

            // addActionListener to button
            b01.addActionListener(te);

            // create a object of JTextField with 16 columns
//            t01 = new JTextField(16);

            JPanel p = new JPanel();

            // add buttons and textfield to panel
            p.add(l01);
            p.add(t01);
            p.add(l02);
            p.add(t02);
            p.add(l03);
            p.add(t03);
            p.add(b01);
            p.add(t04);

            // add panel to frame
            f.add(p);

            // set the size of frame
            f.setSize(300, 300);

            f.show();
        }

        public void actionPerformed(ActionEvent e)
        {
/*
            String text = t01.getText();
            double outDouPrint = Double.parseDouble(text);
            outDouPrint = (outDouPrint-32)*5/9;
            String outStrPrint=String.valueOf(outDouPrint);
            String s = e.getActionCommand();
            if (s.equals("Calculate")) {
                t02.setText(outStrPrint);
            }
*/
            String Vards = t01.getText();
            String Uzvards = t02.getText();
            String Vecums = t03.getText();

            double outDouPrint = Double.parseDouble(Vecums);
            outDouPrint = (2021-outDouPrint);
            String outStrPrint=String.valueOf(outDouPrint);
            Random rand = new Random();
            int int_random = rand.nextInt(1000);
            String outStrPrint_02=String.valueOf(int_random);
            String Atbilde;
            Atbilde = Vards + "/" +Uzvards +"/"+outStrPrint+ "/" + outStrPrint_02;


            String s = e.getActionCommand();
            if (s.equals("Atbilde")) {
                t04.setText(Atbilde);
            }
        }
    }



