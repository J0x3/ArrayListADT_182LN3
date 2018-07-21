public class Main {
    public static void main(String[] args) {
	// write your code here
        //.....
        ListArrayBased aList = new ListArrayBased();
        String dataItem;
        //test all operations
        aList.add(0, "John");
        aList.add(1, "Tim");
        aList.add(2, "Sally");
        aList.add(3, "Edna");
        Object value = aList.get(2);
        aList.remove(2);
        aList.size();
        boolean empty = aList.isEmpty();
        aList.removeAll();

        //....
    }
}
