import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {

    JTextArea area;
    JButton btn[] = new JButton[20];
    JLabel result;

    Calculator() {
        setTitle("Calculator");
        setSize(428, 552);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        area = new JTextArea();
        area.setFont(new Font("", Font.PLAIN, 18));
        area.setBounds(0, 0, 450, 50);
        add(area);

        result = new JLabel("");
        result.setBackground(Color.WHITE);
        result.setFont(new Font("", Font.PLAIN, 18));
        result.setBounds(0,50,450,50);
        add(result);

        btn[0] = new JButton("AC");
        btn[0].setBounds(2, 102, 100, 80);
        add(btn[0]);

        btn[1] = new JButton("%");
        btn[1].setFont(new Font("", Font.BOLD, 20));
        btn[1].setBounds(104, 102, 100, 80);
        add(btn[1]);

        btn[2] = new JButton("←");
        btn[2].setFont(new Font("", Font.BOLD, 20));
        btn[2].setBounds(206, 102, 100, 80);
        add(btn[2]);

        btn[3] = new JButton("÷");
        btn[3].setFont(new Font("", Font.BOLD, 20));
        btn[3].setBounds(308, 102, 100, 80);
        add(btn[3]);

        btn[4] = new JButton("7");
        btn[4].setBounds(2, 184, 100, 80);
        add(btn[4]);

        btn[5] = new JButton("8");
        btn[5].setBounds(104, 184, 100, 80);
        add(btn[5]);

        btn[6] = new JButton("9");
        btn[6].setBounds(206, 184, 100, 80);
        add(btn[6]);

        btn[7] = new JButton("x");
        btn[7].setFont(new Font("", Font.BOLD, 20));
        btn[7].setBounds(308, 184, 100, 80);
        add(btn[7]);

        btn[8] = new JButton("4");
        btn[8].setBounds(2, 266, 100, 80);
        add(btn[8]);

        btn[9] = new JButton("5");
        btn[9].setBounds(104, 266, 100, 80);
        add(btn[9]);

        btn[10] = new JButton("6");
        btn[10].setBounds(206, 266, 100, 80);
        add(btn[10]);

        btn[11] = new JButton("-");
        btn[11].setFont(new Font("", Font.BOLD, 20));
        btn[11].setBounds(308, 266, 100, 80);
        add(btn[11]);

        btn[12] = new JButton("1");
        btn[12].setBounds(2, 348, 100, 80);
        add(btn[12]);

        btn[13] = new JButton("2");
        btn[13].setBounds(104, 348, 100, 80);
        add(btn[13]);

        btn[14] = new JButton("3");
        btn[14].setBounds(206, 348, 100, 80);
        add(btn[14]);

        btn[15] = new JButton("+");
        btn[15].setFont(new Font("", Font.BOLD, 20));
        btn[15].setBounds(308, 348, 100, 80);
        add(btn[15]);

        btn[16] = new JButton("00");
        btn[16].setBounds(2, 430, 100, 80);
        add(btn[16]);

        btn[17] = new JButton("0");
        btn[17].setBounds(104, 430, 100, 80);
        add(btn[17]);

        btn[18] = new JButton(".");
        btn[18].setBounds(206, 430, 100, 80);
        add(btn[18]);

        btn[19] = new JButton("=");
        btn[19].setFont(new Font("", Font.BOLD, 20));
        btn[19].setBounds(308, 430, 100, 80);
        add(btn[19]);

        setVisible(true);

        for (int i = 0; i < btn.length; i++) {
            btn[i].addActionListener(this);
            btn[i].setBackground(Color.DARK_GRAY);
            btn[i].setForeground(Color.WHITE);
            btn[i].setBorder(null);
        }
        result.setOpaque(true);
        btn[0].setBackground(new Color(38, 38, 38));
        btn[1].setBackground(new Color(38, 38, 38));
        btn[2].setBackground(new Color(38, 38, 38));
        btn[3].setBackground(new Color(38, 38, 38));
        btn[7].setBackground(new Color(38, 38, 38));
        btn[11].setBackground(new Color(38, 38, 38));
        btn[15].setBackground(new Color(38, 38, 38));
        btn[19].setBackground(new Color(255, 69, 0));

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String text = area.getText();
    
        if (e.getSource() == btn[0]) 
        {
            area.setText("");
            result.setText("");
        }
         else if (e.getSource() == btn[1]) 
        {
            if(text.length()>0 && !text.contains("%") )
                area.setText(text + "%");
        } 
        else if (e.getSource() == btn[2]) 
        {
            if (text.length()>0) {
                area.setText(text.substring(0,(text.length()-1)));
            }
        } 
        else if (e.getSource() == btn[3]) 
        {
            if(text.length()>0 && !text.contains("÷") )
                area.setText(text + "÷");
        } 
        else if (e.getSource() == btn[7]) 
        {
            if(text.length()>0 && !text.contains("x") )
                area.setText(text + "x");
        } 
        else if (e.getSource() == btn[11]) 
        {
            if(text.length()>0 && !text.contains("-") )
                area.setText(text + "-");
        }
        else if (e.getSource() == btn[15]) 
        {
            if(text.length()>0 && !text.contains("+") )
                area.setText(text + "+");
        } 
        else if (e.getSource() == btn[19]) 
        {
            if (text.contains("+")) {
                String text_split[] = text.split("\\+");
                float a = Float.parseFloat(text_split[0]);
                float b = Float.parseFloat(text_split[1]);
                result.setText(String.valueOf((a+b)));
            }
            else if (text.contains("-")) {
                String text_split[] = text.split("\\-");
                float a = Float.parseFloat(text_split[0]);
                float b = Float.parseFloat(text_split[1]);
                result.setText(String.valueOf((a-b)));
            }
            else if (text.contains("x")) {
                String text_split[] = text.split("x");
                float a = Float.parseFloat(text_split[0]);
                float b = Float.parseFloat(text_split[1]);
                result.setText(String.valueOf((a*b)));
            }
            else if (text.contains("÷")) {
                String text_split[] = text.split("\\÷");
                float a = Float.parseFloat(text_split[0]);
                float b = Float.parseFloat(text_split[1]);
                result.setText(String.valueOf(a/b));
            }
            else if (text.contains("%")) {
                String text_split[] = text.split("\\%");
                float a = Float.parseFloat(text_split[0]);
                float b = Float.parseFloat(text_split[1]);
                result.setText(String.valueOf((a%b)));
            }
        } 
        else 
        {
            for (int i = 0; i < btn.length; i++) 
            {
                if (e.getSource() == btn[i]) 
                {
                    area.setText(text + btn[i].getText());
                }
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}