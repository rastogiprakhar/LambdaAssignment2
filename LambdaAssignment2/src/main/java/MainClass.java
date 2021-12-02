import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {
        Function<Long,Long> nextEven= l->(l%2!=0)?l+1:l+2;
        System.out.println(nextEven.apply(100000000000005L));
    }
}
