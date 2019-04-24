#include <jni.h>
#include <stdio.h>
#include "Dlink.h"

 JNIEXPORT int JNICALL Java_Dlink_add(JNIEnv *env, jobject obj, jint a, jint b)
 {
	printf("\n%d + %d = %d\n",a,b,(a+b));
	return;
 }

 JNIEXPORT int JNICALL Java_Dlink_sub(JNIEnv *env, jobject obj, jint a, jint b)
 {
     printf("\n%d - %d = %d\n",a,b,(a-b));
     return;
 }

 JNIEXPORT int JNICALL Java_Dlink_mult(JNIEnv *env, jobject obj, jint a, jint b)
 {
     printf("\n%d * %d = %d\n",a,b,(a*b));
     return;
 }

 JNIEXPORT int JNICALL Java_Dlink_div(JNIEnv *env, jobject obj, jint a, jint b)
 {
     printf("\n%d / %d = %d\n",a,b,(a/b));
     return;
 }
