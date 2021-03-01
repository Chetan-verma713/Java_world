package Node.Stack;

public class Stack<T>
{
    Node head;
    Node tail;

    public void push(T new_data)
    {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = tail = new_node;
        }
        else
        {
            tail.setNext(new_node);
            tail = new_node;
        }
    }
    public void pop()
    {
        if (head == null)
        {
            System.out.println("No Node Exists");
        }
        else
        {
            head = head.getNext();

        }
    }
}
