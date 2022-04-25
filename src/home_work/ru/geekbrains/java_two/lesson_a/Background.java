package home_work.ru.geekbrains.java_two.lesson_a;

import java.awt.*;
import java.util.Random;

public class Background{
    private static Random rnd = new Random();
    private Color color;
    Background(GameCanvas canvas){
        if (canvas.background_change_interval >= 16) {
            color = new Color(rnd.nextInt());
            canvas.setBackground(color);
            canvas.background_change_interval = 0;
        }

    }


}
