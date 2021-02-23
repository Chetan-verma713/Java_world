package Nodes;


import java.util.Scanner;


class queuebyll
{
    Node head ;
    Node tail ;

    class Node{
        Node next;
        char data;

        Node(char data)
        {
            next = null;
            this.data = data;
        }
    }

    public void push(char ch)
    {
        Node new_node = new Node(ch);
        if (head == null)
        {
            head = tail = new_node;
            System.out.println(head.data + "  head pushed!!");
        }
        else
        {
            tail.next = new_node;
            tail = tail.next;
            System.out.println(tail.data+ "  tail pushed!!");
        }
    }

    public char pop()
    {
        if (head == null)
        {
            System.out.println("No Node Exists !!");
        }
        else
        {
            System.out.println(head.data + "  head popped!!");
            head = head.next;
            return head.data;
        }
        return 0;
    }

    public void peek()
    {
        System.out.println(tail.data);
    }

    public void show()
    {
        while (head.next.next != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}

class test
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.next();
        char[] arr = str.toCharArray();
        queuebyll obj = new queuebyll();
        for (char k: arr)
        {
            obj.push(k);
        }
        obj.pop();
    }
}
