/**
 * Created by OEM on 27.09.2018.
 */
import edu.princeton.cs.introcs.*;
import edu.princeton.cs.introcs.Draw;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.Stopwatch;
import javafx.scene.paint.Stop;

public class Main {
    public static void main(String[] args) {
        Draw draw1 = new Draw("Test client 1");

        for (double i = 0.1; i <4 ; i=i+0.25) {
            for (double j = 0.1; j <4 ; j=j+0.25) {
                draw1.square(j,i,0.1);
            }
        }

        System.out.println("This is developer1 Branch ");


//        draw1.square(0.1,0.1,0.1);
//        draw1.square(0.35,0.1,0.1);


//        while(true){
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            StdDraw.setPenRadius(0.05);
//            StdDraw.setPenColor(StdDraw.BLUE);
//            StdDraw.point(Math.random(), Math.random());
//
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            StdDraw.clear();
//        }

    }

    public static void  ShowSomething(){
        System.out.println("kek");
    }

}
