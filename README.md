# Java-Pixel-Automation-for-Standoff2
This repository contains a **legacy experiment** using Java's `Robot` class to automate UI interactions based on pixel colors.
It was originally designed for Standoff 2 automation but has been intentionally disabled due to changes in the game's UI (particles) and is provided solely for educational purposes.
<br>
```java
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
```
<br>

**Important:**  
- Originally made for educational purposes only.  
- The code is **non-functional** due to dynamic visual effects (particles, animations).  
- This project is provided **solely for learning and historical reference**.

<br>

## Authors
- uxokpro1234
- Dragon6555

<br>

## Notes
- Do **not** attempt to use this in live applications or games.  
- Coordinates, colors, and automation logic are specific to the original experiment and may **cause unintended behavior**.
