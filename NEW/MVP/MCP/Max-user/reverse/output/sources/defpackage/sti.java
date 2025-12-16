package defpackage;

/* loaded from: classes.dex */
public abstract class sti {
    public static void a(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static boolean b(int i) {
        return (i & 32768) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.q44 r5) {
        /*
            x74 r0 = r5.getContext()
            defpackage.eoi.d(r0)
            kotlin.coroutines.Continuation r5 = defpackage.hni.f(r5)
            boolean r1 = r5 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
            goto L13
        L12:
            r5 = 0
        L13:
            g84 r1 = defpackage.g84.a
            qqg r2 = defpackage.qqg.a
            if (r5 != 0) goto L1b
        L19:
            r5 = r2
            goto L40
        L1b:
            z74 r3 = r5.dispatcher
            boolean r3 = r3.isDispatchNeeded(r0)
            if (r3 == 0) goto L27
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L3f
        L27:
            h7i r3 = new h7i
            syf r4 = defpackage.h7i.b
            r3.<init>(r4)
            x74 r0 = r0.plus(r3)
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            boolean r0 = r3.a
            if (r0 == 0) goto L3f
            boolean r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5)
            if (r5 == 0) goto L19
        L3f:
            r5 = r1
        L40:
            if (r5 != r1) goto L43
            return r5
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sti.c(q44):java.lang.Object");
    }
}
