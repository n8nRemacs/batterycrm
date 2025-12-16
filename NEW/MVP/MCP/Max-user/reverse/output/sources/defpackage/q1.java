package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, v1 v1Var, v1 v1Var2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, v1Var, v1Var2)) {
            if (unsafe.getObject(x1Var, j) != v1Var) {
                return false;
            }
        }
        return true;
    }
}
