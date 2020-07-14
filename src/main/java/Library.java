import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (capacityCheck()) {
            this.books.add(book);
        }
    }

    public boolean capacityCheck(){
        if(capacity > bookCount()){
            return true;
        }else{
            return false;
        }
    }

    public Book removeBook(Book book){
        int index = this.books.indexOf(book);
        return this.books.remove(index);
    }

    public HashMap genreCheck(){
        HashMap<String, Integer> genres = new HashMap<String, Integer>();
        for(Book book : books){

            String genre = book.getGenre();

            if (genres.containsKey(genre)){
//                int x = genres.get(genre) + 1;
                genres.replace(genre, 300);
            }else{
                genres.put(genre, 1);
            }
        }
        return genres;
    }

}
