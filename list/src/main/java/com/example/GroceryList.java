package com.example;
import java.util.*;

public class GroceryList
{
    private ArrayList groceries;

    public GroceryList()
    {
        groceries = new ArrayList();
    }

    public void addItem(String item)
    {
        groceries.add(item);
    }

    public int numberOfItems()
    {
        return groceries.size();
    }

    public String toString()
    {
        String s = "";

        for (int i = 0; i < groceries.size(); i++)
        {
            s += groceries.get(i) + "\n";
        }

        return s;
    }

    public void clear()
    {
        groceries.clear();
    }

    public static void main(String[] args)
    {
        //Create a new grocery list
        GroceryList myList = new GroceryList();

        //Add some items
        myList.addItem("chicken");
        myList.addItem("eggs");
        myList.addItem("milk");
        myList.addItem("bread");

        //Print out the list
        System.out.println(myList);

        //Print number of items in list
        System.out.println("Number of items: " +
                myList.numberOfItems() + "\n");

        //Clear list
        myList.clear();

        myList.addItem("cheese");
        myList.addItem("chips");
        myList.addItem("salsa");

        System.out.println(myList);

        System.out.println("Number of items: " +
                myList.numberOfItems());

    }
}