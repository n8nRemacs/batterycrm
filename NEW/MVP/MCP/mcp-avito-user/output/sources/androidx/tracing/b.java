package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import j.N;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static long f54638a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f54639b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f54640c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f54641d;

    public static void a(int i12, @N String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            d.a(i12, e(str));
            return;
        }
        String strE = e(str);
        try {
            if (f54640c == null) {
                f54640c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f54640c.invoke(null, Long.valueOf(f54638a), strE, Integer.valueOf(i12));
        } catch (Exception e12) {
            c(e12);
        }
    }

    public static void b(int i12, @N String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            d.b(i12, e(str));
            return;
        }
        String strE = e(str);
        try {
            if (f54641d == null) {
                f54641d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f54641d.invoke(null, Long.valueOf(f54638a), strE, Integer.valueOf(i12));
        } catch (Exception e12) {
            c(e12);
        }
    }

    public static void c(@N Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.c();
        }
        try {
            if (f54639b == null) {
                f54638a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f54639b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f54639b.invoke(null, Long.valueOf(f54638a))).booleanValue();
        } catch (Exception e12) {
            c(e12);
            return false;
        }
    }

    @N
    public static String e(@N String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
