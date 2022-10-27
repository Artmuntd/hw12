public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Author secondAuthor = new Author("Александр", "Пушкин");
        Book firstBook = new Book(firstAuthor,1865);
        Book secondBook = new Book(secondAuthor, 1836);
        firstBook.setYear(1877);
        System.out.println("firstAuthor = " + firstAuthor.getName() + " " + firstAuthor.getSurname() + "  firstBook = "  +firstBook.getYear());
        System.out.println("secondAuthor = " + secondAuthor.getName() + " " + secondAuthor.getSurname() + " secondBook = " + secondBook.getYear());
    }
}