package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class aq7 extends dtf implements sm6 {
    public final /* synthetic */ cm6 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq7(cm6 cm6Var, Continuation continuation) {
        super(2, continuation);
        this.X = cm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aq7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aq7 aq7Var = new aq7(this.X, continuation);
        aq7Var.o = obj;
        return aq7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        throw r5;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            defpackage.g8j.b(r5)
            java.lang.Object r5 = r4.o
            f84 r5 = (defpackage.f84) r5
            x74 r5 = r5.getCoroutineContext()
            cm6 r0 = r4.X
            t7g r1 = new t7g     // Catch: java.lang.InterruptedException -> L40
            r1.<init>()     // Catch: java.lang.InterruptedException -> L40
            qt7 r5 = defpackage.eoi.e(r5)     // Catch: java.lang.InterruptedException -> L40
            r2 = 1
            sy4 r5 = defpackage.eoi.i(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L40
            r1.c = r5     // Catch: java.lang.InterruptedException -> L40
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.t7g.d     // Catch: java.lang.InterruptedException -> L40
        L1f:
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L40
            if (r2 == 0) goto L31
            r5 = 2
            if (r2 == r5) goto L38
            r5 = 3
            if (r2 != r5) goto L2c
            goto L38
        L2c:
            defpackage.t7g.f(r2)     // Catch: java.lang.InterruptedException -> L40
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L40
        L31:
            r3 = 0
            boolean r2 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L40
            if (r2 == 0) goto L1f
        L38:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L42
            r1.e()     // Catch: java.lang.InterruptedException -> L40
            return r5
        L40:
            r5 = move-exception
            goto L47
        L42:
            r5 = move-exception
            r1.e()     // Catch: java.lang.InterruptedException -> L40
            throw r5     // Catch: java.lang.InterruptedException -> L40
        L47:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq7.n(java.lang.Object):java.lang.Object");
    }
}
