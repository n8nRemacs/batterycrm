package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class kfi {
    public static final boolean[] a = new boolean[3];
    public static long b;
    public static Method c;
    public static Method d;

    public static final byte[] a(String str) {
        try {
            return str.getBytes(Charset.forName(HTTP.ASCII));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static void b(zt3 zt3Var, d58 d58Var, yt3 yt3Var) {
        yt3Var.o = -1;
        ft3 ft3Var = yt3Var.M;
        int[] iArr = yt3Var.p0;
        ft3 ft3Var2 = yt3Var.L;
        ft3 ft3Var3 = yt3Var.J;
        ft3 ft3Var4 = yt3Var.K;
        ft3 ft3Var5 = yt3Var.I;
        yt3Var.p = -1;
        if (zt3Var.p0[0] != 2 && iArr[0] == 4) {
            int i = ft3Var5.g;
            int iQ = zt3Var.q() - ft3Var4.g;
            ft3Var5.i = d58Var.k(ft3Var5);
            ft3Var4.i = d58Var.k(ft3Var4);
            d58Var.d(ft3Var5.i, i);
            d58Var.d(ft3Var4.i, iQ);
            yt3Var.o = 2;
            yt3Var.Y = i;
            int i2 = iQ - i;
            yt3Var.U = i2;
            int i3 = yt3Var.b0;
            if (i2 < i3) {
                yt3Var.U = i3;
            }
        }
        if (zt3Var.p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = ft3Var3.g;
        int iK = zt3Var.k() - ft3Var2.g;
        ft3Var3.i = d58Var.k(ft3Var3);
        ft3Var2.i = d58Var.k(ft3Var2);
        d58Var.d(ft3Var3.i, i4);
        d58Var.d(ft3Var2.i, iK);
        if (yt3Var.a0 > 0 || yt3Var.g0 == 8) {
            m6f m6fVarK = d58Var.k(ft3Var);
            ft3Var.i = m6fVarK;
            d58Var.d(m6fVarK, yt3Var.a0 + i4);
        }
        yt3Var.p = 2;
        yt3Var.Z = i4;
        int i5 = iK - i4;
        yt3Var.V = i5;
        int i6 = yt3Var.c0;
        if (i5 < i6) {
            yt3Var.V = i6;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void d(Exception exc, String str) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i <= bArr.length) {
            Iterable to7Var = new to7(0, bArr2.length - 1, 1);
            if (!(to7Var instanceof Collection) || !((Collection) to7Var).isEmpty()) {
                Iterator it = to7Var.iterator();
                while (((so7) it).c) {
                    int iNextInt = ((so7) it).nextInt();
                    if (bArr[i + iNextInt] != bArr2[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean f() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return il.d();
        }
        try {
            if (c == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = c;
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(b))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            d(e, "isTagEnabled");
            return false;
        }
    }

    public static final void g(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            il.f(i, h(str));
            return;
        }
        String strH = h(str);
        try {
            if (d == null) {
                d = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = d;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(b), strH, Integer.valueOf(i));
        } catch (Exception e) {
            d(e, "traceCounter");
        }
    }

    public static String h(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }
}
