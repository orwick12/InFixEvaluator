
package infixevaluator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import infixevaluator.InfixStacks;

/*
File: InfixEvaluator.java
Author: Brian Orwick
Date: 3/9/918
Purpose: Disassemble and solve arithmetic infix equations.
 */
public class InfixEvaluator extends JFrame{
    
    //Establish variables and pre-loaded values
    private static final int WINDOWWIDTH = 400, WINDOWHEIGHT = 250;
    
    private int expressionValue;
    

    //Create buttons and fields
    private JLabel jLabelExpression = new JLabel("Enter Infix Expression");
    private JLabel jLabelResult = new JLabel("Result");
    private JButton evaluateButton = new JButton("Evaluate");
    private JTextField textExpression = new JTextField();
    private JTextField textResult = new JTextField();


    //GUI Constructor
    public InfixEvaluator(){
        super ("Infix Expression Evaluator");
        setLayout(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();
        setFrame(WINDOWWIDTH, WINDOWHEIGHT);
        Font f = new Font("Dialog", Font.PLAIN, 24);
        JPanel inputPanel = new JPanel();
        JPanel evaluationPanel = new JPanel();
        JPanel resultPanel = new JPanel();
        layout.gridy = 2;
        setResizable(false);
        add(inputPanel);
        add(evaluationPanel, layout);
        layout.gridy = 3;
        add(resultPanel, layout);
        inputPanel.setLayout(new GridLayout(1,2));
        evaluationPanel.setLayout(new GridLayout(1,1));
        resultPanel.setLayout(new GridLayout(1,2));
        inputPanel.add(jLabelExpression);
        inputPanel.add(textExpression);
        evaluationPanel.add(evaluateButton);
        resultPanel.add(jLabelResult);
        resultPanel.add(textResult);
        resultPanel.setFont(f);
        textResult.setPreferredSize(new Dimension(100, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Commented out a diff gui
        super ("Infix Expression Evaluator");
        setSize(WINDOWWIDTH, WINDOWHEIGHT);
        setLocationRelativeTo(null);
	getContentPane().setLayout(new GridLayout(3,2, 15, 15));
	getContentPane().add(jLabelExpression);
        jLabelExpression.setText("Enter Infix Expression");
        getContentPane().add(textExpression);
        evaluateButton.setText("Evaluate");
        evaluateButton.addActionListener(new EvaluateButtonListener());
	getContentPane().add(evaluateButton);
        getContentPane().add(blankLabel);
        getContentPane().add(jLabelResult);
        jLabelResult.setText("Result");
        getContentPane().add(textResult);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); */
    }
    

    public int getExpressionValue(){
        try{
            return Integer.parseInt(textExpression.getText());
        }
        catch (NumberFormatException e) {
            clearExpressionValue();
            return 2;
        }
    }
    
    public void setExpressionValue(){
        this.expressionValue = getExpressionValue();
    }
    
    public void clearExpressionValue() {
        textExpression.setText(" ");
}
    //ActiveListener for results
    class EvaluateButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event) {          
            setExpressionValue();
        }
    }
    
     private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
     
        public void display() {
        setVisible(true);
    }

    public static void main(String[] args) {
        
        //Create gui and make visible
        InfixEvaluator frame = new InfixEvaluator();
        frame.display();
    }
    
}
