package Task05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Subject> listSubjects = new ArrayList<>();
        listSubjects.add(new Subject("Subject1", 1, 8));
        listSubjects.add(new Subject("Subject2", 2, 5));
        listSubjects.add(new Subject("Subject3", 6, 1));
        listSubjects.add(new Subject("Subject4", 3, 4));
        listSubjects.add(new Subject("Subject5", 1, 8));
        listSubjects.add(new Subject("Subject6", 2, 5));
        listSubjects.add(new Subject("Subject7", 6, 1));
        listSubjects.add(new Subject("Subject8", 3, 4));

        Safe safe = new Safe(5);
        safe.iterateList(listSubjects);

        System.out.println("Состав массива:");

        for (Subject element: safe.getBestSet()) {
            System.out.println(element.toString());
        }
    }
}
