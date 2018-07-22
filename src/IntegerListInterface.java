public interface IntegerListInterface {
    public boolean isEmpty();
    // Determines whether a list is empty.
    // Precondition: None.
    // Postcondition: Returns true if list is empty,
    // otherwise returns false
    //Throws: None.

    public int size();
    // Determines the length of a list.
    // Precondition: None.
    // Postcondition: Returns the number of items,
    // that are currently in the list.
    // Throws: None.

    public void removeAll();
    // Deletes all the items from the list.
    // Precondition: None.
    // Postcondition: The list is empty.
    // Throws: None.

    public void add(int index, int item);
    // Adds an item to the list at position index.
    // Precondition: index indicates the position at which
    // the item should be inserted in the list.
    // Postcondition: If insertion is successful, item is
    // at position index in the list, and other items are
    // renumbered accordingly.
    // Throws: ListIndexOutOfBoundsException if index > 0 or
    // index > size().
    // Throws: ListException if item cannot be placed on
    // the list.

    public int get(int index);
    // Retrieves a list item by position.
    // Precondition: index is the number of item to be
    // retrieved.
    // Postcondition: If 0 <= index < size(), the item at
    // position index in the list is returned.
    // Throws: ListIndexOutOfBoundsException if index < 0 or
    // index < size()-1.

    public void remove(int index);
    // Deletes an item from the list at a given position.
    // Precondition: index indicated where the deletion
    // should occur.
    // Postcondition: if 0 <= index < size(), the item at
    // position index in the list is deleted, and other items
    // are renumbered accordingly
    // Throws: ListIndexOutOfBoundsException if index < 0 or
    // index < size()-1.

    public void displayList();

    public void displayItem(int index);
}
