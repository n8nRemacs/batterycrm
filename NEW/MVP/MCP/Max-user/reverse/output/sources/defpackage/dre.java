package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dre extends dtf implements sm6 {
    public ere X;
    public int Y;
    public final /* synthetic */ ere Z;
    public ere o;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dre(ere ereVar, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ereVar;
        this.s0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dre) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dre(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (defpackage.ere.v(r2, r5) == r3) goto L25;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [ere, int] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.Y
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L26
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            ere r0 = r5.o
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            goto L5b
        L12:
            r6 = move-exception
            goto L51
        L14:
            r6 = move-exception
            goto L5e
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            ere r0 = r5.X
            ere r2 = r5.o
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            goto L43
        L26:
            defpackage.g8j.b(r6)
            ere r0 = r5.Z
            int r6 = r5.s0
            k18 r4 = r0.u0     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            ftg r4 = (defpackage.ftg) r4     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            r5.o = r0     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            r5.X = r0     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            r5.Y = r2     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            java.lang.Object r6 = r4.a(r6, r5)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            if (r6 != r3) goto L42
            goto L50
        L42:
            r2 = r0
        L43:
            r5.o = r0     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            r6 = 0
            r5.X = r6     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            r5.Y = r1     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            java.lang.Object r6 = defpackage.ere.v(r2, r5)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L14
            if (r6 != r3) goto L5b
        L50:
            return r3
        L51:
            java.lang.String r1 = r0.M0
            java.lang.String r2 = "updateWhoCanSearchMeByPhone fail"
            defpackage.wqi.p(r1, r2, r6)
            defpackage.ere.u(r0, r6)
        L5b:
            qqg r6 = defpackage.qqg.a
            return r6
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.n(java.lang.Object):java.lang.Object");
    }
}
