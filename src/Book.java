public class Book {
    private Author author;

    private  String name;
    private int year;


    public Book(  Author author, int year, String name){

        this.author = author;
        this.year=year;
        this.name = name;

    }
    public  Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }

    public String getName(){
        return this.name;
    }
    public  void setYear( int year){
        this.year = year;
    }
}
