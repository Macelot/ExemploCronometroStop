/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplocronometrostop;

/**
 *
 * @author marce
 */
public class Milessimo implements Runnable{
     private static boolean exit = false;

    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMili.getText());
        while (!exit) {
            Tela.txtMili.setText(i+"");
            i++;
            if(i==1000)
                i=0;
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }  
        }
    }
    
    static void stop(){
        exit = true;
    }
    
}
