package Paql01;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    private JLabel lbIDnumber;
    private JTextField tfIDnumber;
    private JLabel lbCountry;
    private JComboBox cbCountry;
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

    private JTextField tfNumberHere;

    public JLabel getLbIDnumber() {
        return lbIDnumber;
    }

    public void setLbIDnumber(JLabel lbIDnumber) {
        this.lbIDnumber = lbIDnumber;
    }

    public JTextField getTfIDnumber() {
        return tfIDnumber;
    }

    public void setTfIDnumber(JTextField tfIDnumber) {
        this.tfIDnumber = tfIDnumber;
    }

    public JLabel getLbCountry() {
        return lbCountry;
    }

    public void setLbCountry(JLabel lbCountry) {
        this.lbCountry = lbCountry;
    }

    public JComboBox getCbCountry() {
        return cbCountry;
    }

    public void setCbCountry(JComboBox cbCountry) {
        this.cbCountry = cbCountry;
    }

    public JLabel getLbCompanyEnd() {
        return lbCompanyEnd;
    }

    public void setLbCompanyEnd(JLabel lbCompanyEnd) {
        this.lbCompanyEnd = lbCompanyEnd;
    }

    public JLabel getLbDescription() {
        return lbDescription;
    }

    public void setLbDescription(JLabel lbDescription) {
        this.lbDescription = lbDescription;
    }

    public JLabel getLbReceiverCompany() {
        return lbReceiverCompany;
    }

    public void setLbReceiverCompany(JLabel lbReceiverCompany) {
        this.lbReceiverCompany = lbReceiverCompany;
    }

    public JLabel getLbOperations() {
        return lbOperations;
    }

    public void setLbOperations(JLabel lbOperations) {
        this.lbOperations = lbOperations;
    }

    public JTextArea getTaDescription() {
        return taDescription;
    }

    public void setTaDescription(JTextArea taDescription) {
        this.taDescription = taDescription;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getLbRemitentConpany() {
        return lbRemitentConpany;
    }

    public void setLbRemitentConpany(JLabel lbRemitentConpany) {
        this.lbRemitentConpany = lbRemitentConpany;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JButton getBtPile() {
        return btPile;
    }

    public void setBtPile(JButton btPile) {
        this.btPile = btPile;
    }

    public JButton getBtUnpile() {
        return btUnpile;
    }

    public void setBtUnpile(JButton btUnpile) {
        this.btUnpile = btUnpile;
    }

    public JButton getShowContainerDescriptionButton() {
        return showContainerDescriptionButton;
    }

    public void setShowContainerDescriptionButton(JButton showContainerDescriptionButton) {
        this.showContainerDescriptionButton = showContainerDescriptionButton;
    }

    public JButton getNumberOfContainersButton() {
        return numberOfContainersButton;
    }

    public void setNumberOfContainersButton(JButton numberOfContainersButton) {
        this.numberOfContainersButton = numberOfContainersButton;
    }

    public JComboBox getCbNumberOfContainers() {
        return cbNumberOfContainers;
    }

    public void setCbNumberOfContainers(JComboBox cbNumberOfContainers) {
        this.cbNumberOfContainers = cbNumberOfContainers;
    }

    public JTextArea getTaShowContainerDescription() {
        return taShowContainerDescription;
    }

    public void setTaShowContainerDescription(JTextArea taShowContainerDescription) {
        this.taShowContainerDescription = taShowContainerDescription;
    }

    public JTextField getTxColumnNumber() {
        return txColumnNumber;
    }

    public void setTxColumnNumber(JTextField txColumnNumber) {
        this.txColumnNumber = txColumnNumber;
    }

    public JLabel getLbPriority() {
        return lbPriority;
    }

    public void setLbPriority(JLabel lbPriority) {
        this.lbPriority = lbPriority;
    }

    public JLabel getCustomInspectionLabel() {
        return customInspectionLabel;
    }

    public void setCustomInspectionLabel(JLabel customInspectionLabel) {
        this.customInspectionLabel = customInspectionLabel;
    }

    public JCheckBox getCbCustomInspectionb() {
        return cbCustomInspectionb;
    }

    public void setCbCustomInspectionb(JCheckBox cbCustomInspectionb) {
        this.cbCustomInspectionb = cbCustomInspectionb;
    }

    public JTextArea getTaState() {
        return taState;
    }

    public void setTaState(JTextArea taState) {
        this.taState = taState;
    }

    public JRadioButton getRbPriority2() {
        return rbPriority2;
    }

    public void setRbPriority2(JRadioButton rbPriority2) {
        this.rbPriority2 = rbPriority2;
    }

    public JRadioButton getRbPriority3() {
        return rbPriority3;
    }

    public void setRbPriority3(JRadioButton rbPriority3) {
        this.rbPriority3 = rbPriority3;
    }

    public JRadioButton getRbPriority1() {
        return rbPriority1;
    }

    public void setRbPriority1(JRadioButton rbPriority1) {
        this.rbPriority1 = rbPriority1;
    }

    public JTextField getTfWeight() {
        return tfWeight;
    }

    public void setTfWeight(JTextField tfWeight) {
        this.tfWeight = tfWeight;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }


    public JTextField getTfNumberHere() {
        return tfNumberHere;
    }

    public void setTfNumberHere(JTextField tfNumberHere) {
        this.tfNumberHere = tfNumberHere;
    }

    public MainFrame(){


        setContentPane(mainPanel);
        setTitle("Port");
        setSize(1000, 800);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Hub hub1= new Hub();
        Hub hub2= new Hub();
        Hub hub3= new Hub();


        btPile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        if (!rbPriority1.isSelected() && !rbPriority2.isSelected() && !rbPriority3.isSelected()){
                            throw new Exception("Select the priority");
                        }
                }catch (Exception e1){
                    //creo el pop up para que salga cuando no han elegido la prioridad
                    JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), "Invalid", JOptionPane.ERROR_MESSAGE);
                }
                try{
                    int weight= Integer.parseInt(tfWeight.getText());
                    if (weight<0){
                        throw new NumberFormatException("The weight cannot be negative");
                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), " The weight cannot be negative", JOptionPane.ERROR_MESSAGE);
                }
                Container container= new Container();
                container.setIdentifierNumber(Integer.parseInt(tfIDnumber.getText()));
                container.setWeight(Integer.parseInt(tfWeight.getText()));
                container.setContentDescription(taDescription.getText());
                container.setCompanySender(textField2.getText());
                container.setCompanyReceiver(textField1.getText());
                container.setInspectedByCustoms(cbCustomInspectionb.isSelected());
                container.setCountryOfOrigin((String) cbCountry.getSelectedItem());
                int priority= prioritySet();
                if (priority==1){
                    hub1.stackContainer(container);
                    taState.setText(" Hub1\n"+hub1.printState());

                } else if (container.getPriorityLevel()==2) {
                    hub2.stackContainer(container);
                    taState.setText(" Hub2 \n"+hub2.printState());


                } else if (container.getPriorityLevel()==3) {
                    hub3.stackContainer(container);
                    taState.setText("Hub3\n"+hub3.printState());

                }
            }
        });
        showContainerDescriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });


        btUnpile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int column= Integer.parseInt(txColumnNumber.getText());
                int priority= prioritySet();
                if (priority==1){
                    try {
                        if (hub1.removeContainer(column)==false){
                            throw new Exception(" No containers in the "+column+ " of the hub 1");
                        }
                    }catch (Exception e1){
                        JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), " Is empty", JOptionPane.ERROR_MESSAGE);
                    }
                    hub1.removeContainer(column);
                    taState.setText(" Hub1\n"+hub1.printState());

                } else if (priority==2) {
                    try {
                        if (hub1.removeContainer(column)==false){
                            throw new Exception(" No containers in the "+column+ " of the hub 2");
                        }
                    }catch (Exception e1){
                        JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), " Is empty", JOptionPane.ERROR_MESSAGE);
                    }
                    hub2.removeContainer(column);
                    taState.setText(" Hub2\n"+hub2.printState());


                } else if (priority==3) {
                    try {
                        if (hub1.removeContainer(column)==false){
                            throw new Exception(" No containers in the "+column+ " of the hub 3");
                        }
                    }catch (Exception e1){
                        JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), " Is empty", JOptionPane.ERROR_MESSAGE);
                    }
                    hub3.removeContainer(column);
                    taState.setText(" Hub3\n"+hub3.printState());

                }
            }
        });
        numberOfContainersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== numberOfContainersButton){
                    //cuando el usuaria hace click en el boton
                    String country= (String) cbCountry.getSelectedItem();
                    int numContainers= (int) hub1.countContainers(country) + (int) hub2.countContainers(country)+ (int)hub3.countContainers(country);
                    tfNumberHere.setText(" "+ numContainers);
                }
            }
        });
        /* lo paso arriba al pile
        tfWeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int weight= Integer.parseInt(textField1.getText());
                    if (weight<0){
                        throw new NumberFormatException("The weight cannot be negative");
                    }

                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this, e1.getMessage(), " The weight cannot be negative", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

         */

    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
    private int prioritySet() {
        int priority = 0;

        if (rbPriority1.isSelected()) {
            priority = 1;
        } else if (rbPriority2.isSelected()) {
            priority = 2;
        } else if (rbPriority3.isSelected()) {
            priority = 3;
        }

        return priority;
    }

    private void createUIComponents() {
        lbCompanyEnd = new JLabel(new ImageIcon("src/cgn-37-DNSC8705070-s-1080746446.jpg"));
    }
}
