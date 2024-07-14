import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Map is like dictionary in python where values are stored in key-value pair
        //Map is implemented as

        // 1.HashMap
        System.out.println(".......................");
        Map<String, Integer> foodCount = new HashMap<>();
        foodCount.put("PlainDosa", 3);
        foodCount.put("MasalaDosa", 4);
        foodCount.put("Porota", 3);
        System.out.println(foodCount);
        System.out.println(foodCount.get("PlainDosa"));
        foodCount.put("PlainDosa", 8);
        System.out.println(foodCount);
        System.out.println(".......................");
        Set<String> keys = foodCount.keySet();
        System.out.println(keys);
        System.out.println(".......................");
        List<Integer> values = new ArrayList<>(foodCount.values());
        System.out.println(values);
        System.out.println(".......................");
        System.out.println(foodCount.containsKey("PlainDosa"));
        System.out.println(foodCount.containsValue(23));
        System.out.println(".......................");
        foodCount.remove("PlainDosa");
        System.out.println(foodCount);
        System.out.println(".......................");
        foodCount.put("PlainDosa", 8);
        foodCount.replace("Porota", 9);
        System.out.println(foodCount);
        System.out.println(".......................");
        foodCount.forEach((key, value)->{
            System.out.println("("+ key+ ", "+ value+ ")");
        });
        /*

        Output:
        .......................
        {PlainDosa=3, MasalaDosa=4, Porota=3}
        3
        {PlainDosa=8, MasalaDosa=4, Porota=3}
        .......................
        [PlainDosa, MasalaDosa, Porota]
        .......................
        [8, 4, 3]
        .......................
        true
        false
        .......................
        {MasalaDosa=4, Porota=3}
        .......................
        {PlainDosa=8, MasalaDosa=4, Porota=9}
        .......................
        (PlainDosa, 8)
        (MasalaDosa, 4)
        (Porota, 9)
        */



        // 2.TreeMap
        //Operations are same as HashMap,
        System.out.println(".......................");
        Map<Integer, String> studentDetails = new TreeMap<>();
        studentDetails.put(10, "Sachin");
        studentDetails.put(5, "Ajay");
        studentDetails.put(8, "Abilash");
        studentDetails.put(1, "Aakash");
        System.out.println(studentDetails);

        /*

        Output:
        .......................
        {1=Aakash, 5=Ajay, 8=Abilash, 10=Sachin}
        */
    }
}