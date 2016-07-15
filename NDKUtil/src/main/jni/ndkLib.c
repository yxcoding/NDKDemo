#include <jni.h>
#include <android/log.h>

#define  LOG_TAG "NDKUtil"
#define  LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,LOG_TAG,__VA_ARGS__)

JNIEXPORT jstring JNICALL
Java_net_yxcoding_ndkutil_NDKUtil_getString(JNIEnv *env, jclass type) {

    // TODO
    LOGD("执行");

    return (*env)->NewStringUTF(env, "Hello, yxcoding");
}