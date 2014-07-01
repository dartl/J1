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
public class Card {
    public int number;
    public int weight;
    public Boolean mark;
    
    public Card(int num) // по сути не используется
    {
        number = num;
        weight = buildWeight(num);
        mark = true;
    }
    public Card(){
    }
    public void setCard(int num, Boolean mk) //вставить карту
    {
        number = num;
        mark = mk;
        weight = buildWeight(num);
    }
    private int buildWeight(int num) //найти вес по номеру карты
    {
        for(int i = 1; i < 53; i+=13)
        {
            if(num > i)
            {
                if(num < i+9) 
                {
                    if(i<10) return num;
                    if(i<22) return num-13;
                    if(i<34) return num-26;
                    if(i<46) return num-39;
                }
                else if(num < 13+i) return 10;
            }
            else return 11;
        }
        return 0;
    }
    public void print()
    {
        System.out.println("Num: " + number + " Weight: " + weight + " Visible: " + mark);
    }
    public int getWeight()
    {
        return weight;
    }
    public int getNumber()
    {
        return number;
    }
    //Boolean getMark {return Mark;}
}
