//singly linked list to create,insert at random position,print and to sort
package data.structure;

import java.io.*;
import java.util.Scanner;
public class delete 
{
    
    Node head; //head of list
    
    static class Node       //defines as static so that main() can access it
    {
        int data;      //like structure in c
        Node next;
        
        
    Node(int d)     //constructor
    {
        data = d;
        next = null;
    }
    }
    static int c=0;
    public static Node insert(delete list,int data)
    {
        c++;
        Node new_node = new Node(data); //new node with data
        new_node.next = null;
        Node last = null;
        if(list.head == null) //if the list is empty
            list.head = new_node; // insert list with new node
        else
        {
            last = list.head;  //if not empty create new node called last and traverse until lastnode and insert node at last.
        while(last.next != null)   //check if there is value in nextnode // traverse until last node 
        {
            last = last.next;    // head moves to nextnode if there is value until last.next becomes empty
            
           
            
        }
        
        last.next = new_node; // insert as last node
        
        }
        System.out.println("i"+c);
    return last;
      
    }
    
    
    static int c1=0;
   
    public static Node delete1(delete list,int value,int c)
    {
        //c1++;
            System.out.println("c"+c);
        Node last,last1;
        //Node temp;
        last = list.head;
        for(int i=1;i<=c;i++)
        {
             if(value == last.data)
             {
        last.data = 0;
        //last.next = null;
      last = last.next;
        }
             else
             {
                 last=last.next;
             }
        }

return last;
 }
       
    //print for deletion
    public static int print1(delete list,int n)
    {
        int c = 0;
        Node curnode = list.head; // create node called curnode which contains list's head
        for(int i=0;i<n;i++)//check if curnode is empty
        {
            if(curnode.data != 0)
            {
            c++;
            System.out.println(curnode.data);
            curnode = curnode.next;
            }// print the value
            else
            {
            curnode = curnode.next; // moves further
              //System.out.println("c"+c);
            }
        }
        System.out.println("number of nodes:"+c);
        return c;
    }
   
    //print for insertion
    
    public static int print(delete list)
    {
        int c = 0;
        Node curnode = list.head; // create node called curnode which contains list's head
        while(curnode != null)//check if curnode is empty
        {
            c++;
            System.out.println(curnode.data); // print the value
            curnode = curnode.next; // moves further
              //System.out.println("c"+c);
        }
        System.out.println("number of nodes:"+c);
        return c;
    }
    
            
            
            
    
    public static void main(String[] args) 
    {
        int value;
        Scanner in = new Scanner(System.in);
       delete list = new  delete();
       int n;
       n=in.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++)
       {
           a[i] = in.nextInt();
       }
       //sorting the values
       
      for(int i=0;i<n;i++)
       {
            for(int j=0;j<n;j++)
       {
           if(a[i]<a[j])
           {
               int t =a[i];
               a[i] =a[j];
               a[j]=t;
           }
       }
       }
       for(int i=0;i<n;i++)
       {
       list.insert(list,a[i]);
       }
        print(list);
        System.out.println("enter the value");
       value = in.nextInt();
       delete1(list,value,c);
       
        print1(list,n);
        
        
    }
    
}
