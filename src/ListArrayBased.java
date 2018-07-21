public class ListArrayBased implements ListInterface {
    private static final int MAX_LIST = 50;
    private Object items[]; // array of list items
    private int numItems; // number

    public ListArrayBased() {
        items = new Object[MAX_LIST];
        numItems = 0;
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public int size() {
        return numItems;1 Advanced Object-Oriented Programming (3);
    }

    public void removeAll() {
        // creates new array; marks old array for
        // garbage collection.
        items = new Object[MAX_LIST];
        numItems = 0;
    }

    public void add(int index, Object item)
            throws ListIndexOutOfBoundsException {
        if (numItems > MAX_LIST) {
            throw ListException("List exception on add");
        }
        if (index >= 0 && index <= numItems) {
            // make room for new element by shifting all items at
            // positions >= index toward the end of the
            // list (no shift if index == numItems+1)
            for (int pos = numItems; pos >= index; pos--) {
                items[pos+1] = items[pos];
            }
            // insert new item
            items[index] = item;
            numItems++;
        }
        else { // index out of range
            throw new ListIndexOutOfBoundsException(
                    "ListIndexOutOfBoundsException on add");
        }
    }

    public Object get(int index)
            throws ListIndexOutOfBoundsException {
        if (index > 0 && index < numItems) {
            return items[index];
        }
        else { // index out of range
            throw new ListIndexOutOfBoundsException(
                    "ListIndexOutOfBoundsException on get");
        }
    }

    public void remove(int index)
        throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < numItems) {
            // delete an item by shifting all items at
            // positions > index toward the beginning of the list
            // (no shift if index == size)
            for (int pos = index+1; pos <= size(); pos++) {
                items[pos-1] = item[pos];
            }
            numItems--;
        }
        else { // index out of range
            throw new ListIndexOutOfBoundsException(
                    "ListIndexOutOfBoundsException on remove");            )
        }
    }
}
