public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Артём", "ar.pavlyutkin@gmail.com",'M');
        System.out.println(a1);
        a1.setEmail("artempavlyutkin@gmail.com");
        System.out.println(a1);
    }
}