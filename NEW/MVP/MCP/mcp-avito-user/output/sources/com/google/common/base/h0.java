package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Throwables.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @I41.a
    @XY0.c
    @XY0.d
    public static final Object f359046a;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @XY0.c
    @XY0.d
    public static final Method f359047b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @XY0.c
    @XY0.d
    public static final Method f359048c;

    static {
        Object objInvoke;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e12) {
            throw e12;
        } catch (Throwable unused) {
            objInvoke = null;
        }
        f359046a = objInvoke;
        if (objInvoke == null) {
            method = null;
        } else {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e13) {
                throw e13;
            } catch (Throwable unused2) {
            }
        }
        f359047b = method;
        if (objInvoke != null) {
            try {
                try {
                    method2 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e14) {
                    throw e14;
                } catch (Throwable unused3) {
                    method2 = null;
                }
                if (method2 != null) {
                    method2.invoke(objInvoke, new Throwable());
                    method3 = method2;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
        f359048c = method3;
    }

    public static void a(Throwable th2) {
        th2.getClass();
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
