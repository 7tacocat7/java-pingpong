package models;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Guest on 8/1/17.
 */
public class PingPong {

    public List<Object> runPingPong(int countUpTo){
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++) {
            if (i % 3 == 0) {
                result.add("ping");
            } else {
                result.add(i);
            }
        }
        return result;
    }
}
