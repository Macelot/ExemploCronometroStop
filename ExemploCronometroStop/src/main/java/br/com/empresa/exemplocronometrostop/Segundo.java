/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplocronometrostop;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author marce
 */
public class Segundo implements Runnable{
    private static boolean exit = false;
    
    @Override
    public void run() {
        int i=Integer.parseInt(Tela.txtSeg.getText());
        while (!exit) {
            Tela.txtSeg.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    static void stop(){
        exit = true;
    }
}
