import java.awt.*;
import java.util.*;
import java.util.List;

import org.jcp.xml.dsig.internal.dom.Utils;

/**
 * @author Dragon6555, uxokpro1234
 * 06.18.23
 * 
 * Non-functional Java Robot experiment.
 * Provided for educational purposes only.

 */
public class Main {
    private static boolean isFirstThreadRunning = false;

    private static Color color11, color12, color21, color22, color31, color32, color41, color42, color51, color52;

    private static final List<Color> colorList01 = new ArrayList<>();

    private static final List<Color> colorList0 = new ArrayList<>();
    private static final List<Color> colorList1 = new ArrayList<>();
    private static final List<Color> colorList2 = new ArrayList<>();
    private static final List<Color> colorList3 = new ArrayList<>();
    private static final List<Color> colorList4 = new ArrayList<>();
    private static final List<Color> colorList5 = new ArrayList<>();
    private static final List<Color> colorList6 = new ArrayList<>();

    private static final List<Color> colorList7 = new ArrayList<>();

    private static final List<Color> colorList8 = new ArrayList<>();


    static {

        // colors to the list
        colorList01.add(new Color(38, 48, 65));

        colorList0.add(new Color(38, 48, 61));

        colorList1.add(new Color(36, 40, 55));

        colorList2.add(new Color(34, 43, 58));

        colorList3.add(new Color(36, 38, 52));

        colorList4.add(new Color(36, 36, 49));

        colorList5.add(new Color(33, 33, 48));

        colorList6.add(new Color(31, 31, 45));

        colorList7.add(new Color(30, 30, 43));

        colorList8.add(new Color(30, 30, 43));

    }
    public static void main(String[] args) {

        /*Timer.sleep(3000);

        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
        System.out.print(x + ", " + y);

*/


        System.out.println("[+STARTING+]");

        Timer.sleep(3000);



        Thread truefalse = new Thread(() -> {
            System.out.println("Thread timeout activated..");
            boolean a0 = true;
            boolean a1 = true;


            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }

            //Code for the first part
            while (true) {
                // Your code logic  was here
                Color truefals = robot.getPixelColor(983,334);
                Color truefal = robot.getPixelColor(1053,415);


                if(Objects.equals(truefals, new Color(37, 49, 62))){
                    a0 = true;
                    //System.out.println(a0 + " positive 1");
                }
                if(Objects.equals(truefal, new Color(34, 44, 56))){
                    a1 = true;
                    //System.out.println(a1 + " positive 2");

                }


                if(!Objects.equals(truefals, new Color(37, 49, 62))){
                    a0 = false;
                    //System.out.println(a0 + " negative 1");
                }
                if(!Objects.equals(truefal, new Color(34, 44, 56))){
                    a1 = false;
                    //System.out.println(a1 + " negative 2");

                }
                if(!(a0 & a1)){
                    isFirstThreadRunning = false;
                    System.out.println(isFirstThreadRunning);
                }
                if((a0 & a1)){
                    isFirstThreadRunning = true;
                    System.out.println(isFirstThreadRunning);

                }

            }
        });

        Thread thread = new Thread(() -> {
            System.out.println("thread");

            while (true) {


                try {
                    Utils.refresh();
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }
                Timer.sleep(3000);
            }
        });



        Thread thread2 = new Thread(() -> {
            System.out.println("Main loaded...");

            // Code for the second part
            while (true) {

                if(isFirstThreadRunning = true){
                    Robot robot = null;
                    try {
                        robot = new Robot();
                    } catch (AWTException e) {
                        throw new RuntimeException(e);
                    }

                    color11 = robot.getPixelColor(928,375);//1.1
                    color12 = robot.getPixelColor(961,373);//1.2

                    color21 = robot.getPixelColor(929,466);//2.1
                    color22 = robot.getPixelColor(965,468);//2.2

                    color31 = robot.getPixelColor(930,558);//3.1
                    color32 = robot.getPixelColor(964,559);//3.2

                    color41 = robot.getPixelColor(926,650);//4.1
                    color42 = robot.getPixelColor(961,650);//4.2

                    color51 = robot.getPixelColor(929,735);//5.1
                    color52 = robot.getPixelColor(963,734);//5.2

                    //CONDITION
                    // skazi cjesno ti dolbojob ili pretvorjajeshsja??? NAHUJA???
                    if(isFirstThreadRunning = true){

                        try {
                            slot1(color11, color12);
                            slot2(color21, color22);
                            slot3(color31, color32);
                            slot4(color41, color42);
                            slot5(color51, color52);

                        }
                        catch (AWTException e) {
                            throw new RuntimeException(e);
                        }
                    }else{System.out.println("isFirstThreadRunning = false");}


                }}
        });

        truefalse.start();
        thread2.start();
        thread.start();
        System.out.println("+Trade bot was loaded+");


//CRAZY UXOOOOO
    }

    public static void slot1(Color color, Color color1) throws AWTException {
        boolean isSimilar = false;
        boolean isSimilar1 = false;



        for (Color color3 : colorList01) {
            if (Utils.isSimilar(color, color3)) {
                isSimilar = true;
                break;
            }
        }
        for (Color color4 : colorList0) {
            if (Utils.isSimilar(color1, color4)) {
                isSimilar1 = true;
                break;
            }
        }


        if (!isSimilar && !isSimilar1) {
            Utils.click(1375, 372);
            Timer.sleep(20);
            Utils.click(761, 574);

            System.out.println("1");
            Timer.sleep(10000);
        }
    }


    public static void slot2(Color color, Color color1) throws AWTException {
        boolean isSimilar = false;
        boolean isSimilar1 = false;

        for (Color color3 : colorList1) {
            if (Utils.isSimilar(color, color3)) {
                isSimilar = true;
                break;
            }
        }
        for (Color color4 : colorList2) {
            if (Utils.isSimilar(color1, color4)) {
                isSimilar1 = true;
                break;
            }
        }



        if (!isSimilar && !isSimilar1) {
            Utils.click(1385, 473);
            Timer.sleep(20);
            Utils.click(761, 574);

            System.out.println("2");
            Timer.sleep(10000);

        }
    }

    public static void slot3(Color color, Color color1) throws AWTException {
        boolean isSimilar = false;
        boolean isSimilar1 = false;


        for (Color color3 : colorList3) {
            if (Utils.isSimilar(color, color3)) {
                isSimilar = true;
                break;
            }
        }

        for (Color color4 : colorList4) {
            if (Utils.isSimilar(color1, color4)) {
                isSimilar1 = true;
                break;
            }
        }
        if (!isSimilar && !isSimilar1) {
            Utils.click(1385, 550);
            Timer.sleep(20);
            Utils.click(761, 574);

            System.out.println("3");
            Timer.sleep(10000);

        }
    }

    public static void slot4(Color color, Color color1) throws AWTException {

        boolean isSimilar = false;
        boolean isSimilar1 = false;

        for (Color color3 : colorList5) {
            if (Utils.isSimilar(color, color3)) {
                isSimilar = true;
                break;
            }
        }

        for (Color color4 : colorList6) {
            if (Utils.isSimilar(color1, color4)) {
                isSimilar1 = true;
                break;
            }
        }

        if (!isSimilar && !isSimilar1) {
            Utils.click(1385, 650 );
            Timer.sleep(20);
            Utils.click(761, 574);

            System.out.println("4");
            Timer.sleep(10000);

        }
    }


    public static void slot5(Color color, Color color1) throws AWTException {

        boolean isSimilar = false;
        boolean isSimilar1 = false;

        for (Color color3 : colorList7) {
            if (Utils.isSimilar(color, color3)) {
                isSimilar = true;
                break;
            }
        }
        for (Color color4 : colorList8) {
            if (Utils.isSimilar(color1, color4)) {
                isSimilar1 = true;
                break;
            }
        }

        if (!isSimilar && !isSimilar1) {
            Utils.click(1385, 720);
            Timer.sleep(20);
            Utils.click(761, 574);

            System.out.println("5");
            Timer.sleep(10000);

        }
    }
}
