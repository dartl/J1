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
import java.util.Random;
public class Pack {
    public Card[] cards;
    
    public Pack()
    {
        cards = new Card[53];
        for(int i = 0; i < 53; i++)
        {
            cards[i] = new Card(i);
        }
    }
    public void print()
    {
        for(int i = 0; i<53; i++) 
            cards[i].print();
    }
    public Card getRandomCard() // достать рандомную карту
    {
        Random rand = new Random();   
        int n = rand.nextInt(52);
        while(!cards[n].mark) n = rand.nextInt(52);
        cards[n].mark = false;
        return cards[n];
    }
    public void putCardBack(Card crd) //положить карту обратно, не используется
    {
        for(int i=0; i < 53; i++)
            if(crd.number == cards[i].number)
                cards[i].mark = true;
    }
    public void putCardBack(int num) // положить карту обратно, не используется
    {
        for(int i=0; i < 53; i++)
            if(num == cards[i].number)
                cards[i].mark = true;
    }
    public void reserPack() // вернуть все карты в колоду
    {
        for(int i=0; i < 53; i++)
            cards[i].mark = true;
    }
}
