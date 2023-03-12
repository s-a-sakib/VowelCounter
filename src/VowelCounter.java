import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VowelCounter extends JFrame {
    private Container c;
    private JLabel textLabel , vowelLabel , aLabel, eLabel, iLabel , oLabel , uLabel;
    private JTextArea inputText;
    private JScrollPane scroll;
    private JButton button;
    private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    private int totalVowel = 0 , a = 0 , e = 0 , i = 0 , o = 0 ,u = 0;
    VowelCounter(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,620,550);
        this.setTitle("Counting Vowel App");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        textLabel = new JLabel("Enter the Text : ");
        textLabel.setBounds(10,20,150,30);
        c.add(textLabel);

        inputText = new JTextArea();
        inputText.setLineWrap(true);
        inputText.setWrapStyleWord(true);

        scroll = new JScrollPane(inputText);
        scroll.setBounds(150,20,450,100);
        c.add(scroll);

        vowelLabel = new JLabel();
        vowelLabel.setBounds(150,190,250,30);
        c.add(vowelLabel);

        aLabel = new JLabel();
        aLabel.setBounds(150,250,250,30);
        c.add(aLabel);

        eLabel = new JLabel();
        eLabel.setBounds(150,300,250,30);
        c.add(eLabel);

        iLabel = new JLabel();
        iLabel.setBounds(150,350,250,30);
        c.add(iLabel);

        oLabel = new JLabel();
        oLabel.setBounds(150,400,250,30);
        c.add(oLabel);

        uLabel = new JLabel();
        uLabel.setBounds(150,450,250,30);
        c.add(uLabel);

        button = new JButton("Clear");
        button.setBounds(150,140,100,50);
        button.setBackground(Color.green);
        button.setCursor(cursor);
        c.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                totalVowel = 0; a = 0; e = 0; i = 0; o = 0; u = 0;

                inputText.setText("");
                vowelLabel.setText("Total number of vowels:  " + totalVowel);
                aLabel.setText("Total number of A:  " + a);
                eLabel.setText("Total number of E:  " + e);
                iLabel.setText("Total number of I:  " + i);
                oLabel.setText("Total number of O:  " + o);
                uLabel.setText("Total number of U:  " + u);
            }
        });


        inputText.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if(keyEvent.getSource() == inputText){
                    if(keyEvent.VK_A == keyEvent.getKeyCode()){
                        a++;
                        totalVowel++;
                    }
                    if(keyEvent.VK_E == keyEvent.getKeyCode()){
                        e++;
                        totalVowel++;
                    }
                    if(keyEvent.VK_I == keyEvent.getKeyCode()){
                        i++;
                        totalVowel++;
                    }
                    if(keyEvent.VK_O == keyEvent.getKeyCode()){
                        o++;
                        totalVowel++;
                    }
                    if(keyEvent.VK_U == keyEvent.getKeyCode()){
                        u++;
                        totalVowel++;
                    }
                }
                vowelLabel.setText("Total number of vowels:  " + totalVowel);
                aLabel.setText("Total number of A:  " + a);
                eLabel.setText("Total number of E:  " + e);
                iLabel.setText("Total number of I:  " + i);
                oLabel.setText("Total number of O:  " + o);
                uLabel.setText("Total number of U:  " + u);
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
    }
    public static void main(String[] args) {
        VowelCounter frame = new VowelCounter();
        frame.setVisible(true);
    }
}
