package jinbiao.lintCode_subject.exception.LintCode2690;

/**
 * @author jinbiao
 * @date 2022/2/10
 * @apiNote
 */
public class Calculators {
    private static boolean check = false;

    public boolean getCheck() {
        return check;
    }

    public int calc(int a, int b)  {
        this.check = true;
        return a/b;
    }
}
