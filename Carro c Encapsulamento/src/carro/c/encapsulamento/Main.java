/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro.c.encapsulamento;

import javax.swing.JOptionPane;

/**
 *e
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro celta = new Carro(120);
        celta.setModel(JOptionPane.showInputDialog("Informe o Modelo: "));
        celta.setCollor(JOptionPane.showInputDialog("Informe a Cor: "));
        celta.SpeedUP(Double.parseDouble(JOptionPane.showInputDialog("Insira a Velocidade Inicial:")));
        int menu=100000000;
        
        while(menu!=0){
            menu=Integer.parseInt(JOptionPane.showInputDialog("Informações: 1\nAcelerar: 2\nReduzir: 3\nVerificar Marcha: 4\nLigar Carro: 5\nSair: 0"));
            switch(menu){
                case 1:
                    JOptionPane.showMessageDialog(null, "Modelo: "+celta.getModel()+"\n"+"Cor: "+celta.getCollor()+"\n"+"Velocidade Máxima :"+celta.getMaxspeed()+"Km/h"+"\n"+"Velocidade Atual: "+celta.getSpeed()+"Km/h");
                    break;
                case 2:
                    if(celta.SpeedUP(Double.parseDouble(JOptionPane.showInputDialog("Velocidade a Acrescentar:")))==true){
                        JOptionPane.showMessageDialog(null, "Nova Velocidade: "+celta.getSpeed());
                    }else{
                        JOptionPane.showMessageDialog(null, "Ultrapassa a Velocidade Maxima de "+celta.getMaxspeed());
                    }
                    break;
                case 3:
                    if(celta.SpeedDown(Double.parseDouble(JOptionPane.showInputDialog("Velocidade a Reduzir: ")))==true){
                        JOptionPane.showMessageDialog(null, "Nova Velocidade: "+celta.getSpeed());
                    }else{
                        JOptionPane.showMessageDialog(null, "Nova Velocidade: "+celta.getSpeed()+"\nO carro Parou");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "A Marcha atual é: "+celta.Gear());
                    break;
                case 5:
                    if(celta.Start()==true){
                        JOptionPane.showMessageDialog(null, "Carro Ligado :)");
                    }
            }
        }
        
        
    }
    
}
