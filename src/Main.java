import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your book: " + "(CHILDREN_BOOK or COMIC_BOOK)");

        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        sc.close();


        Book book = new Book();

        switch(type) {
            case CHILDREN_BOOK :
                book = new CHILDREN_BOOK();
                break;
            case COMIC_BOOK :
                book = new COMIC_BOOK();
                break;
        }


    }
}