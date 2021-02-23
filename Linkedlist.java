package Nodes;

public class Linkedlist{
    Node head;
    Node tail;

    class Node{

        int data;
        Node next;
        Node prev;
        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public int length()
    {
        int len = 0;
        if (head != null)
        {
            len = 1;
            Node temp = head;
            while (temp.next != null)
            {
                len++;
                temp = temp.next;
            }
        }
        return len;
    }

    public void pushfromfirst(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

    public void pushfromlast(int new_data)
    {
        Node new_node = new Node(new_data);
        Node temp = head;
        if(temp == null)
        {
            head = new_node;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void popfromfirst()
    {
        head = head.next;
    }

    public void popfromlast()
    {
        if(head == null)
        {
            System.out.println("No Node Exists");
        }
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
    }

    public void deletenode(int position)
    {

        if (head == null)
        {
            System.out.println("No Node Exists !!!");
        }
        else
        {
            int count = length();
            Node temp = head;
            for (int i = 1; i < position-1; i++)
            {
                temp = temp.next;
            }
            Node t = temp.next;
            temp.next = t.next;
            t.next.prev = temp;
        }
    }

    public void display()
    {
        while(head!=null)
        {
            System.out.print(head.data + "   ");
            head = head.next;
        }
    }

    public void insert(int search_data, int new_data)
    {
        Node new_node = new Node(new_data);
        Node search_node = new Node(search_data);

        if (head == null)
        {
            head = new_node;
        }
        else
        {
            Node temp1 = head;
            Node temp2 = head;
            int position = length();
            int count = 0;
            for (int i = 1; i <= position; i++)
            {
                if (temp1 == search_node)
                {
                    count = i;
                }
                temp1 = temp1.next;
            }
            int tmp = 0;
            while (temp2.next != null)
            {
                for (int i = 1; i <= count; i++)
                {
                    temp2 = temp2.next;
                }
                Node t = temp2.next;
                temp2.next = new_node;
                new_node.next = t;

                if (tmp == count & temp2.data == search_node.data)
                {
                    t = temp2.next;
                    temp2.next = new_node;
                    new_node.next = t;
                }
                if (tmp != count & temp2.data == search_node.data)
                {
                    tmp++;

                }
                else
                    {
                        temp2 = temp2.next;
                    }
            }
        }
    }
}

class t1
{
    public static void main(String[] args)
    {
        Linkedlist obj = new Linkedlist();
        obj.pushfromfirst(50);
        obj.pushfromfirst(20);
        obj.pushfromfirst(30);
        obj.pushfromfirst(20);
        obj.pushfromfirst(10);
        obj.insert(20,40);
        obj.display();
    }
}