package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wqe extends dtf implements sm6 {
    public ere X;
    public boolean Y;
    public int Z;
    public ere o;
    public final /* synthetic */ ere s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqe(ere ereVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = ereVar;
        this.t0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wqe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wqe(this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:7:0x0012, B:30:0x0064), top: B:40:0x0012 }] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.Z
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L33
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            boolean r0 = r5.Y
            ere r1 = r5.X
            ere r2 = r5.o
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            goto L62
        L16:
            r6 = move-exception
            goto L80
        L19:
            r6 = move-exception
            goto L8d
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L24:
            boolean r0 = r5.Y
            ere r2 = r5.X
            ere r4 = r5.o
            defpackage.g8j.b(r6)     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L30
            r6 = r2
            r2 = r4
            goto L52
        L30:
            r6 = move-exception
            r1 = r2
            goto L80
        L33:
            defpackage.g8j.b(r6)
            ere r6 = r5.s0
            boolean r0 = r5.t0
            k18 r4 = r6.w0     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            java.lang.Object r4 = r4.getValue()     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            zsg r4 = (defpackage.zsg) r4     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.o = r6     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.X = r6     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.Y = r0     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.Z = r2     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            java.lang.Object r2 = r4.a(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            if (r2 != r3) goto L51
            goto L60
        L51:
            r2 = r6
        L52:
            r5.o = r2     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.X = r6     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.Y = r0     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            r5.Z = r1     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            java.lang.Object r1 = defpackage.ere.v(r2, r5)     // Catch: java.util.concurrent.CancellationException -> L19 java.lang.Throwable -> L7d
            if (r1 != r3) goto L61
        L60:
            return r3
        L61:
            r1 = r6
        L62:
            if (r0 == 0) goto L8a
            jve r6 = r2.O0     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            hme r6 = new hme     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            int r0 = defpackage.nbb.i     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            n5g r3 = new n5g     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            int r0 = defpackage.yud.W     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r2.A(r6)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            goto L8a
        L7d:
            r0 = move-exception
            r1 = r6
            r6 = r0
        L80:
            java.lang.String r0 = r1.M0
            java.lang.String r2 = "updateContentLevelAccess fail"
            defpackage.wqi.p(r0, r2, r6)
            defpackage.ere.u(r1, r6)
        L8a:
            qqg r6 = defpackage.qqg.a
            return r6
        L8d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqe.n(java.lang.Object):java.lang.Object");
    }
}
