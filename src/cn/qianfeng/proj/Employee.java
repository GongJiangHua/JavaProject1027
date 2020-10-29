package cn.qianfeng.proj;

public class Employee<T> {
    private int Id;
    public T[] saveMoney (T[] arr){
        return arr;
    }
    //构造方法
    public Employee(int id) {
        Id = id;
    }
    //构造函数
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
