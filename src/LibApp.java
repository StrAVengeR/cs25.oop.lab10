public class LibApp {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Suun zam", 2020));
        lib.addBook(new Book("Mongoliin nuuts towcoo", 1980));

        for (Book b : lib.getBooksAfter(2000)) {
            System.out.println(b);
        }
    }
}
