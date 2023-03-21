//Author : Gaurav Amarnani.

//Package Name : 
package com.byGaurav;

//Importing Files : 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Initialization Class : 
public class GA_Editor {

    public static void main(String[] args) 
    {
        Font f = new Font("Comic Sans MS" ,Font.BOLD,20);
        GA_EditorGUI obj = new GA_EditorGUI();
        obj.setBounds(0 , 0 , 969 , 700);
        obj.setTitle("GA TextEditor.");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
