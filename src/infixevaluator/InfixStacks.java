/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixevaluator;

import java.util.StringTokenizer;

/*
File: InfixEvaluator.java
Author: Brian Orwick
Date: 3/9/2018
Purpose: Disassemble and solve arithmetic infix equations.
 */

public class InfixStacks {
    

    //tokenize the string containing the expression 
            
   // while there are more tokens  get the next token  
        //if it is an operand  
            //push it onto the operand stack 
        //else if it is a left parenthesis   
            //push it onto the operator stack  
        //else if it is a right parenthesis   
            //while top of the operator stack not a left parenthesis    
                //pop two operands and an operator    
                //perform the calculation   
                //push the result onto the operand stack  
        //else if it is an operator   
            //while the operator stack is not empty and the operator at the top of the stack has higher or the same precedence than the current operator    
                //pop two operands and perform the calculation   
                //push the result onto the operand stack   
                //push the current operator on the operators stack 
                //while the operator stack is not empty  
                    //pop two operands and an operator  
                        //perform the calculation  
                        //push the result onto the operand stack the final result is a the top of the operand stack 

}
//https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form