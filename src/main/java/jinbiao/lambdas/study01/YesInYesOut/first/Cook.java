package jinbiao.lambdas.study01.YesInYesOut.first;

/**jdk1.8特性:
 * 接口中可以定义默认实现方法和静态方法
 * 在接口中可以使用default和static关键字来修饰接口中定义的普通方法
 *
 * 使用Lambda必须有接口，并且接口中有且仅有一个抽象方法。
 * 只有当接口中的抽象方法存在且唯一时，才可以使用Lambda，但排除接口默认方法以及声明中覆盖Object的公开方法。
 */
public interface Cook {
    public default  String getName(){  //接口中可以定义默认实现方法
        return "zhangsan";
    }

    public static String getName2(){  //接口中可以定义静态方法
        return "zhangsan";
    }

    public abstract String makeFood(String str1,String str2);   //有入参有出参  抽象方法的 public abstract 是可以省略的：

    public static void main(String[] args) {
        String str1="hello";
        String str2=" world!";
        Cook cook = new Cook() {
            @Override
            public String makeFood(String str1, String str2) {
                System.out.println(str1 + str2);
                return str1 + str2;
            }
        };
        cook.makeFood(str1,str2);
    }
}
