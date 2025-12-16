package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class u1 extends woi {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new t1());
        }
        try {
            c = unsafe.objectFieldOffset(x1.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(x1.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(x1.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(v1.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(v1.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.woi
    public final boolean a(x1 x1Var, g1 g1Var, g1 g1Var2) {
        return r1.a(a, x1Var, b, g1Var, g1Var2);
    }

    @Override // defpackage.woi
    public final boolean b(x1 x1Var, Object obj, Object obj2) {
        return s1.a(a, x1Var, d, obj, obj2);
    }

    @Override // defpackage.woi
    public final boolean c(x1 x1Var, v1 v1Var, v1 v1Var2) {
        return q1.a(a, x1Var, c, v1Var, v1Var2);
    }

    @Override // defpackage.woi
    public final g1 e(x1 x1Var) {
        g1 g1Var;
        g1 g1Var2 = g1.d;
        do {
            g1Var = x1Var.b;
            if (g1Var2 == g1Var) {
                break;
            }
        } while (!a(x1Var, g1Var, g1Var2));
        return g1Var;
    }

    @Override // defpackage.woi
    public final v1 f(x1 x1Var) {
        v1 v1Var;
        v1 v1Var2 = v1.c;
        do {
            v1Var = x1Var.c;
            if (v1Var2 == v1Var) {
                break;
            }
        } while (!c(x1Var, v1Var, v1Var2));
        return v1Var;
    }

    @Override // defpackage.woi
    public final void g(v1 v1Var, v1 v1Var2) {
        a.putObject(v1Var, f, v1Var2);
    }

    @Override // defpackage.woi
    public final void h(v1 v1Var, Thread thread) {
        a.putObject(v1Var, e, thread);
    }
}
