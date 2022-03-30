package xyz.phxqun.util;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();
    private RandomUtil(){

    }
    public static Integer randomInteger(Integer min, Integer max){
        return random.nextInt(max - min + 1) + min;
    }
}
