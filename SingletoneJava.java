/**
 * 饿汉式
 */

public final class SingletoneJava {

    public static final SingletoneJava INSTANCE;

    public SingletoneJava() {
    }

    static {
        System.out.println("INSTANCE = new SingletoneJava();");
        INSTANCE = new SingletoneJava();
    }

    public void test() {
        System.out.println(getClass().getSimpleName());
    }

}