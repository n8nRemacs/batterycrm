package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class ey4 extends l2g {
    public int resumeMode;

    public ey4(int i) {
        super(0L, e3g.g);
        this.resumeMode = i;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        zk3 zk3Var = obj instanceof zk3 ? (zk3) obj : null;
        if (zk3Var != null) {
            return zk3Var.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            saj.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        b7j.c(getDelegate$kotlinx_coroutines_core().getContext(), new l84("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            qqg r0 = defpackage.qqg.a
            p2g r1 = r13.taskContext
            kotlin.coroutines.Continuation r2 = r13.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L20
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2     // Catch: java.lang.Throwable -> L20
            kotlin.coroutines.Continuation<T> r3 = r2.continuation     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.countOrElement     // Catch: java.lang.Throwable -> L20
            x74 r4 = r3.getContext()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)     // Catch: java.lang.Throwable -> L20
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L20
            r6 = 0
            if (r2 == r5) goto L23
            lqg r5 = defpackage.z6j.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r2 = move-exception
            goto L9e
        L23:
            r5 = r6
        L24:
            x74 r7 = r3.getContext()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r8 = r13.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L47
            java.lang.Throwable r9 = r13.getExceptionalResult$kotlinx_coroutines_core(r8)     // Catch: java.lang.Throwable -> L47
            if (r9 != 0) goto L49
            int r10 = r13.resumeMode     // Catch: java.lang.Throwable -> L47
            r11 = 1
            if (r10 == r11) goto L3c
            r12 = 2
            if (r10 != r12) goto L3b
            goto L3c
        L3b:
            r11 = 0
        L3c:
            if (r11 == 0) goto L49
            wha r10 = defpackage.wha.w0     // Catch: java.lang.Throwable -> L47
            v74 r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L47
            qt7 r7 = (defpackage.qt7) r7     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r3 = move-exception
            goto L92
        L49:
            r7 = r6
        L4a:
            if (r7 == 0) goto L62
            boolean r10 = r7.isActive()     // Catch: java.lang.Throwable -> L47
            if (r10 != 0) goto L62
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()     // Catch: java.lang.Throwable -> L47
            r13.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L47
            ipd r8 = new ipd     // Catch: java.lang.Throwable -> L47
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L47
            r3.resumeWith(r8)     // Catch: java.lang.Throwable -> L47
            goto L74
        L62:
            if (r9 == 0) goto L6d
            ipd r7 = new ipd     // Catch: java.lang.Throwable -> L47
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L47
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L47
            goto L74
        L6d:
            java.lang.Object r7 = r13.getSuccessfulResult$kotlinx_coroutines_core(r8)     // Catch: java.lang.Throwable -> L47
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L47
        L74:
            if (r5 == 0) goto L7c
            boolean r3 = r5.D()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L7f
        L7c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch: java.lang.Throwable -> L20
        L7f:
            r1.getClass()     // Catch: java.lang.Throwable -> L83
            goto L8a
        L83:
            r0 = move-exception
            ipd r1 = new ipd
            r1.<init>(r0)
            r0 = r1
        L8a:
            java.lang.Throwable r0 = defpackage.kpd.a(r0)
            r13.handleFatalException$kotlinx_coroutines_core(r6, r0)
            goto Lb0
        L92:
            if (r5 == 0) goto L9a
            boolean r5 = r5.D()     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L9d
        L9a:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch: java.lang.Throwable -> L20
        L9d:
            throw r3     // Catch: java.lang.Throwable -> L20
        L9e:
            r1.getClass()     // Catch: java.lang.Throwable -> La2
            goto La9
        La2:
            r0 = move-exception
            ipd r1 = new ipd
            r1.<init>(r0)
            r0 = r1
        La9:
            java.lang.Throwable r0 = defpackage.kpd.a(r0)
            r13.handleFatalException$kotlinx_coroutines_core(r2, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey4.run():void");
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
