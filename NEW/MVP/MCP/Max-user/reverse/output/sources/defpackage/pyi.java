package defpackage;

import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* loaded from: classes.dex */
public abstract class pyi {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(ho7.f(i2, "at index "));
            }
        }
    }

    public static void b(sm6 sm6Var, Object obj, o0 o0Var) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(hni.f(hni.d(sm6Var, obj, o0Var)), qqg.a, null);
        } catch (Throwable th) {
            o0Var.resumeWith(new ipd(th));
            throw th;
        }
    }
}
