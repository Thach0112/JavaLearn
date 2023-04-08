package Java.learning.beginning.app;
public class Cat extends Animal{

    private int intV;
    private String mongvuot;
    private boolean isCatMouse;
    private char CharV;
    private int giatri;
    public void animalSound(){
        System.out.println("Meso");
        this.isCatMouse = true;
        this.CharV = 'c';
    }
    public Cat(String mongvuotl, int giatri){
        this.mongvuot = mongvuot;
        this.intV = giatri;
    }
      public String toString(){

        return "" + this.mongvuot+this.giatri;
    }
}