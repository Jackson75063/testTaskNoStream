import java.util.ArrayList;

public class Main {

    public static void included(ArrayList <Object> list) {

        StringBuilder s = new StringBuilder(list.toString()) ;
        System.out.println("BEFORE:");
        System.out.println(s);
        for (int i = 1; i < s.length(); ++i) {
            if ( s.charAt(i) == '[' ||s.charAt(i) == ']') {
                s.deleteCharAt(i);
            }
        }

        System.out.println("AFTER:");
        System.out.println(s);
}



    public static void included(ArrayList <Object> list,int size) {

        StringBuilder s = new StringBuilder(list.toString()) ;
        System.out.println("BEFORE:");
        System.out.println(s);
        int includeArrRight=0;
        int includeArrLeft=0;

            for (int i = 1; i <s.length(); i++) {
                if (s.charAt(i) == '[' && includeArrLeft < size) {
                    s.deleteCharAt(i);
                    includeArrLeft++;
                }

                if (s.charAt(i) == ']' && includeArrRight < size) {
                    s.deleteCharAt(i);
                    includeArrRight++;
                }
            }

        System.out.println("AFTER:");
        System.out.println(s);

        //print like ArrayList
        /*
        ArrayList<Object> lol = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            lol.add(s.charAt(i));
        }

        for(Object q : lol){
            System.out.print(q);
        }
        */

    }

    public static void main(String[] args) {

        ArrayList<Object> mainList = new ArrayList<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);

        ArrayList<Object> newList1 = new ArrayList<>();
        newList1.add(5);
        newList1.add(6);
        newList1.add(7);
        newList1.add(8);

        ArrayList<Object> newList2 = new ArrayList<>();
        newList2.add(9);
        newList2.add(10);


        newList1.add(newList2);
        mainList.add(newList1);

        Main.included(mainList,1);
    }
}
