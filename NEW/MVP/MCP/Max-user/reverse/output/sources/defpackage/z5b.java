package defpackage;

import java.lang.Thread;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z5b extends dtf implements sm6 {
    public dh4 X;
    public int Y;
    public final /* synthetic */ Throwable Z;
    public j9a o;
    public final /* synthetic */ dh4 s0;
    public final /* synthetic */ Thread.UncaughtExceptionHandler t0;
    public final /* synthetic */ Thread u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5b(Throwable th, dh4 dh4Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Continuation continuation) {
        super(2, continuation);
        this.Z = th;
        this.s0 = dh4Var;
        this.t0 = uncaughtExceptionHandler;
        this.u0 = thread;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((z5b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new z5b(this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [j9a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j9a] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r13.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            j9a r1 = r13.o
            defpackage.g8j.b(r14)     // Catch: java.lang.Throwable -> L15
            goto L6e
        L15:
            r0 = move-exception
        L16:
            r14 = r0
            goto L85
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            dh4 r2 = r13.X
            j9a r4 = r13.o
            defpackage.g8j.b(r14)
            r14 = r4
            goto L53
        L2a:
            defpackage.g8j.b(r14)
            java.lang.Throwable r11 = r13.Z
            l6b r6 = defpackage.wqi.a
            if (r6 != 0) goto L34
            goto L40
        L34:
            lg8 r7 = defpackage.lg8.Z
            r10 = 0
            r12 = 8
            java.lang.String r8 = "APP_CRASH"
            java.lang.String r9 = "!!! APP_CRASH !!!"
            defpackage.l6b.f(r6, r7, r8, r9, r10, r11, r12)
        L40:
            dh4 r2 = r13.s0
            java.lang.Object r14 = r2.d
            n9a r14 = (defpackage.n9a) r14
            r13.o = r14
            r13.X = r2
            r13.Y = r4
            java.lang.Object r4 = r14.e(r5, r13)
            if (r4 != r1) goto L53
            goto L6c
        L53:
            java.lang.Object r2 = r2.c     // Catch: java.lang.Throwable -> L72
            x9f r2 = (defpackage.x9f) r2     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L74
            r13.o = r14     // Catch: java.lang.Throwable -> L72
            r13.X = r5     // Catch: java.lang.Throwable -> L72
            r13.Y = r3     // Catch: java.lang.Throwable -> L72
            r2.cancel(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.join(r13)     // Catch: java.lang.Throwable -> L72
            if (r2 != r1) goto L69
            goto L6a
        L69:
            r2 = r0
        L6a:
            if (r2 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r1 = r14
        L6e:
            r14 = r1
            goto L74
        L70:
            r1 = r14
            goto L16
        L72:
            r0 = move-exception
            goto L70
        L74:
            n9a r14 = (defpackage.n9a) r14
            r14.g(r5)
            java.lang.Thread$UncaughtExceptionHandler r14 = r13.t0
            if (r14 == 0) goto L84
            java.lang.Thread r1 = r13.u0
            java.lang.Throwable r2 = r13.Z
            r14.uncaughtException(r1, r2)
        L84:
            return r0
        L85:
            n9a r1 = (defpackage.n9a) r1
            r1.g(r5)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5b.n(java.lang.Object):java.lang.Object");
    }
}
