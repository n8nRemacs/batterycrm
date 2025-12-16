package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, g1 g1Var, g1 g1Var2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, g1Var, g1Var2)) {
            if (unsafe.getObject(x1Var, j) != g1Var) {
                return false;
            }
        }
        return true;
    }
}
