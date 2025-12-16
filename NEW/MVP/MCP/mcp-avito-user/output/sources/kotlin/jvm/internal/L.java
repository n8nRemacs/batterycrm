package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.InterfaceC42733c0;
import kotlin.KotlinNullPointerException;

/* compiled from: Intrinsics.java */
/* loaded from: classes8.dex */
public class L {

    /* compiled from: Intrinsics.java */
    @InterfaceC42733c0
    public static class a {
    }

    @InterfaceC42733c0
    public static boolean a(double d12, Double d13) {
        return d13 != null && d12 == d13.doubleValue();
    }

    @InterfaceC42733c0
    public static boolean b(float f12, Float f13) {
        return f13 != null && f12 == f13.floatValue();
    }

    @InterfaceC42733c0
    public static boolean c(Double d12, Double d13) {
        if (d12 == null) {
            if (d13 != null) {
                return false;
            }
        } else if (d13 == null || d12.doubleValue() != d13.doubleValue()) {
            return false;
        }
        return true;
    }

    @InterfaceC42733c0
    public static boolean d(Float f12, float f13) {
        return f12 != null && f12.floatValue() == f13;
    }

    @InterfaceC42733c0
    public static boolean e(Float f12, Float f13) {
        if (f12 == null) {
            if (f13 != null) {
                return false;
            }
        } else if (f13 == null || f12.floatValue() != f13.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int g(int i12, int i13) {
        if (i12 < i13) {
            return -1;
        }
        return i12 == i13 ? 0 : 1;
    }

    public static int h(long j12, long j13) {
        if (j12 < j13) {
            return -1;
        }
        return j12 == j13 ? 0 : 1;
    }

    public static void i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(stackTrace[i13].getClassName())) {
                i12 = i13;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i12 + 1, length));
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static void k() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        i(kotlinNullPointerException, L.class.getName());
        throw kotlinNullPointerException;
    }

    public static void l() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
