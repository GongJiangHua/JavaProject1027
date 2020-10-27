package cn.qianfeng.proj;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Stack stack = new Stack();
        PriorityQueue priorityQueue = new PriorityQueue();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(treeMap);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        for (Object e : arrayList){
            System.out.println(e);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            Object e = it.next();
        }
        int[] arr = {1,1,1,1};
        for (int e : arr){
            System.out.println(e);
        }
    }
}
