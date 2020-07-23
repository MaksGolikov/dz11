import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("string 1 text");
        list.add("2 string 3 text");
        list.add("45");
        ConcatNumber concatNumber = new ConcatNumber();
        System.out.println(concatNumber.concat(list));

        List1 list1 = new List1();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.print();

        list1.removeAt(10);
        list1.print();

        System.out.println("index = " + list1.find(20));


    }
}
