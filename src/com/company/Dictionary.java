package com.company;

import javax.swing.*;
import java.util.*;

/*
Simple Dictionary. User can put word in english and get in output polish word.
 */

public class Dictionary {


    public static void main(String[] args){
        String word;

        do {
            Map<String, String> dictionary = new HashMap<String, String>();

            dictionary.put("father", "tata");
            dictionary.put("flower", "kwiatek");
            dictionary.put("dog", "pies");
            dictionary.put("book", "książka");
            dictionary.put("car","auto");

            word = JOptionPane.showInputDialog(null, "Put the english word: ");


            if (dictionary.containsKey(word)) {
                JOptionPane.showMessageDialog(null,
                        "Polish word is: " + dictionary.get(word));
            } else {
                JOptionPane.showMessageDialog(null, "Word is not avaible in dictionary :(");
            }
        }while(!word.equals("stop"));
    }
}