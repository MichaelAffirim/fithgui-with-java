package com.fithGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class fithGUI {
    private JPanel framePanel;
    private JPanel northPanel;
    private JLabel titlelabel;
    private JLabel fullNameLabel;
    private JLabel logolabel;
    private JList qualifiedList;
    private JScrollPane westScrollPane;
    private JList applicantList;
    private JPanel centerPanel;
    private JSpinner dateSpinner;
    private JLabel dateLabel;
    private JButton copyButton;
    private JButton delateButton;


    public fithGUI() {

        Dimension dimension= delateButton.getPreferredSize();
        copyButton.setPreferredSize(dimension);

        Dimension dim =new Dimension();
        dim.width=300;
        ImageIcon Logo =new ImageIcon("C:\\Users\\Norman\\Desktop\\FithGUI\\src\\norman.png");
        Image image =Logo.getImage();
        Image newImage=image.getScaledInstance(70,70,image.SCALE_SMOOTH);
        logolabel.setIcon( new ImageIcon(newImage));

        DefaultListModel<String> applicantListModel =new DefaultListModel<>();
        applicantList.setModel(applicantListModel);

   //Get Today date

        Date today =new Date();
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL);
        SpinnerDateModel dateModel=new SpinnerDateModel(today,null,null, Calendar.DAY_OF_MONTH);
        dateSpinner.setModel(dateModel);

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] applicantName=applicantList.getSelectedIndices();
                int[]qualifiedName=qualifiedList.getSelectedIndices();
                //Delete qualified name


                for (int i=0;i<applicantName.length;i++){
                    applicantListModel.removeElementAt(applicantName[i]);

                }
                //Delete qualified name
                for (int j=0; );
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("fithGUI");
        frame.setContentPane(new fithGUI().framePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(false);
    }
}
