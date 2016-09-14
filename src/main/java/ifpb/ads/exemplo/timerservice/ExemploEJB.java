package ifpb.ads.exemplo.timerservice;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2016, 08:51:23
 */
@Stateless
public class ExemploEJB {

    
    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void exemploTimer() {
        System.out.println("timer exemplo---");
    }
    @Schedule(minute = "5", hour = "9")
    public void exemploTimer2() {
        System.out.println("timer exemplo fixo---");
    }
    @Schedule(minute = "9", hour = "9", second = "10")
    public void exemploTimer6() {
        System.out.println("timer akjhfklsafiai fixo---");
    }

}
