public class App {
    public static void main(String[] args) {
        // 初始化
        boolean flag = false;
        try {
            Class.forName("SingletoneJava", flag, ClassLoader.getSystemClassLoader());
            Class.forName("SingletoneJavaLazy", flag, ClassLoader.getSystemClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("*********************");
        SingletoneJava.INSTANCE.test();
        SingletoneJavaLazy.getInstance().test();
    }
}