/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.swingcalculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Tibit
 */
public class SwingCalculator {

    public SwingCalculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(350, 90); //x,y

        JLabel displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 530, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);

        JButton sevenBtn = new JButton("7");
        sevenBtn.setBounds(30, 120, 60, 40);
        sevenBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(sevenBtn);

        JButton eightBtn = new JButton("8");
        eightBtn.setBounds(100, 120, 60, 40);
        eightBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(eightBtn);

        JButton nineBtn = new JButton("9");
        nineBtn.setBounds(170, 120, 60, 40);
        nineBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(nineBtn);

        JButton fourBtn = new JButton("4");
        fourBtn.setBounds(30, 170, 60, 40);
        fourBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(fourBtn);

        JButton fiveBtn = new JButton("5");
        fiveBtn.setBounds(100, 170, 60, 40);
        fiveBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(fiveBtn);

        JButton sixBtn = new JButton("6");
        sixBtn.setBounds(170, 170, 60, 40);
        sixBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(sixBtn);

        JButton oneBtn = new JButton("1");
        oneBtn.setBounds(30, 220, 60, 40);
        oneBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(oneBtn);

        JButton twoBtn = new JButton("2");
        twoBtn.setBounds(100, 220, 60, 40);
        twoBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(twoBtn);

        JButton threeBtn = new JButton("3");
        threeBtn.setBounds(170, 220, 60, 40);
        threeBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(threeBtn);

        JButton dotBtn = new JButton(".");
        dotBtn.setBounds(30, 270, 60, 40);
        dotBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(dotBtn);

        JButton zeroBtn = new JButton("0");
        zeroBtn.setBounds(100, 270, 60, 40);
        zeroBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(zeroBtn);

        JButton equalBtn = new JButton("=");
        equalBtn.setBounds(170, 270, 60, 40);
        equalBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(equalBtn);

        JButton divisionBtn = new JButton("/");
        divisionBtn.setBounds(240, 120, 60, 40);
        divisionBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(divisionBtn);

        JButton mulBtn = new JButton("x");
        mulBtn.setBounds(240, 170, 60, 40);
        mulBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(mulBtn);

        JButton minusBtn = new JButton("-");
        minusBtn.setBounds(240, 220, 60, 40);
        minusBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(minusBtn);

        JButton plusBtn = new JButton("+");
        plusBtn.setBounds(240, 270, 60, 40);
        plusBtn.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(plusBtn);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingCalculator c = new SwingCalculator();

    }
}
