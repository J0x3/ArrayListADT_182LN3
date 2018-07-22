public class Main {
    public static void main(String[] args) {
	// write your code here
        //.....
        ListArrayBased aList = new ListArrayBased();
        String dataItem;
        //test all operations
        System.out.println("Size: " + aList.size());
        aList.add(0, "John");
        aList.add(1, "Tim");
        aList.add(2, "Sally");
        aList.add(3, "Edna");
        System.out.println("Size: " + aList.size());
        Object value = aList.get(2);
        System.out.println("Index 2: " + value);
        aList.displayList();
        aList.remove(2);
        aList.displayList();
        System.out.println(aList.get(0));
        System.out.println(aList.get(1));
        System.out.println(aList.get(2));
        System.out.println("Size: " + aList.size());
        boolean empty = aList.isEmpty();
        if (empty)
            System.out.println("Array Empty before isEmpty()");
        aList.removeAll();
        empty = aList.isEmpty();
        if (empty)
            System.out.println("Array Empty after isEmpty()");

        //....
    }
}
