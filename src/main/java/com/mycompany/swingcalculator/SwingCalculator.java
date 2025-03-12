/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.swingcalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Tibit
 */
public class SwingCalculator implements ActionListener{
    
    JFrame jf;
    JLabel displayLabel;
    JButton sevenBtn,eightBtn,nineBtn,fourBtn,fiveBtn,sixBtn,oneBtn,twoBtn,threeBtn,dotBtn,zeroBtn,equalBtn,divisionBtn,
            minusBtn,mulBtn,plusBtn,clearBtn;

    public SwingCalculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(350, 90); //x,y

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 530, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);

        sevenBtn = new JButton("7");
        sevenBtn.setBounds(30, 120, 60, 40);
        sevenBtn.setFont(new Font("Arial", Font.PLAIN,25));
        sevenBtn.addActionListener(this);
        jf.add(sevenBtn);

        eightBtn = new JButton("8");
        eightBtn.setBounds(100, 120, 60, 40);
        eightBtn.setFont(new Font("Arial", Font.PLAIN,25));
        eightBtn.addActionListener(this);
        jf.add(eightBtn);

        nineBtn = new JButton("9");
        nineBtn.setBounds(170, 120, 60, 40);
        nineBtn.setFont(new Font("Arial", Font.PLAIN,25));
        nineBtn.addActionListener(this);
        jf.add(nineBtn);

        fourBtn = new JButton("4");
        fourBtn.setBounds(30, 170, 60, 40);
        fourBtn.setFont(new Font("Arial", Font.PLAIN,25));
        fourBtn.addActionListener(this);
        jf.add(fourBtn);

        fiveBtn = new JButton("5");
        fiveBtn.setBounds(100, 170, 60, 40);
        fiveBtn.setFont(new Font("Arial", Font.PLAIN,25));
        fiveBtn.addActionListener(this);
        jf.add(fiveBtn);

        sixBtn = new JButton("6");
        sixBtn.setBounds(170, 170, 60, 40);
        sixBtn.setFont(new Font("Arial", Font.PLAIN,25));
        sixBtn.addActionListener(this);
        jf.add(sixBtn);

        oneBtn = new JButton("1");
        oneBtn.setBounds(30, 220, 60, 40);
        oneBtn.setFont(new Font("Arial", Font.PLAIN,25));
        oneBtn.addActionListener(this);
        jf.add(oneBtn);

        twoBtn = new JButton("2");
        twoBtn.setBounds(100, 220, 60, 40);
        twoBtn.setFont(new Font("Arial", Font.PLAIN,25));
        twoBtn.addActionListener(this);
        jf.add(twoBtn);

        threeBtn = new JButton("3");
        threeBtn.setBounds(170, 220, 60, 40);
        threeBtn.setFont(new Font("Arial", Font.PLAIN,25));
        threeBtn.addActionListener(this);
        jf.add(threeBtn);

        dotBtn = new JButton(".");
        dotBtn.setBounds(30, 270, 60, 40);
        dotBtn.setFont(new Font("Arial", Font.PLAIN,25));
        dotBtn.addActionListener(this);
        jf.add(dotBtn);

        zeroBtn = new JButton("0");
        zeroBtn.setBounds(100, 270, 60, 40);
        zeroBtn.setFont(new Font("Arial", Font.PLAIN,25));
        zeroBtn.addActionListener(this);
        jf.add(zeroBtn);

        equalBtn = new JButton("=");
        equalBtn.setBounds(170, 270, 60, 40);
        equalBtn.setFont(new Font("Arial", Font.PLAIN,25));
        equalBtn.addActionListener(this);
        jf.add(equalBtn);

        divisionBtn = new JButton("/");
        divisionBtn.setBounds(240, 120, 60, 40);
        divisionBtn.setFont(new Font("Arial", Font.PLAIN,25));
        divisionBtn.addActionListener(this);
        jf.add(divisionBtn);

        mulBtn = new JButton("x");
        mulBtn.setBounds(240, 170, 60, 40);
        mulBtn.setFont(new Font("Arial", Font.PLAIN,25));
        mulBtn.addActionListener(this);
        jf.add(mulBtn);

        minusBtn = new JButton("-");
        minusBtn.setBounds(240, 220, 60, 40);
        minusBtn.setFont(new Font("Arial", Font.PLAIN,25));
        minusBtn.addActionListener(this);
        jf.add(minusBtn);

        plusBtn = new JButton("+");
        plusBtn.setBounds(240, 270, 60, 40);
        plusBtn.setFont(new Font("Arial", Font.PLAIN,25));
        plusBtn.addActionListener(this);
        jf.add(plusBtn);
        
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(30, 330, 270, 40);
        clearBtn.setFont(new Font("Arial", Font.PLAIN,25));
        clearBtn.addActionListener(this);
        jf.add(clearBtn);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingCalculator c = new SwingCalculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == sevenBtn){
            displayLabel.setText(displayLabel.getText()+"7");
        }else if(e.getSource() == eightBtn){
            displayLabel.setText(displayLabel.getText()+"8");
            
        }else if(e.getSource() == nineBtn){
            displayLabel.setText(displayLabel.getText()+"9");
            
        }else if(e.getSource() == fourBtn){
            displayLabel.setText(displayLabel.getText()+"4");
            
        }else if(e.getSource() == fiveBtn){
            displayLabel.setText(displayLabel.getText()+"5");
            
        }else if(e.getSource() == sixBtn){
            displayLabel.setText(displayLabel.getText()+"6");
            
        }else if(e.getSource() == oneBtn){
            displayLabel.setText(displayLabel.getText()+"1");
            
        }else if(e.getSource() == twoBtn){
            displayLabel.setText(displayLabel.getText()+"2");
            
        }else if(e.getSource() == threeBtn){
            displayLabel.setText(displayLabel.getText()+"3");
            
        }else if(e.getSource() == dotBtn){
            displayLabel.setText(".");
            
        }else if(e.getSource() == zeroBtn){
            displayLabel.setText(displayLabel.getText()+"0");
            
        }else if(e.getSource() == equalBtn){
            displayLabel.setText("=");
            
        }else if(e.getSource() == divisionBtn){
            displayLabel.setText("/");
            
        }else if(e.getSource() == mulBtn){
            displayLabel.setText("x");
            
        }else if(e.getSource() == minusBtn){
            displayLabel.setText("-");
            
        }else if(e.getSource() == plusBtn){
            displayLabel.setText("+");
            
        }else if(e.getSource() == clearBtn){
            displayLabel.setText("");
        }
        
      }
}
