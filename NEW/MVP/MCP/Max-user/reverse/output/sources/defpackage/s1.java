package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, obj, obj2)) {
            if (unsafe.getObject(x1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
