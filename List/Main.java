package List;

import java.util.Iterator;

public class Main {

    /**
     * Helper function to fill the list with items
     * 
     * @param list
     */
    public static void populate(OrderedList<String> list) {
        list.add("first");
        list.add("second");
        list.add("third");
    }

    public static void testAdd() {
        OrderedList<String> list1 = new OrderedList<String>();
        populate(list1);

        if (list1.toString().equals("first second third ")) {
            System.out.println("add test passed");
        } else {
            System.out.println("add test failed");
        }

        System.out.println(list1.toString() + "\n");
    }

    public static void testIterator() {
        OrderedList<String> list1 = new OrderedList<String>();
        populate(list1);

        Iterator<String> itr = list1.iterator();
        if (itr.next() != "first")
            System.out.println("iterator test failed");
        else if (itr.next() != "second")
            System.out.println("iterator test failed");
        else if (itr.next() != "third")
            System.out.println("iterator test failed");
        else
            System.out.println("iterator test passed");

        System.out.println(list1.toString() + "\n");
    }

    public static void testGet() {
        OrderedList<String> list1 = new OrderedList<String>();
        populate(list1);

        if ((list1.get(0).equals("first")) && (list1.get(1).equals("second")) && (list1.get(2).equals("third"))) {
            System.out.println("get test passed");
        } else {
            System.out.println("get test failed");
        }

        System.out.println(list1.toString() + "\n");
    }

    public static void testSize() {
        OrderedList<String> list1 = new OrderedList<String>();
        OrderedList<String> list2 = new OrderedList<String>();

        populate(list2);

        if (list1.size() == 0 && list2.size() == 3) {
            System.out.println("size test passed");
        } else {
            System.out.println("size test failed");
        }

        System.out.println(list2.toString() + "\n");

    }

    public static void testRemove() {
        OrderedList<String> list1 = new OrderedList<String>();
        OrderedList<String> list2 = new OrderedList<String>();
        OrderedList<String> list3 = new OrderedList<String>();
        populate(list1);
        populate(list2);
        populate(list3);

        boolean passed;

        if (list1.remove("second") != true) {
            passed = false;
        } else if (!(list1.get(0).equals("first")) && (!list1.get(1).equals("third"))) {
            passed = false;
        } else if (list1.size() != 2) {
            passed = false;
        } else {
            passed = true;
        }

        if (list2.remove("first") != true) {
            passed = false;
        } else if (!(list2.get(0).equals("second")) &&
                (!list2.get(1).equals("third"))) {
            passed = false;
        } else if (list2.size() != 2) {
            passed = false;
        } else {
            passed = true;
        }

        if (list3.remove("third") != true) {
            passed = false;
        } else if (!(list3.get(0).equals("first")) &&
                (!list3.get(1).equals("second"))) {
            passed = false;
        } else if (list3.size() != 2) {
            passed = false;
        } else {
            passed = true;
        }

        if (list1.remove("not in the list") == false) {
            passed = true;
        } else {
            passed = false;
        }

        if (passed) {
            System.out.println("remove test passed");
        } else {
            System.out.println("remove test failed");
        }
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString() + "\n");

    }

    public static void main(String[] args) {
        // testAdd();
        // testIterator();
        // testGet();
        // testSize();
        // testRemove();

        OrderedList<String> list = new OrderedList<String>();
        OrderedList<String> list2 = new OrderedList<String>();
        OrderedList<String> list3 = new OrderedList<String>();

        list.add("hello");

        for (int i = 0; i < 3; i++) {
            list3.add("item" + i);
        }
        System.out.println(list.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
    }

}
