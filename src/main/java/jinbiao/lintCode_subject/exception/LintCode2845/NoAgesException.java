package jinbiao.lintCode_subject.exception.LintCode2845;

/**
 * @author jinbiao
 * @date 2022/2/10
 * @apiNote
 */
public class NoAgesException extends Exception{
    private String message;
    public NoAgesException(String message){
        super(message);
    }

}
