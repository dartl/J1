package javaapplication10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ромочка
 */
public class Gamer {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
    int Points;  
    
    public int takeCard(Pack koloda) // Взять случайную карту с колоды
    {
        Card crd = new Card();
        crd = koloda.getRandomCard();
        Points += crd.getWeight();
        return crd.getNumber();
    }
    public int getPoints()
    {
        return Points;
    }
    public void Reset()
    {
        Points = 0;
    }
    
    
}