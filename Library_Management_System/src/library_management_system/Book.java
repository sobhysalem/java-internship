
package library_management_system;

public class Book {
     private String title;
      private String ID;
      private boolean available;

    public Book(String title, String ID, boolean available) {
        this.title = title;
        this.ID = ID;
        this.available = available;
    }
    
     public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", ID=" + ID + ", available=" + available + '}';
    }

    
      
}
