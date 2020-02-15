
import java.util.ArrayList;
import java.util.Arrays;


class List {

    public static void main(String[] args) {
        String[] books = {"Java", "JavaScript","COBOl"};
        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Maths");
        subjects.add("Science");
        System.out.println(books.length);
        System.out.println(subjects.size());
        subjects.add("english");
        System.out.println(subjects.get(1));
        System.out.println(subjects.indexOf("english"));
        subjects.set(0,"arts");
        System.out.println(subjects);
        System.out.println(Arrays.toString(books));


    }

}
