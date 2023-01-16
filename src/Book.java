public class Book
{
    private String bookCode;
    private String bookName;
    private double bookPrice;
    private String bookAuthor;


    public Book()
    {
        this.bookCode = "";
        this.bookName = "";
        this.bookPrice = 0.0;
        this.bookAuthor = "";
    }

    public Book(String bookCode, String bookName, double bookPrice, String bookAuthor)
    {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }

    public String getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return this.bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}