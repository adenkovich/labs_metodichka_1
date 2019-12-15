import pavlyutkin.lab1.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Преступление и наказание", "Достоевский Ф.М.", 90, "роман");
        Book b2 = new Book("Мастер и маргарита", "Булгаков М.A.", 180, "роман");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}