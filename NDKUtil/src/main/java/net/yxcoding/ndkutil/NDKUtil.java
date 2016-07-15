package net.yxcoding.ndkutil;

/**
 * User: yxfang
 * Date: 2016-07-14
 * Time: 17:19
 * ------------- Description -------------
 * NDK Native 调用
 * ---------------------------------------
 */
public class NDKUtil
{
    static {
        System.loadLibrary("ndkLib");
    }
    public static native String getString();
}
