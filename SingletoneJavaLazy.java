/**
 * 懒汉式
 */
public class SingletoneJavaLazy {
    private volatile static SingletoneJavaLazy instance;

    private SingletoneJavaLazy() {
    }

    public static SingletoneJavaLazy getInstance() {
        if (instance == null) {
            synchronized (SingletoneJavaLazy.class) {
                if (instance == null) {
                    instance = new SingletoneJavaLazy();
                    System.out.println("instance = new SingletoneJavaLazy();");
                }
            }
        }
        return instance;
    }

    public void test() {
        System.out.println(getClass().getSimpleName());
    }
}