public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Author secondAuthor = new Author("Александр", "Пушкин");
        Book firstBook = new Book(firstAuthor,1865,"Война и мир");
        Book secondBook = new Book(secondAuthor, 1836,"Евгений Онегин");
        firstBook.setYear(1877);
        System.out.println("firstAuthor = " + firstAuthor.getName() + " " + firstAuthor.getSurname() + "  firstBook = "  +firstBook.getYear() + " " + firstBook.getName());
        System.out.println("secondAuthor = " + secondAuthor.getName() + " " + secondAuthor.getSurname() + " secondBook = " + secondBook.getYear() +  " " + secondBook.getName());
    }
}