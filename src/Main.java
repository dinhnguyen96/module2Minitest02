public class Main {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.bookListDisplay();

        double sum = bookManager.getTotal();
        System.out.println("Sum book 10 in list : " + sum);

        int count = bookManager.bookQuantityCount();
        System.out.println("category 'One Fiction' book quantity : " + count);

        int lessPriceCount = bookManager.priceLessBookCount();
        System.out.println("100000 Less book quantity : " + lessPriceCount);


    }
}
