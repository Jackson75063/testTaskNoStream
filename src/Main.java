import java.util.ArrayList;

public class Main {

    public  ArrayList<Object> flatten(ArrayList<Object> mainList,int dimension) {
        int size=0;
        ArrayList<Object> result = new ArrayList<>();

        for (Object aMainList : mainList) {
            if (aMainList instanceof ArrayList && size != dimension) {
                result.addAll(flatten((ArrayList<Object>) aMainList, dimension - 1));
                ++size;
            } else {
                result.add(aMainList);
            }
        }
        return result;
    }


    public ArrayList<Object> flatten(ArrayList<Object> mainList) {
        ArrayList<Object> newList = new ArrayList<>();

        for (Object element : mainList) {
            if (element instanceof ArrayList) {
                newList.addAll(flatten((ArrayList<Object>) element));
            } else {
                newList.add(element);
            }
        }
        return newList;
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

        ArrayList<Object> newList3 = new ArrayList<>();
        newList3.add(99);

        newList2.add(newList3);
        newList1.add(newList2);
        mainList.add(newList1);

        Main m = new Main();
        ArrayList<Object> demoList = m.flatten(mainList);

        for (Object o : demoList) {
            System.out.print(o+" ");
        }

        System.out.println();

        demoList = m.flatten(mainList,1);

        for (Object o : demoList) {
            System.out.print(o+" ");
        }
    }
}


