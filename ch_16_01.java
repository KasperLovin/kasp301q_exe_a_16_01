import java.util.ArrayList;
import java.util.List;

public class ch_16_01
{
    /*Write a method called set that accepts an index and a value and sets the list’s element at that index to have the
    given value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).*/

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        set(4,0,list);
        System.out.println(list);
    }
    public static void set(int value, int index, LinkedIntList Liste)
    {
        ListNode node = Liste.nodeAt(index);
        node.data = value;
    }

}
