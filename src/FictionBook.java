public class FictionBook extends Book
{
    private String category;

    public FictionBook()
    {
        super();
        this.category = "";
    }

    public FictionBook(String bookCode, String bookName, double bookPrice, String bookAuthor, String category) {
        super(bookCode, bookName, bookPrice, bookAuthor);
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
}
