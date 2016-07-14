#include <jni.h>

JNIEXPORT jstring JNICALL
Java_net_yxcoding_ndkutil_NDKUtil_getString(JNIEnv *env, jclass type) {

    // TODO


    return (*env)->NewStringUTF(env, "hello yxcoding!");
}