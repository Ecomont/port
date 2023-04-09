package Paql01;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    private JLabel lbIDnumber;
    private JTextField tfIDnumber;
    private JLabel lbCountry;
    private JComboBox cbCoountry;
    private JLabel lbCompanyEnd;
    private JLabel lbDescription;
    private JLabel lbReceiverCompany;
    private JLabel lbOperations;
    private JTextArea taDescription;
    private JTextField textField1;
    private JLabel lbRemitentConpany;
    private JTextField textField2;
    private JButton btPile;
    private JButton btUnpile;
    private JButton showContainerDescriptionButton;
    private JButton numberOfContainersButton;
    private JComboBox cbNumberOfContainers;
    private JTextArea taShowContainerDescription;
    private JTextField txColumnNumber;
    private JLabel lbPriority;
    private JLabel customInspectionLabel;
    private JCheckBox cbCustomInspectionb;
    private JTextArea taState;
    private JRadioButton rbPriority2;
    private JRadioButton rbPriority3;
    private JRadioButton rbPriority1;
    private JTextField tfWeight;
    private JPanel mainPanel;
    private JTextField tfNumberContainers;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Port");
        setSize(150, 128);
        setVisible(true);

        btPile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        showContainerDescriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hub hub = new Hub();
                String containerDescription= hub.display(Main.getContainer().getIdentifierNumber(), Main.getContainer());
                taDescription.setText(containerDescription);

            }
        });


        btUnpile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hub hub= new Hub();
                hub.removeContainer(Main.getContainer().getPriorityLevel(), Main.getContainer().getIdentifierNumber());
            }
        });
        numberOfContainersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        tfIDnumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int identifierNummber= Integer.parseInt(textField1.getText());
                Container container= new Container(identifierNummber);
                container.setIdentifierNumber(identifierNummber);
            }
        });
        tfWeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int weight= Integer.parseInt(textField1.getText());
                Container container= new Container(weight);
                container.setWeight(weight);
            }
        });
        taDescription.addComponentListener(new ComponentAdapter() {
        });

    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
