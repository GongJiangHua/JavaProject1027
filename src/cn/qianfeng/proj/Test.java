package cn.qianfeng.proj;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Stack stack = new Stack();
        PriorityQueue priorityQueue = new PriorityQueue();

//        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        for (Object e : arrayList){
//            System.out.println(e);
//        }
//        Iterator it = arrayList.iterator();
//        while (it.hasNext()){
//            Object e = it.next();
//        }
//        int[] arr = {1,1,1,1};
//        for (int e : arr){
//            System.out.println(e);
//        }
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(1));
        for (Employee e: arrayList){
            String[] arr = {};
            e.saveMoney(arr);
        }
//1、集合存入8个对象，不同id，通过id给集合中的元素排序（升序）
        int[] mixArr = {1,3,5,2,8,4,6};
        ArrayList<Employee> arrayList1 = new ArrayList<>();
        arrayList1.add(new Employee(1));
        arrayList1.add(new Employee(2));
        arrayList1.add(new Employee(4));
        arrayList1.add(new Employee(5));
        arrayList1.add(new Employee(6));
        arrayList1.add(new Employee(7));
        for (int i = 0;i<arrayList1.size();i++){
            ;
        }
        Arrays.sort(mixArr);
        for (int e : mixArr){
            System.out.println(e);
        }
    }
}
