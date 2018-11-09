package SlownikPro;

/*
Simple Dictionary. User can choose direction of translation:

PL-> EN
EN-> PL

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class DictionaryPro extends JFrame implements ActionListener {

    private JLabel label = new JLabel();
    private HashMap<String,String> plProvider;
    private HashMap<String,String> angProvider;

    public DictionaryPro() {

        plProvider = PL_ANG.plDictionaryProvider();
        angProvider = ANG_PL.angDictionaryProvider();

        setFrameDefualtProperties();
        addButtonsAndLabelToLayout();
    }

    private void setFrameDefualtProperties() {
        setTitle("POLISH-ENGLISH DICTIONARY");
        setVisible(true);
        setSize(500, 500);
        setLayout(new GridLayout(4, 1));
    }

    private void addButtonsAndLabelToLayout() {
        setLabelTextQuestion();
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton PL_button = new JButton("PL-ANG");
        PL_button.addActionListener(this);
        JButton ANG_botton = new JButton("ANG-PL");
        ANG_botton.addActionListener(this);

        add(label);
        add(PL_button);
        add(ANG_botton);

    }

    private void setLabelTextQuestion() {
        label.setText("Choose which Dictionary you want to use:");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String PlWord;
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("PL-ANG")) {

            do {
                PlWord = JOptionPane.showInputDialog(null, "Put polish word");

                if (plProvider.containsKey(PlWord)) {
                    JOptionPane.showMessageDialog(null,
                            "English word is : " + plProvider.get(PlWord));
                } else {
                    JOptionPane.showMessageDialog(null, "Word is not avaible in dictionary");
                }

            } while (!PlWord.equals("stop"));

        }


        String AngWord;

        if (button.getText().equals("ANG-PL")) {

            do {
                AngWord = JOptionPane.showInputDialog(null, "Put english word: ");

                if (angProvider.containsKey(AngWord)) {
                    JOptionPane.showMessageDialog(null,
                            "Polish word is: " + angProvider.get(AngWord));
                } else {
                    JOptionPane.showMessageDialog(null, "Word is not avaible in dictionary");
                }

            } while (!AngWord.equals("stop"));

        }
    }

    public static void main(String[] args) {
        // write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DictionaryPro();
            }
        });
    }
}
