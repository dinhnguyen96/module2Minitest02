public class ProgrammingBook extends Book
{
    private String programmingLanguage;

    public ProgrammingBook()
    {
        super();
        this.programmingLanguage = "";
    }

    public ProgrammingBook(String bookCode, String bookName, String programmingLanguage,double bookPrice, String bookAuthor)
    {
        super(bookCode, bookName, bookPrice, bookAuthor);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage()
    {
        return this.programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage)
    {
        this.programmingLanguage = programmingLanguage;
    }


}
