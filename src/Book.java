public class Book {
    private Author author;
    private int year;
    public Book(  Author author, int year){

        this.author = author;
        this.year=year;

    }
    public  Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public  void setYear( int year){
        this.year = year;
    }
}
