/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro.c.encapsulamento;

/**
 *
 * @author felip
 */
public class Carro {
    // Variaveis
    
    private String model;
    private String collor;
    private double maxspeed;
    private double speed;
    
    // Construtores
   
    public Carro(double maxspeed){
        this.maxspeed=maxspeed;
    }
    public Carro(){
        
    }
    // Getters
    public String getModel(){
        return this.model;
    }
    
    public String getCollor(){
        return this.collor;
    }
    
    public double getMaxspeed(){
        return this.maxspeed;
    }
    
    public double getSpeed(){
        return this.speed;
    }
    
    // Setters
    
    public void setModel(String model){
        this.model=model;
    }
    
    public void setCollor(String collor){
        this.collor=collor;
    }
    
    public void setMaxspeed(double maxspeed){
        this.maxspeed=maxspeed;
    }
    
    // Metódos
    
    // Ligar Carro:
    public boolean Start(){
        return true;
    }
    // Acelerar:
    public boolean SpeedUP(double speed){
        if(this.speed+speed<=this.maxspeed){
            this.speed+=speed;
            return true;
        }
        return false;
    }
    // Desacelerar:
    public boolean SpeedDown(double speed){
        if(this.speed-speed>0){
            this.speed-=speed;
            return true;
        }
        this.speed=0;
        return false;
    }
    // Verificar Marcha:
    public int Gear(){
        if(this.speed<=20){
            return 1;
        }
        if(this.speed>20 && this.speed <=40){
            return 2;
        }
        if(this.speed>40 && this.speed <=60){
            return 3;
        }
        if(this.speed>60 && this.speed <=100){
            return 4;
        }
        if(this.speed>100){
            return 5;
        }
        return 0;
    }
}
