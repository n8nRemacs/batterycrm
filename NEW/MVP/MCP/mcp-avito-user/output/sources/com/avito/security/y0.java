package com.avito.security;

import androidx.media3.common.C23088b;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class y0 {
    private y0() {
    }

    private static String a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder sbB = C23088b.b("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbB.append(str);
        return sbB.toString();
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            b(str);
        }
    }

    private static void b(String str) {
        throw ((NullPointerException) a(new NullPointerException(a(str))));
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    private static <T extends Throwable> T a(T t12) {
        return (T) a((Throwable) t12, y0.class.getName());
    }

    public static <T extends Throwable> T a(T t12, String str) {
        StackTraceElement[] stackTrace = t12.getStackTrace();
        int length = stackTrace.length;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(stackTrace[i13].getClassName())) {
                i12 = i13;
            }
        }
        t12.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i12 + 1, length));
        return t12;
    }

    public static void a() {
        throw ((NullPointerException) a(new NullPointerException()));
    }

    public static void a(Object obj) {
        if (obj == null) {
            a();
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) a(new NullPointerException(androidx.appcompat.app.r.q(str, " must not be null"))));
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
