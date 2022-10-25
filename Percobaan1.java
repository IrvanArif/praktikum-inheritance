class Parent {
    public int X = 5;
}
class Child extends Parent {
    public int X = 10;
    public void info (intX) {
        system.out.println("nilai x sebagai parameter = " + x);
        system.out.println("Data member x di class Child = " + this.X);
        system.out.println("Data member x di class Parent = " + super.X);
    }
}

public class nilaiX {
    public stattic void public static void main(String[] args) {
        Child  tes = new Child();
        tes.info(20);
    }
}