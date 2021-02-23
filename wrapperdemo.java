package oops;

public class wrapperdemo
{
    public static void main(String[] args)
    {
        int i = 5;      // Primitive datatype
        Integer ii = new Integer(5);    // Wrapper class
        Integer iii = new Integer(i);   // Boxing or Wrapping
        int j = iii.intValue();     // Unboxing or Unwrapping
        Integer value = i;      // Autoboxing
        int k = value;          // Autounboxing

        String s = "123";
        int n = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(j);
        System.out.println(n);
    }
}
