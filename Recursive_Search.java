package Nodes;

class Recursive_Search
{
    Node head ;

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data)
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

    class t1{
        Node temp = head;
        public void search(int search_data)
        {

            if (temp.next != null)
            {
                if (search_data == temp.data)
                {
                    System.out.println("Yes, Search data is here");
                }
                else
                    {
                    System.out.println("No Matching data here");
                    }
                temp = temp.next;
            }
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
}

class test1
{
    public static void main(String[] args)
    {
        Recursive_Search obj = new Recursive_Search();
        obj.push(9);
        obj.push(10);
        obj.push(11);
        obj.push(12);
        obj.push(13);
        obj.push(14);
        obj.push(15);
        obj.display();
        Recursive_Search.t1 obj1 = obj.new t1();
        obj1.search(12);
    }
}