public class BookManager {

    private Book[] bookList;

    public BookManager() {
        bookList = new Book[10];
        bookList[0] = new ProgrammingBook("1", "Core Java Volume 1 11th", "Java", 420000, "HorstMann");
        bookList[1] = new ProgrammingBook("2", "Core Java Volume 2 7th", "Java", 83000, "HorstMann");
        bookList[2] = new ProgrammingBook("3", "Head First Java, 2nd Edition", "Java", 241000, "Bert Bann");
        bookList[3] = new ProgrammingBook("4", "Java All-In-One For Dummies", "Java", 623000, " Doug Lowe");
        bookList[4] = new ProgrammingBook("5", "Java: A Beginner's Guide, Eighth Edition", "Java", 360000, "Herbert Schildt");
        bookList[5] = new FictionBook("6", "The Light Pirate", 400000, " Lily Brooks-Dalton", "One Fiction");
        bookList[6] = new FictionBook("7", "Wicked Dreams", 350000, "Lisa Jackson", "One Fiction");
        bookList[7] = new FictionBook("8", "Roses, in the Mouth of a Lion", 250000, " Bushra Rehman", "Two Fiction");
        bookList[8] = new FictionBook("9", "The Book of Everlasting Things", 95000, " Aanchal Malhotra", "Two Fiction");
        bookList[9] = new FictionBook("10", "Someone Had To Do It", 325000, "Amber Brown", "Three Fiction");
    }

    private Book[] getBookList() {
        return this.bookList;
    }

    public void bookListDisplay()
    {
        for (Book books : this.getBookList())
        {
            System.out.printf("%s %s %f %s\n", books.getBookCode(), books.getBookName(),
                    books.getBookPrice(), books.getBookAuthor());
        }
    }
    public double getTotal()
    {
        double sum = 0;
        for (Book books: bookList)
        {
            sum += books.getBookPrice();
        }
        return sum;
    }
    public int bookQuantityCount()
    {
        int count = 0;
        for (Book book: bookList)
        {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory().equalsIgnoreCase("One Fiction"))
            {
                 count++;
            }
        }
        return count;
    }

    public int priceLessBookCount()
    {
        int count = 0;
        for (Book book: bookList)
        {
            if (book.getBookPrice() < 100000)
            {
                count++;
            }
        }
        return count;
    }
}
