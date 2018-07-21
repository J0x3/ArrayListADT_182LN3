public class Exceptions {
    public class ListIndexOutOfBoundsException
            extends IndexOutOfBoundsException {
        public ListIndexOutOfBoundsException(String s) {
            super(s);
        }
    }
    public class ListException extends RuntimeException {
        public ListException(String s) {
            super(s);
        }
    }
}
