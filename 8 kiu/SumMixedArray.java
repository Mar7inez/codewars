import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            if (o instanceof Integer) {
                sum += (Integer) o;
            } else if (o instanceof String) {
                sum += Integer.parseInt((String) o);
            }
        }
        return sum;
    }

}